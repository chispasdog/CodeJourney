import os
import platform
from PyQt6.QtWidgets import QMainWindow, QToolBar, QLabel, QDockWidget, QTextEdit, QApplication, QMessageBox
from PyQt6.QtGui import QAction, QIcon, QKeySequence
from PyQt6.QtCore import Qt

class VentanaPrincipal(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Ventana principal con menú, barra de herramientas y barra de estado')

        barra_menus = self.menuBar()
        menu = barra_menus.addMenu('Menú')
        ruta_a_icono = os.path.join(os.path.dirname(__file__), "console-log-icon.png")
        accion = QAction(QIcon(ruta_a_icono), "Imprimir en dock", self)
        accion.setWhatsThis("Al pulsar sobre el botón se imprimirá un texto en el dock")
        accion.setStatusTip("Imprimir en dock")
        accion.setShortcut(QKeySequence("Ctrl+P"))
        accion.triggered.connect(self.imprimir_en_dock)
        menu.addAction(accion)


        barra_herramientas = QToolBar("Barra de herramientas 1")
        barra_herramientas.addAction(accion)
        self.addToolBar(barra_herramientas)

        barra_estado = self.statusBar()
        barra_estado.addPermanentWidget(QLabel(platform.system()))
        barra_estado.showMessage("Listo. Esperando acción ...", 3000)
        
        
        
        
        dock1 = QDockWidget()
        dock1.setWindowTitle("Componente base 1")
        dock1.setWidget(QTextEdit(""))
        dock1.setMinimumWidth(50)
        self.addDockWidget(Qt.DockWidgetArea.TopDockWidgetArea, dock1)
        self.setCentralWidget(QLabel("Componente principal"))

    def imprimir_en_dock(self):
        print("Acción lanzada a través del menú, del atajo o de la barra de herramientas")

if __name__ == "__main__":
    app = QApplication([])
    ventana1 = VentanaPrincipal()
    ventana1.show()
    app.exec()

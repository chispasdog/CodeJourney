import os
import platform
from PySide6.QtWidgets import QMainWindow, QToolBar, QLabel, QDockWidget, QTextEdit, QApplication, QMessageBox, QWhatsThis
from PySide6.QtGui import QAction, QIcon, QKeySequence
from PySide6.QtCore import Qt

class VentanaPrincipal(QMainWindow):
    def __init__(self): #inicializar los atributos o configuracion inicial
        super().__init__() #llamada al constructor de la clase padre
        self.inicial()

    def inicial(self):
        self.setWindowTitle('Editor de texto plano')
        #ruta donde está el archivo vacio
        self.ruta = "C:\\Users\\pablo\\Desktop\\github\\untitled\\python\\practicasinterfaces\\ejer\\archivo.txt"
        #recoger texto del editor
        self.texto = QTextEdit(self)
        self.setCentralWidget(self.texto)

        #crear acciones
        self.crearAcciones()
        #crear menus
        self.crearMenus()
        #crear barra de estado
        self.crearBarraHerramientas()
    
    def crearAcciones(self):
        #accion arbrir fichero
        ruta_a_icono = os.path.join(os.path.dirname(__file__), "file-open-outline_.png")
        self.accion_abrir = QAction(QIcon(ruta_a_icono), "Abrir archivo", self)
        self.accion_abrir.setWhatsThis("Al pulsar sobre el botón se abrirá un archivo")
        self.accion_abrir.setStatusTip("Abrir archivo")
        self.accion_abrir.setShortcut(QKeySequence("Ctrl+O"))
        self.accion_abrir.triggered.connect(self.abrir_archivo)
        
        #accion guardar fichero
        ruta_a_icono = os.path.join(os.path.dirname(__file__), "save-outline_.png")
        self.accion_guardar = QAction(QIcon(ruta_a_icono), "guardar archivo", self)
        self.accion_guardar.setWhatsThis("Al pulsar sobre el botón se guardará un archivo")
        self.accion_guardar.setStatusTip("Guardar archivo")
        self.accion_guardar.setShortcut(QKeySequence("Ctrl+S"))
        self.accion_guardar.triggered.connect(self.guardar_archivo)

        #salir
        ruta_a_icono = os.path.join(os.path.dirname(__file__), "console-log-icon.png")
        self.accion_salir = QAction(QIcon(ruta_a_icono), "salir", self)
        self.accion_salir.setShortcut(QKeySequence("Ctrl+q"))
        self.accion_salir.triggered.connect(self.close)

    def crearMenus(self):
        barra_menus = self.menuBar()
        menu = barra_menus.addMenu('Menú')
        menu.addAction(self.accion_abrir)
        menu.addAction(self.accion_guardar)
        menu.addAction(self.accion_salir)
    
    def crearBarraHerramientas(self):
        barra_herramientas = QToolBar("Barra de herramientas")
        barra_herramientas.setToolButtonStyle(Qt.ToolButtonTextUnderIcon)
        barra_herramientas.addAction(self.accion_abrir)
        barra_herramientas.addAction(self.accion_guardar)
        self.addToolBar(Qt.ToolBarArea.TopToolBarArea, barra_herramientas)

    #Funcion para abrir el archivo
    def abrir_archivo(self):
        #si existe, lo abrimos
        with open (self.ruta, 'r') as f:
            fichero_texto = f.read()
            self.texto.setText(fichero_texto)

    def guardar_archivo(self):
        with open (self.ruta, "w") as f:
            f.write(self.texto.toPlainText())

if __name__ == "__main__":
    app = QApplication([])
    ventana = VentanaPrincipal()
    ventana.show()
    app.exec()
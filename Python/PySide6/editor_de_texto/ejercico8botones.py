import os
import platform
from PySide6.QtWidgets import QMainWindow, QToolBar, QLabel, QDockWidget, QTextEdit, QApplication, QMessageBox, QStackedWidget
from PySide6.QtGui import QAction, QIcon, QKeySequence
from PySide6.QtCore import Qt

class VentanaPrincipal(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Ventana principal con menú, barra de herramientas y barra de estado')
        self.ruta = "C:\\Users\\usersw\\Desktop\\CodeJourney\\Python\\PySide6\\editor_de_texto\\archivo.txt"
       
      
        #recoger texto del editor
        #self.texto = QTextEdit()
        #self.setCentralWidget(self.texto)
        
        
        
        
        barra_menus = self.menuBar()
        menu = barra_menus.addMenu('Menú')
        
        

        #boton nuevo
        ruta_a_icono1 = os.path.join(os.path.dirname(__file__), "new-file_.png")  
        btn_nuevo = QAction(QIcon(ruta_a_icono1), "nuevo", self)
        btn_nuevo.setStatusTip("nuevo")
        btn_nuevo.setShortcut(QKeySequence("Ctrl+N"))
        btn_nuevo.triggered.connect(self.abrir_en_dock)
        menu.addAction(btn_nuevo)
        
        #boton abrir
        ruta_a_icono2 = os.path.join(os.path.dirname(__file__), "file-open-outline-sharp_.png")   
        btn_abrir = QAction(QIcon(ruta_a_icono2), "abrir", self)
        btn_abrir.setStatusTip("abrir")
        btn_abrir.setShortcut(QKeySequence("Ctrl+R"))
        btn_abrir.triggered.connect(self.funcion_btnabrir)
        menu.addAction(btn_abrir)
        
        #boton guardar
        ruta_a_icono3 = os.path.join(os.path.dirname(__file__), "file-save-sharp_.png") 
        btn_guardar = QAction(QIcon(ruta_a_icono3), "guardar", self)
        btn_guardar.setStatusTip("guardar")
        btn_guardar.setShortcut(QKeySequence("Ctrl+N"))
        btn_guardar.triggered.connect(self.funcion_btnguardar)
        menu.addAction(btn_guardar)
        
        #boton desacher
        ruta_a_icono4 = os.path.join(os.path.dirname(__file__), "undo_.png")  
        btn_desacher = QAction(QIcon(ruta_a_icono4), "desacher", self)
        btn_desacher.setStatusTip("desacher")
        btn_desacher.setShortcut(QKeySequence("Ctrl+D"))
        btn_desacher.triggered.connect(self.funcion_btndesacher)
        menu.addAction(btn_desacher)
        
        #boton reacer
        ruta_a_icono5 = os.path.join(os.path.dirname(__file__), "redo_.png")  
        btn_reacer = QAction(QIcon(ruta_a_icono5), "reacer", self)
        btn_reacer.setStatusTip("reacer")
        btn_reacer.setShortcut(QKeySequence("Ctrl+T"))
        btn_reacer.triggered.connect(self.funcion_btnreacer)
        menu.addAction(btn_reacer)
        
        #boton cortar
        ruta_a_icono6 = os.path.join(os.path.dirname(__file__), "cut_.png")  
        btn_cortar = QAction(QIcon(ruta_a_icono6), "cortar", self)
        btn_cortar.setStatusTip("cortar")
        btn_cortar.setShortcut(QKeySequence("Ctrl+O"))
        btn_cortar.triggered.connect(self.funcion_btncortar)
        menu.addAction(btn_cortar)
        
        #boton copiar
        ruta_a_icono7 = os.path.join(os.path.dirname(__file__), "copy_.png")  
        btn_copiar = QAction(QIcon(ruta_a_icono7), "copiar", self)
        btn_copiar.setStatusTip("copiar")
        btn_copiar.setShortcut(QKeySequence("Ctrl+K"))
        btn_copiar.triggered.connect(self.funcion_btncopiar)
        menu.addAction(btn_copiar)
        
        #boton pegar
        ruta_a_icono8 = os.path.join(os.path.dirname(__file__), "paste_.png") 
        btn_pegar = QAction(QIcon(ruta_a_icono8), "pegar", self)
        btn_pegar.setStatusTip("pegar")
        btn_pegar.setShortcut(QKeySequence("Ctrl+J"))
        btn_pegar.triggered.connect(self.funcion_btnpegar)
        menu.addAction(btn_pegar)
        
        

        barra_herramientas = QToolBar("Barra de herramientas 1")
        barra_herramientas.setToolButtonStyle(Qt.ToolButtonTextUnderIcon)
        barra_herramientas.addAction(btn_nuevo)
        barra_herramientas.addAction(btn_abrir)
        barra_herramientas.addAction(btn_guardar)
        barra_herramientas.addAction(btn_desacher)
        barra_herramientas.addAction(btn_reacer)
        barra_herramientas.addAction(btn_cortar)
        barra_herramientas.addAction(btn_copiar)
        barra_herramientas.addAction(btn_pegar)
        self.addToolBar(barra_herramientas)

        barra_estado = self.statusBar()
        barra_estado.addPermanentWidget(QLabel(platform.system()))
        barra_estado.showMessage("Listo. Esperando acción ...", 3000)

        dock1 = QDockWidget()
        dock1.setWindowTitle("Componente base 1")
        self.texto = QTextEdit()
        dock1.setWidget(self.texto)
        dock1.setMinimumWidth(50)
        self.addDockWidget(Qt.DockWidgetArea.TopDockWidgetArea, dock1)
        #self.setCentralWidget(QLabel("Componente principal"))
        
    def abrir_en_dock(self):
        print("haram")
        
        
    def funcion_btnabrir(self):
        #with open (self.ruta, 'r+') as f:
            f= open (self.ruta, "r+") 
            #fichero_texto = f.read()
            self.texto.setPlainText(f.read())
            
        

    def funcion_btnguardar(self):
        with open (self.ruta, "w") as f:
            f.write(self.texto.toPlainText())
       
   
    def funcion_btndesacher(self):
        self.texto.undo()

    def funcion_btnreacer(self):
        self.texto.redo()

    def funcion_btncortar(self):
        self.texto.cut()

    def funcion_btncopiar(self):
        self.texto.copy()

    def funcion_btnpegar(self):
        self.texto.paste()
    
       
      
if __name__ == "__main__":
    app = QApplication([])
    ventana1 = VentanaPrincipal()
    ventana1.show()
    app.exec()

import os
from PySide6.QtWidgets import QApplication, QWidget, QLineEdit, QPushButton, QVBoxLayout
from PySide6.QtGui import QIcon


class IntroducirClave(QWidget):
    def __init__(self):
        super().__init__()

        #ruta a las imagenes
        self.imagenMostrar = os.path.join(os.path.dirname(__file__), "visible.png")
        self.imagenOcultar = os.path.join(os.path.dirname(__file__), "hidden.png")

        # le metemo contraseña
        self.clave = QLineEdit(self)
        self.clave.setEchoMode(QLineEdit.EchoMode.Password)

        # Crear el botón para cambiar la vista de la contra
        self.boton = QPushButton(self)
        self.boton.setIcon(QIcon(self.imagenMostrar))
        self.boton.clicked.connect(self.focusOutEvent)

        
        layout = QVBoxLayout(self)
        layout.addWidget(self.clave)
        layout.addWidget(self.boton)
        
     #metodo para combiar las fotos y el echomode
    def focusOutEvent(self, event): super().focusOutEvent(event)

# fuera del componente y llamado
            
app = QApplication([])
ventana = IntroducirClave()
ventana.show()
app.exec()
from PySide6.QtWidgets import QApplication, QWidget, QLineEdit, QLabel
 
class Ventana(QWidget):

 
    def __init__(self):
        super().__init__()
        self.fuera = QLineEdit (self)
        
        self.externo = QLabel (self)
        
        self.fuera.setMaxLength(5)
        
        self.fuera.setFixedSize(50,30)
        
        self.externo.setFixedSize(50,30)
        
        self.externo.move(50,0)
        
        self.fuera.textChanged.connect(self.imprimir)
        

 
    def imprimir (self , strg):
        self.externo.setText(strg)
 
if __name__ == "__main__":
    app = QApplication([])
    ventana = Ventana()
    ventana.show()
    app.exec()
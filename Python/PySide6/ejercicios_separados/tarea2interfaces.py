from PySide6.QtWidgets import QApplication, QWidget, QComboBox, QLabel

class Ventana(QWidget):
    def __init__(self):
        super().__init__()
        
        self.combo = QComboBox(self)
        self.combo.addItems(["Opción 1", "Opción 2", "Opción 3"])   
        
        self.label = QLabel(self)
        
        self.combo.setFixedSize(100, 30)
        self.label.setFixedSize(100, 30)
        self.label.move(110, 0)   
        
        self.combo.currentTextChanged.connect(self.actualizarTexto)
        
    def actualizarTexto(self, texto):
        self.label.setText(texto)

if __name__ == "__main__":
    app = QApplication([])
    ventana = Ventana()
    ventana.show()
    app.exec()

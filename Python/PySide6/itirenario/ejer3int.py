
from PySide6.QtWidgets import QApplication, QWidget, QVBoxLayout, QComboBox, QLabel

class MainWindow(QWidget):
    def __init__(self):
        super().__init__()
        self.init_ui()

    def init_ui(self):
        self.layout = QVBoxLayout(self)

        self.label = QLabel(self)
        self.label.setText("Seleccione un mes:")
        self.layout.addWidget(self.label)

        self.combo_box = QComboBox(self)
        self.months = [
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        ]
        self.combo_box.addItems(self.months)
        self.combo_box.currentIndexChanged.connect(self.on_month_change)
        self.layout.addWidget(self.combo_box)

        self.setWindowTitle("ComboBox con Meses")
        self.show()

    def on_month_change(self, index):
        selected_month = self.months[index]
        month_index = index + 1
        print(f"El numero del mes es: {month_index} - {selected_month}")

if __name__ == '__main__':
    app = QApplication([])
    ex = MainWindow()
    app.exec()

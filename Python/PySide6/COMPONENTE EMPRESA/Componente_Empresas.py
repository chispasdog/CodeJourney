from PySide6.QtWidgets import (QWidget, QVBoxLayout, QHBoxLayout, QLabel, QScrollArea, QSpacerItem, QSizePolicy, QApplication)
from PySide6.QtCore import Qt, Signal

class PanelEmpresa(QWidget):
    dobleClicEmpresa = Signal(str)

    def __init__(self, nombreEmpresa, parent=None):
        super().__init__(parent)
        self.nombreEmpresa = nombreEmpresa
        self.crearInterfaz()

    def crearInterfaz(self):
        layout = QHBoxLayout()
        self.etiqueta = QLabel(self.nombreEmpresa)
        layout.addWidget(self.etiqueta)
        self.setLayout(layout)

    def mouseDoubleClickEvent(self, event):
        if event.button() == Qt.LeftButton:
            self.dobleClicEmpresa.emit(self.nombreEmpresa)


class CatalogoEmpresas(QWidget):
    def __init__(self, listaNombresEmpresas, parent=None):
        super().__init__(parent)
        self.crearInterfaz(listaNombresEmpresas)

    def crearInterfaz(self, listaNombresEmpresas):
        layout = QVBoxLayout(self)
        
        self.areaDesplazamiento = QScrollArea(self)
        self.areaDesplazamiento.setWidgetResizable(True)
        contenedorScroll = QWidget()

        layoutScroll = QVBoxLayout(contenedorScroll)
        
        for nombre in listaNombresEmpresas:
            widgetEmpresa = PanelEmpresa(nombre)
            widgetEmpresa.dobleClicEmpresa.connect(self.alDobleClicEmpresa)
            layoutScroll.addWidget(widgetEmpresa)
        
        espacioFinal = QSpacerItem(20, 40, QSizePolicy.Minimum, QSizePolicy.Expanding)
        layoutScroll.addItem(espacioFinal)

        self.areaDesplazamiento.setWidget(contenedorScroll)
        layout.addWidget(self.areaDesplazamiento)

    def alDobleClicEmpresa(self, nombreEmpresa):
        print(f"Empresa {nombreEmpresa} le dieron al click dos veces")


if __name__ == '__main__':
    import sys

    aplicacion = QApplication(sys.argv)
    nombresEmpresas = ['Empresa A', 'Empresa B', 'Empresa C']
    ventanaPrincipal = CatalogoEmpresas(nombresEmpresas)
    ventanaPrincipal.show()
    sys.exit(aplicacion.exec())

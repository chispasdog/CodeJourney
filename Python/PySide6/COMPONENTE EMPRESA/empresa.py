from PySide6.QtWidgets import QWidget, QLabel, QVBoxLayout, QApplication, QScrollArea
from PySide6.QtCore import Signal, Qt
from PySide6.QtGui import QPixmap
import sys

class Compania(QWidget):
    dobleClickCompania = Signal(str, str, str)

    def __init__(self, imagenLogo, titulo, ubicacion):
        super().__init__()
        self.imagenLogo = imagenLogo
        self.titulo = titulo
        self.ubicacion = ubicacion

        self.etiquetaLogo = QLabel()
        self.etiquetaLogo.setPixmap(QPixmap(self.imagenLogo))
        self.etiquetaTitulo = QLabel(self.titulo)
        self.etiquetaUbicacion = QLabel(self.ubicacion)
        
        disposicion = QVBoxLayout()
        disposicion.addWidget(self.etiquetaLogo)
        disposicion.addWidget(self.etiquetaTitulo)
        disposicion.addWidget(self.etiquetaUbicacion)
        self.setLayout(disposicion)
    
    def mouseDoubleClickEvent(self, evento):
            self.dobleClickCompania.emit(self.imagenLogo, self.titulo, self.ubicacion)
    
class Empresas(QWidget):
    dobleClickEmpresa = Signal(str, str, str)

    def __init__(self, lista_empresas, ruta_logo_comun):
        super().__init__()
        self.lista_empresas = lista_empresas
        self.ruta_logo_comun = ruta_logo_comun

        self.layoutPrincipal = QVBoxLayout()
        self.areaDesplazamiento = QScrollArea()
        self.contenedor = QWidget()
        self.layoutEmpresas = QVBoxLayout()

        for titulo, ubicacion in self.lista_empresas:
            compania = Compania(self.ruta_logo_comun, titulo, ubicacion)
            compania.dobleClickCompania.connect(self.emitirDobleClickEmpresa)
            self.layoutEmpresas.addWidget(compania)

        self.contenedor.setLayout(self.layoutEmpresas)
        self.areaDesplazamiento.setWidgetResizable(True)
        self.areaDesplazamiento.setWidget(self.contenedor)

        self.layoutPrincipal.addWidget(self.areaDesplazamiento)
        self.setLayout(self.layoutPrincipal)

    def emitirDobleClickEmpresa(self, imagenLogo, titulo, ubicacion):
        self.dobleClickEmpresa.emit(imagenLogo, titulo, ubicacion)

if __name__ == "__main__":
    aplicacion = QApplication(sys.argv)
    ruta_logo_comun = 'C:/Users/pablo/Desktop/github/untitled/python/practicasinterfaces/COMPONENTE EMPRESA/hidden.png'
    lista_empresas = [
        ('Empresa1', 'Ubicacion1'),
        ('Empresa2', 'Ubicacion2'),
        # ... más empresas
    ]
    empresas = Empresas(lista_empresas, ruta_logo_comun)
    
    empresas.dobleClickEmpresa.connect(lambda imagenLogo, titulo, ubicacion: print(f'{titulo}, {ubicacion}'))
    empresas.show()
    sys.exit(aplicacion.exec())

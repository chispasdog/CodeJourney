CREATE TABLE Departamentos (
    DepartamentoID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Ubicacion VARCHAR(255)
);

-- Tabla de Empleados
CREATE TABLE Empleados (
    EmpleadoID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255) NOT NULL,
    DepartamentoID INT,
    FechaContratacion DATE,
    Email VARCHAR(255),
    FOREIGN KEY (DepartamentoID) REFERENCES Departamentos(DepartamentoID)
);

-- Tabla de Proyectos
CREATE TABLE Proyectos (
    ProyectoID INT PRIMARY KEY AUTO_INCREMENT,
    NombreProyecto VARCHAR(255) NOT NULL,
    FechaInicio DATE,
    FechaFin DATE,
    DepartamentoID INT,
    FOREIGN KEY (DepartamentoID) REFERENCES Departamentos(DepartamentoID)
);

-- Tabla de AsignacionProyectos (Relación muchos a muchos entre Empleados y Proyectos)
CREATE TABLE AsignacionProyectos (
    EmpleadoID INT,
    ProyectoID INT,
    HorasAsignadas INT,
    PRIMARY KEY (EmpleadoID, ProyectoID),
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID),
    FOREIGN KEY (ProyectoID) REFERENCES Proyectos(ProyectoID)
);

-- Tabla de Clientes
CREATE TABLE Clientes (
    ClienteID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Email VARCHAR(255),
    Telefono VARCHAR(255)
);

-- Tabla de Ventas
CREATE TABLE Ventas (
    VentaID INT PRIMARY KEY AUTO_INCREMENT,
    FechaVenta DATE NOT NULL,
    ClienteID INT,
    EmpleadoID INT,
    Monto DECIMAL(10,2),
    FOREIGN KEY (ClienteID) REFERENCES Clientes(ClienteID),
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID)
);

-- Tabla de Productos
CREATE TABLE Productos (
    ProductoID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion TEXT,
    Precio DECIMAL(10,2) NOT NULL,
    Stock INT NOT NULL
);

-- Tabla de Ordenes de Compra
CREATE TABLE OrdenesCompra (
    OrdenCompraID INT PRIMARY KEY AUTO_INCREMENT,
    FechaOrden DATE NOT NULL,
    ClienteID INT,
    Estado VARCHAR(255),
    FOREIGN KEY (ClienteID) REFERENCES Clientes(ClienteID)
);

-- Tabla Detalles de Orden de Compra (Relación muchos a muchos entre OrdenesCompra y Productos)
CREATE TABLE DetallesOrdenCompra (
    OrdenCompraID INT,
    ProductoID INT,
    Cantidad INT NOT NULL,
    Precio DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (OrdenCompraID, ProductoID),
    FOREIGN KEY (OrdenCompraID) REFERENCES OrdenesCompra(OrdenCompraID),
    FOREIGN KEY (ProductoID) REFERENCES Productos(ProductoID)
);

-- Tabla de Facturas
CREATE TABLE Facturas (
    FacturaID INT PRIMARY KEY AUTO_INCREMENT,
    OrdenCompraID INT,
    FechaFactura DATE NOT NULL,
    Total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (OrdenCompraID) REFERENCES OrdenesCompra(OrdenCompraID)
);

-- Tabla de Pagos
CREATE TABLE Pagos (
    PagoID INT PRIMARY KEY AUTO_INCREMENT,
    FacturaID INT,
    FechaPago DATE NOT NULL,
    Monto DECIMAL(10,2) NOT NULL,
    MetodoPago VARCHAR(255),
    FOREIGN KEY (FacturaID) REFERENCES Facturas(FacturaID)
);

-- Tabla de Proveedores
CREATE TABLE Proveedores (
    ProveedorID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Email VARCHAR(255),
    Telefono VARCHAR(255)
);

-- Tabla de Compras a Proveedores
CREATE TABLE ComprasProveedores (
    CompraID INT PRIMARY KEY AUTO_INCREMENT,
    ProveedorID INT,
    FechaCompra DATE NOT NULL,
    MontoTotal DECIMAL(10,2),
    FOREIGN KEY (ProveedorID) REFERENCES Proveedores(ProveedorID)
);

-- Tabla de Inventario
CREATE TABLE Inventario (
    InventarioID INT PRIMARY KEY AUTO_INCREMENT,
    ProductoID INT,
    Cantidad INT,
    Ubicacion VARCHAR(255),
    FOREIGN KEY (ProductoID) REFERENCES Productos(ProductoID)
);

------------------------------------------------------------------------------------------------------------------------------------------------------------
 

CREATE TABLE Roles (
    RolID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion TEXT
);

CREATE TABLE Horarios (
    HorarioID INT PRIMARY KEY AUTO_INCREMENT,
    EmpleadoID INT,
    DiaSemana VARCHAR(255) NOT NULL,
    HoraEntrada TIME,
    HoraSalida TIME,
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID)
);

CREATE TABLE Evaluaciones (
    EvaluacionID INT PRIMARY KEY AUTO_INCREMENT,
    EmpleadoID INT,
    FechaEvaluacion DATE NOT NULL,
    Puntuacion INT,
    Comentarios TEXT,
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID)
);

CREATE TABLE Asistencias (
    AsistenciaID INT PRIMARY KEY AUTO_INCREMENT,
    EmpleadoID INT,
    Fecha DATE NOT NULL,
    Estado VARCHAR(255) NOT NULL,
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID)
);

CREATE TABLE Reuniones (
    ReunionID INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(255) NOT NULL,
    FechaHoraInicio DATETIME NOT NULL,
    FechaHoraFin DATETIME NOT NULL,
    Ubicacion VARCHAR(255) NOT NULL
);

CREATE TABLE ParticipantesReunion (
    ReunionID INT,
    EmpleadoID INT,
    PRIMARY KEY (ReunionID, EmpleadoID),
    FOREIGN KEY (ReunionID) REFERENCES Reuniones(ReunionID),
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID)
);

CREATE TABLE RecursosProyecto (
    RecursoID INT PRIMARY KEY AUTO_INCREMENT,
    ProyectoID INT,
    Nombre VARCHAR(255) NOT NULL,
    Tipo VARCHAR(255) NOT NULL,
    FOREIGN KEY (ProyectoID) REFERENCES Proyectos(ProyectoID)
);

CREATE TABLE Gastos (
    GastoID INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(255) NOT NULL,
    Monto DECIMAL(10,2) NOT NULL,
    FechaGasto DATE NOT NULL,
    Categoria VARCHAR(255)
);

CREATE TABLE Beneficios (
    BeneficioID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion TEXT
);

CREATE TABLE EmpleadosBeneficios (
    EmpleadoID INT,
    BeneficioID INT,
    FechaAsignacion DATE NOT NULL,
    PRIMARY KEY (EmpleadoID, BeneficioID),
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID),
    FOREIGN KEY (BeneficioID) REFERENCES Beneficios(BeneficioID)
);


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE Actividades (
    ActividadID INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(255) NOT NULL,
    Descripcion TEXT,
    Tipo VARCHAR(255) NOT NULL,
    FechaInicio DATETIME,
    FechaFin DATETIME,
    EmpleadoID INT,
    ProyectoID INT,
    DepartamentoID INT,
    ClienteID INT,
    ProveedorID INT,
    ReunionID INT,
    GastoID INT,
    OrdenCompraID INT,
    FacturaID INT,
    PagoID INT,
    HorarioID INT,
    EvaluacionID INT,
    Estado VARCHAR(255),
    Comentarios TEXT,
    FOREIGN KEY (EmpleadoID) REFERENCES Empleados(EmpleadoID),
    FOREIGN KEY (ProyectoID) REFERENCES Proyectos(ProyectoID),
    FOREIGN KEY (DepartamentoID) REFERENCES Departamentos(DepartamentoID),
    FOREIGN KEY (ClienteID) REFERENCES Clientes(ClienteID),
    FOREIGN KEY (ProveedorID) REFERENCES Proveedores(ProveedorID),
    FOREIGN KEY (ReunionID) REFERENCES Reuniones(ReunionID),
    FOREIGN KEY (GastoID) REFERENCES Gastos(GastoID),
    FOREIGN KEY (OrdenCompraID) REFERENCES OrdenesCompra(OrdenCompraID),
    FOREIGN KEY (FacturaID) REFERENCES Facturas(FacturaID),
    FOREIGN KEY (PagoID) REFERENCES Pagos(PagoID),
    FOREIGN KEY (HorarioID) REFERENCES Horarios(HorarioID),
    FOREIGN KEY (EvaluacionID) REFERENCES Evaluaciones(EvaluacionID)
);


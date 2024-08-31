
-- 2. Gestión de ventas
-- Se requiere gestionar la información de comerciales, clientes y pedidos realizados por los clientes a los comerciales.

-- Creación de tabla comerciales
CREATE TABLE comerciales (
    id_comercial NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    apellido1 VARCHAR2(100) NOT NULL,
    apellido2 VARCHAR2(100) NOT NULL,
    ciudad VARCHAR2(100) NOT NULL,
    comision NUMBER(10,2) NOT NULL
);

-- Creación de tabla clientes
CREATE TABLE clientes (
    id_cliente NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    apellido1 VARCHAR2(100) NOT NULL,
    apellido2 VARCHAR2(100) NOT NULL,
    ciudad VARCHAR2(100) NOT NULL,
    categoria NUMBER(10) NOT NULL
);

-- Creación de tabla pedidos
CREATE TABLE pedidos (
    id_pedido NUMBER(10) PRIMARY KEY,
    cantidad NUMBER(10,2) NOT NULL,
    fecha DATE NOT NULL,
    id_cliente NUMBER(10) NOT NULL,
    id_comercial NUMBER(10) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_comercial) REFERENCES comerciales(id_comercial)
);
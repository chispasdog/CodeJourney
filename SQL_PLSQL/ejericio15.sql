
-- 2. Crear tablas PERSONAS y PROVINCIAS
CREATE TABLE PERSONAS (
    dni VARCHAR2(9) PRIMARY KEY,
    nombre VARCHAR2(50),
    direccion VARCHAR2(100),
    poblacion VARCHAR2(50),
    codigoprovincia VARCHAR2(2)
);

CREATE TABLE PROVINCIAS (
    codigoprovincia VARCHAR2(2) PRIMARY KEY,
    nombreprovincia VARCHAR2(50)
);

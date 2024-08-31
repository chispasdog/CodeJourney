


-- 8. Crear tabla TIENDAS y añadir restricciones
CREATE TABLE TIENDAS (
    NIF VARCHAR2(9) PRIMARY KEY,
    nombre VARCHAR2(30) NOT NULL,
    direccion VARCHAR2(100),
    poblacion VARCHAR2(50),
    provincia VARCHAR2(50) CHECK (provincia = UPPER(provincia)),
    codpostal VARCHAR2(5)
);
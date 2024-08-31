
-- 4. Piezas y Proveedores
CREATE TABLE PIEZA (
    codigo INT PRIMARY KEY,
    nombre VARCHAR2(100)
);

CREATE TABLE PROVEEDOR (
    id VARCHAR2(4) PRIMARY KEY,
    nombre VARCHAR2(100)
);

CREATE TABLE SUMINISTRA (
    codigopieza INT,
    idproveedor VARCHAR2(4),
    precio INT,
    PRIMARY KEY (codigopieza, idproveedor),
    CONSTRAINT codigopieza_fk FOREIGN KEY (codigopieza) REFERENCES PIEZA(codigo),
    CONSTRAINT idproveedor_fk FOREIGN KEY (idproveedor) REFERENCES PROVEEDOR(id)
);
CREATE TABLE departamentos (
    id_departamento NUMBER(10),
    nombre VARCHAR2(100),
    CONSTRAINT lepe PRIMARY KEY (id_departamento)
);

CREATE TABLE Empleado (
    NUMEMPLEADO NUMBER(4),
    NOMBRE VARCHAR2(10),
    APELLIDO VARCHAR2(10),
    id_departamento NUMBER(10),
    CONSTRAINT clavepl PRIMARY KEY (NUMEMPLEADO),
    CONSTRAINT fk_departamento FOREIGN KEY (id_departamento)
        REFERENCES departamentos(id_departamento)
);
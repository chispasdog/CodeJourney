

-- UT3.2_CreateTableBasicos
-- 1. Gestión de empleados
-- En una empresa necesitamos realizar la gestión de empleados, asociando cada empleado a su departamento correspondiente.
-- Se requiere almacenar la información de empleados y departamentos.

-- Creación de tabla empleados
CREATE TABLE empleados (
    codigo_empleado NUMBER(10) PRIMARY KEY,
    dni NUMBER(9) NOT NULL,
    nombre VARCHAR2(100) NOT NULL,
    primer_apellido VARCHAR2,
    segundo_apellido VARCHAR2,
    codigo_departamento NUMBER NOT NULL,
    FOREIGN KEY (codigo_departamento) REFERENCES departamentos(codigo_departamento)
);

-- Creación de tabla departamentos
CREATE TABLE departamentos (
    codigo_departamento NUMBER PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    presupuesto NUMBER(10,2) NOT NULL
);

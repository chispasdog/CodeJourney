

-- 9. Crear tabla EMPLEADOS y añadir restricciones
CREATE TABLE EMPLEADOS (
    Cod_Empleado VARCHAR(5) PRIMARY KEY,
    Nombre VARCHAR(10),
    Apellidos VARCHAR(25) UNIQUE,
    Sueldo NUMBER(2) CHECK (Sueldo BETWEEN 1000 AND 1200)
);


-- 9. Consulta para seleccionar DNI, nombre, apellidos, salario y el salario incrementado un 10% de cada trabajador, ordenado por salario descendente
SELECT DNI, nombre, apellido1, salario, (SALARIO * 1.1) AS salarios_mas_diezporciento FROM EMPLEADOS ORDER BY salario DESC;

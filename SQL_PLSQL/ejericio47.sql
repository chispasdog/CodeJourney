
-- 11. Consulta de empleado de mayor antigüedad en la empresa
SELECT * FROM EMP 
WHERE FECHA_ALTA = (SELECT MIN(FECHA_ALTA) FROM EMP);

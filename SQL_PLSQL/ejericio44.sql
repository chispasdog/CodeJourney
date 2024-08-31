
-- 8. Consulta de empleados contratados en diciembre o septiembre con comisión nula
SELECT Apellido, FechaContratacion, Salario FROM Empleados WHERE (TO_CHAR(FechaContratacion, 'MM') = '12' OR TO_CHAR(FechaContratacion, 'MM') = '09') AND Comision IS NULL ORDER BY FechaContratacion, Apellido, Salario DESC;

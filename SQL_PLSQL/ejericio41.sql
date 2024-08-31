

-- 5. Consulta de empleados vendedores con salario entre 1500 y 1600
SELECT Apellido, Salario, Oficio FROM Empleados WHERE Oficio = 'VENDEDOR' AND Salario BETWEEN 1500 AND 1600;

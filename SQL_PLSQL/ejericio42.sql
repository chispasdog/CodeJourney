

-- 6. Consulta de empleados vendedores o analistas no pertenecientes al departamento 30
SELECT E.Apellido, E.NumDepto, E.NumEmpleado 
FROM Empleados E 
INNER JOIN Departamentos D 
ON E.NumDepto = D.NumDepto 
WHERE (Oficio = 'VENDEDOR' OR Oficio = 'ANALISTA') AND D.NumDepto != 30;

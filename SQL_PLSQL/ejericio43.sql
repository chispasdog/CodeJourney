
-- 7. Consulta de empleados vendedores o analistas no pertenecientes al departamento 30 y sin 'N' en el apellido
SELECT E.Apellido, E.NumDepto, E.NumEmpleado FROM Empleados E INNER JOIN Departamentos D ON E.NumDepto = D.NumDepto WHERE (Oficio = 'VENDEDOR' OR Oficio = 'ANALISTA') AND D.NumDepto != 30 AND E.Apellido NOT LIKE '%N%';

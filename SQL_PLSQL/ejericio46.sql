


-- 10. Consulta de empleados que no sean analistas, vendedores ni directores
SELECT * FROM EMP 
WHERE OFICIO 
NOT IN ('ANALISTA', 'VENDEDOR', 'DIRECTOR');

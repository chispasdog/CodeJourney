
-- 14. Consulta de la media de salario por departamento
SELECT NUMDEPARTAMENTO, AVG(SALARIO) 
FROM EMP GROUP BY NUMDEPARTAMENTO;

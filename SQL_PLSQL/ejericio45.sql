
-- 9. Consulta de salario, comisión y total para empleados con comisión no nula
SELECT APELLIDO, SALARIO, COMM, (SALARIO + COMM) AS TOTAL FROM EMP WHERE COMM IS NOT NULL ORDER BY TOTAL DESC;

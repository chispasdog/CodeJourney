
-- 6. Consulta para obtener el salario medio de los empleados por sexo
SELECT sexo, AVG(salario) FROM empleados GROUP BY sexo;


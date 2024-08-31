


-- 11. Añadir restricción a EMPLE
ALTER TABLE EMPLE ADD CONSTRAINT salario_mayor0 CHECK (salario > 0);

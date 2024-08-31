

-- 13. Añadir restricción NOT NULL a comisión en EMPLE
ALTER TABLE EMPLE ADD CONSTRAINT comision_notnull CHECK (comision IS NOT NULL);

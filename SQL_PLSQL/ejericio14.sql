
-- UT3.4_CreateTableIII
-- 1. Crear tabla BLOQUEPISOS
CREATE TABLE BLOQUEPISOS (
    calle VARCHAR2(30),
    numero VARCHAR2(3),
    piso VARCHAR2(2),
    puerta VARCHAR2(1),
    Codigo_Postal VARCHAR2(5),
    metros VARCHAR2(5),
    comentarios VARCHAR2(60),
    codigo_Zona VARCHAR2(2),
    dni_Propietario VARCHAR2(10),
    CONSTRAINT IDENTIFICADOR_pk PRIMARY KEY (calle, numero, piso)
);



-- 5. Científicos y Proyectos
CREATE TABLE CIENTIFICO (
    dni VARCHAR2(8) PRIMARY KEY NOT NULL,
    nom_apels VARCHAR2(255)
);

CREATE TABLE PROYECTO (
    id VARCHAR2(4) PRIMARY KEY NOT NULL,
    nombre VARCHAR2(255),
    horas INT
);

CREATE TABLE ASIGNADO_A (
    cientifico VARCHAR2(8),
    proyecto VARCHAR2(4),
    PRIMARY KEY (cientifico, proyecto),
    CONSTRAINT cientifico_fk FOREIGN KEY (cientifico) REFERENCES CIENTIFICO(dni),
    CONSTRAINT proyecto_fk FOREIGN KEY (proyecto) REFERENCES PROYECTO(id)
);

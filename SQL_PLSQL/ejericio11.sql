-- 3. Directores y Películas
CREATE TABLE despacho (
  numero INT PRIMARY KEY,
  capacidad INT
);

CREATE TABLE director (
  dni VARCHAR2(8) PRIMARY KEY,
  dnijefe VARCHAR2(8),
  despacho INT,
  CONSTRAINT dni_fk FOREIGN KEY (dnijefe) REFERENCES director(dni),
  CONSTRAINT despacho_fk FOREIGN KEY (despacho) REFERENCES despacho(numero)
);
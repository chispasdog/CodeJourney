-- 2. Películas y Salas
CREATE TABLE pelicula (
  codigo INT PRIMARY KEY,
  nombre NVARCHAR2(100),
  clasificacion_edad INT
);

CREATE TABLE sala (
  codigo INT PRIMARY KEY,
  nombre NVARCHAR2(100),
  pelicula INT,
  CONSTRAINT nombrepeli_fk FOREIGN KEY (pelicula) REFERENCES pelicula(codigo)
);

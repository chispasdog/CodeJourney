

-- UT3.3_CreateTableBasicosII

-- Ejercicios Create Table II

-- 1. Almacenes y Cajas
CREATE TABLE almacen (
  codigo INT PRIMARY KEY,
  lugar NVARCHAR2(100),
  capacidad INT
);

CREATE TABLE caja (
  numeroreferencia VARCHAR2(5) PRIMARY KEY,
  contenido NVARCHAR2(100),
  valor INT,
  almacen INT,
  CONSTRAINT numeroalmacen_fk FOREIGN KEY (almacen) REFERENCES almacen(codigo)
);

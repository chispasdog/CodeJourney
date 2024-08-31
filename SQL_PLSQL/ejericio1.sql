/* Una FOREIGN KEY o clave foránea en Oracle es una restricción que se usa para relacionar una columna o conjunto de columnas de una tabla con las columnas de otra tabla, asegurando que los datos en ambas tablas sean coherentes. La clave foránea se establece en la tabla secundaria y hace referencia a la clave primaria de la tabla principal.

Por ejemplo, supongamos que deseamos crear dos tablas llamadas "pedidos" y "clientes", donde cada pedido pertenece a un cliente en particular. Para lograr esto, necesitamos establecer una relación entre las tablas utilizando una clave foránea en la tabla "pedidos". Podemos hacerlo utilizando el siguiente código:

*/
CREATE TABLE clientes (
    id_cliente NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    apellido1 VARCHAR2(100) NOT NULL,
    apellido2 VARCHAR2(100) NOT NULL,
    ciudad VARCHAR2(100) NOT NULL,
    categoria NUMBER(10) NOT NULL
);

CREATE TABLE pedidos (
    id_pedido NUMBER(10) PRIMARY KEY,
    cantidad NUMBER(10,2) NOT NULL,
    fecha DATE NOT NULL,
    id_cliente NUMBER(10) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);
/*En este ejemplo, creamos la tabla "clientes" con una clave primaria "id_cliente" y luego creamos la tabla "pedidos" con una clave primaria "id_pedido" y una columna "id_cliente" que hace referencia a la clave primaria "id_cliente" de la tabla "clientes" utilizando una clave foránea.

Al establecer esta relación, cada pedido en la tabla "pedidos" está vinculado a un cliente en particular en la tabla "clientes", asegurando que los datos en ambas tablas sean coherentes y consistentes.
*/
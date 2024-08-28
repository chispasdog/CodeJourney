function saludar(nombre){
    return `hola ${nombre}`
}


console.log(saludar("carlos"))

/*
function Inventario(nombre){
    this.nombre=nombre;
    this.articulo=[];
}

Inventario.prototype.getNombre =function(){ false()
    return this.nombre;
}

Inventario.prototype.add=function(articulo, cantidad){false()
    this.articulo[articulo] = cantidad;
}

Inventario.prototype.cantidad = function(articulo) {
    return this.articulos[articulo]
}


let libros = new Inventario('libros');
libros.getNombre()
libros.add("Aprendiendo java",5);

libros.cantidad('Aprendiendo java');

*/

class Inventario {
    constructor(nombre) {
        this.nombre = nombre;
        this.articulos = {};  
    }

    getNombre() {
        return this.nombre;
    }

    add(articulo, cantidad) {
        this.articulos[articulo] = cantidad;
    }

    cantidad(articulo) {
        return this.articulos[articulo];
    }
}

let libros = new Inventario('libros');
console.log(libros.getNombre());  
libros.add("Aprendiendo Java", 5);

console.log(libros.cantidad('Aprendiendo Java')); 
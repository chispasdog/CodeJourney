
let dato = 5;

let nombre="elvira";

console.log(nombre);

console.log("hola mundo");


let x =1;

let y =++2;
// return "hola " + nombre + "!"

function saludar(nombre){
    return 'hola ${nombre}!'
   
}





//clase antigua

function Persona(nombre){
    this.nombre;
    this.articulos = [];
}
Persona.prototype.getnombre = function() { 
    return this.nombre;
}


Persona.prototype.add = function(articulo, cantidad) { 
    this.articulos[articulo] = cantidad;

}

Persona.prototype.cantidad = function(articulo) { 
   return this.articulos[articulo]

}

let juan = new Persona("juan");

juan.getnombre
juan.add("aprendiendo java", 5);
juan.cantidad("aprendiendo java");







//clase nueva
class Inventario{
    constructor(nombre){
        this.nombre= nombre;
        this.articulo = []
    }

    getnombre(){
        return this.nombre;
    }

    add(articulo, cantidad){
        this.articulos[articulo] = cantidad;
    }
    cantidad (articulo) { 
        return this.articulos[articulo]
    }

}
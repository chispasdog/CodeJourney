


//while

let condicion = 1;

while (condicion < 11){
    console.log(condicion);
    condicion++;
}


function buclewhile (num){
    let i =0
    while(i < num){
        console.log(i); 
        i++;
    }

}


console.log(buclewhile(11));





//do while
let e=1;

do {
    console.log(e);
    e++;
} while (e<10);



//for

let x = 1;
let num = 10;

for (let x = 0; x < num; x++) {
   console.log(x)
    
}




// array

const array1 = [];

array1[0] = "1";
array1[1]= "2";



const miarray = new Array[10];

//for each

const miarray2 = [1,2,3,4,5];
miarray2.forEach(function(item,index){
    console.log("el valor" + index + " es : " + item);
})




//obgeto
const libro = {
    titulo: "Aprendiendo JavaScript",
    autor: "Carlos Azaustre",
    numPaginas: 100,
    editorial: "carlosazaustre.es",
    precio: "24.90",
    leer: function(){
        console.log("ley mucho")
    }
}

libro.titulo;
libro["numPaginas"];
libro.titulo= "nuevo titulos";


let libro2 = new Object;

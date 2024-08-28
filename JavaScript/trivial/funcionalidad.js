document.addEventListener("DOMContentLoaded", function () {
    mostrarpreguntas();
    document.getElementById("restart-btn").addEventListener("click", function () {
        location.reload();
    }, false);
});

let preguntasUsadas = [];
let puntacion = 0;
let totalPreguntas = 10;
/**
 tengo un codigo que es un cuestionario de ingles y quiero pasarte unas palabras con significados en español-ingles y quiro que me devuelvas la palabra con el siguiente formato aqui un ejemplo si yo te paso "a : to, toward, towards"  quiero que me devuelvas "{ pregunta: "¿que significa to?", opciones: ["a", "por", "ellos", "hice"], correcta: "a" },
{ pregunta: "¿que significa toward?", opciones: ["desacer", "guardar", "avenida", "(a,hacia)"], correcta: "(a,hacia)" },
{ pregunta: "¿que significa towards?", opciones: ["vosotros", "desde","(a,hacia)" , "torre"], correcta: "(a,hacia)" },
" y tambien puede que te pase listas asi Friend : Amigo y tu tendras que formular el formato anterior mente comentado 
asi que una vez entendido te paso una lista para que me devuelvas el formato que te pido
 */
let arraypreguntas = [
    { "pregunta": "¿Qué significa to?", "opciones": ["a", "por", "ellos", "hice"], "correcta": "a" },
    { "pregunta": "¿Qué significa toward?", "opciones": ["desacer", "guardar", "avenida", "(a,hacia)"], "correcta": "(a,hacia)" },
    { "pregunta": "¿Qué significa towards?", "opciones": ["vosotros", "desde", "(a,hacia)", "torre"], "correcta": "(a,hacia)" },
    { "pregunta": "¿Qué significa shipboard?", "opciones": ["cubierta", "navio", "a bordo", "marino"], "correcta": "a bordo" },
    { "pregunta": "¿Qué significa aboard?", "opciones": ["costa", "a bordo", "desembarco", "arriba"], "correcta": "a bordo" },
    { "pregunta": "¿Qué significa horseback?", "opciones": ["silla", "a caballo", "equino", "galope"], "correcta": "a caballo" },
    { "pregunta": "¿Qué significa cross−country?", "opciones": ["carrera", "campo a través", "a campo través", "nacional"], "correcta": "a campo través" },
    { "pregunta": "¿Qué significa short−term?", "opciones": ["largo plazo", "breve", "corto plazo", "a corto plazo"], "correcta": "a corto plazo" },
    { "pregunta": "¿Qué significa piggyback?", "opciones": ["a cuestas", "sobre hombros", "cargar", "lomo"], "correcta": "a cuestas" },
    { "pregunta": "¿Qué significa hereto?", "opciones": ["aquí", "allí", "a esto", "acerca de"], "correcta": "a esto" },
    { "pregunta": "¿Qué significa astride?", "opciones": ["a horcajadas", "montar", "cabalgar", "encima"], "correcta": "a horcajadas" },
    { "pregunta": "¿Qué significa adrift?", "opciones": ["flotando", "a la deriva", "sin rumbo", "náufrago"], "correcta": "a la deriva" },
    { "pregunta": "¿Qué significa unsheltered?", "opciones": ["protegido", "a la intemperie", "descubierto", "expuesto"], "correcta": "a la intemperie" },
    { "pregunta": "¿Qué significa modish?", "opciones": ["a la moda", "elegante", "pasado", "clásico"], "correcta": "a la moda" },
    { "pregunta": "¿Qué significa at the same time?", "opciones": ["simultáneamente", "juntos", "a la vez", "a la vez"], "correcta": "a la vez" },
    { "pregunta": "¿Qué significa together?", "opciones": ["separados", "solos", "a la vez", "conjunto"], "correcta": "a la vez" },
    { "pregunta": "¿Qué significa long−term?", "opciones": ["breve", "a largo plazo", "temporal", "inmediato"], "correcta": "a largo plazo" },
    { "pregunta": "¿Qué significa lengthwise?", "opciones": ["ancho", "corto", "a lo largo", "largo"], "correcta": "a lo largo" },
    { "pregunta": "¿Qué significa along?", "opciones": ["a lo largo de", "junto a", "contra", "cerca"], "correcta": "a lo largo de" },
    { "pregunta": "¿Qué significa alongside?", "opciones": ["debajo", "a lo largo de", "opuesto", "al lado"], "correcta": "a lo largo de" },
    { "pregunta": "¿Qué significa alongshore?", "opciones": ["a lo largo de la costa", "costa adentro", "mar adentro", "orilla"], "correcta": "a lo largo de la costa" },
    { "pregunta": "¿Qué significa perhaps?", "opciones": ["quizás", "seguro", "a lo mejor", "definitivamente"], "correcta": "a lo mejor" },
    { "pregunta": "¿Qué significa maybe?", "opciones": ["nunca", "siempre", "posiblemente", "a lo mejor"], "correcta": "a lo mejor" },
    { "pregunta": "¿Qué significa halfway?", "opciones": ["comienzo", "total", "a medio camino", "final"], "correcta": "a medio camino" },
    { "pregunta": "¿Qué significa unless?", "opciones": ["a menos que", "hasta que", "durante", "después"], "correcta": "a menos que" },
    { "pregunta": "¿Qué significa offen?", "opciones": ["a menudo", "raramente", "nunca", "siempre"], "correcta": "a menudo" },
    { "pregunta": "¿Qué significa often?", "opciones": ["a menudo", "ocasionalmente", "una vez", "siempre"], "correcta": "a menudo" },
];

function mostrarpreguntas() {
    if (preguntasUsadas.length < totalPreguntas && preguntasUsadas.length < arraypreguntas.length) {
        let indiceAleatorio;
        do {
            indiceAleatorio = Math.floor(Math.random() * arraypreguntas.length);
        } while (preguntasUsadas.includes(indiceAleatorio));
        preguntasUsadas.push(indiceAleatorio);
        
        const preguntaactual = arraypreguntas[indiceAleatorio].pregunta;
        document.getElementById("question-title").textContent = preguntaactual;
        mostrarrespuesta(indiceAleatorio);
        mostrarpuntuacion();
    } else {
        document.getElementById("question-title").textContent = "Juego terminado!";
        document.getElementById("options-container").innerHTML = "Tu puntuación final es: " + puntacion;
    }
}

function mostrarpuntuacion() {
    document.getElementById("score-text").textContent = "Puntuación: " + puntacion;
}

function corregit(event) {
    const respuestaSeleccionada = event.target;
    const preguntaIndex = preguntasUsadas[preguntasUsadas.length - 1];
    const correcta = arraypreguntas[preguntaIndex].correcta;
    
    document.querySelectorAll('.option').forEach(opt => {
        opt.style.backgroundColor = '#f4f4f4'; // Reset color
        if (opt.textContent == correcta) {
            opt.style.backgroundColor = 'green'; // Highlight correct answer
        }
    });

    if (respuestaSeleccionada.textContent == correcta) {
        puntacion++;
        setTimeout(() => {
            mostrarpreguntas();
        }, 100); // Wait 1 second before showing the next question if correct
    } else {
        setTimeout(() => {
            mostrarpreguntas();
        }, 2000); // Wait 2 seconds before showing the next question if incorrect
    }
}


function mostrarrespuesta(indiceAleatorio) {
    const opcionesContainer = document.getElementById("options-container");
    opcionesContainer.innerHTML = "";
    const respuestasactuales = arraypreguntas[indiceAleatorio].opciones;
    const ul = document.createElement("ul");
    respuestasactuales.forEach(function (element) {
        const li = document.createElement("li");
        li.textContent = element;
        li.classList.add("option");
        li.addEventListener("click", corregit, false);
        ul.appendChild(li);
    });
    opcionesContainer.appendChild(ul);
}

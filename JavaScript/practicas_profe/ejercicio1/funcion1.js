function enviarform(){
    const elinput = document.getElementById("input_nombre").value; //no entiendo proque hay que .vlaue y text content no funciona aqui
    console.log(document.getElementById("input_nombre").value);  

    const elemento_li = document.createElement("li");
    elemento_li.textContent = elinput;
    const lista = document.getElementById("elul");
    lista.appendChild(elemento_li);
}
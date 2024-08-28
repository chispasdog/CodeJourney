function enviarform(){
    const elinput = document.getElementById("input_nombre").value; //no entiendo proque hay que .vlaue y text content no funciona aqui
    console.log(document.getElementById("input_nombre").value);  
    const elemt_tr = document.createElement("tr");
    const elemt_td = document.createElement("td");
    const element_table = document.getElementById("tabla");
    elemt_td.textContent = elinput;
    element_table.appendChild(elemt_tr)
    elemt_tr.appendChild(elemt_td);



    const elemt_td2 = document.createElement("td");
    //ahora el resultado del la conversion
    let Fahrenheit_value = convertir(parseFloat(elinput))

    elemt_td2.textContent = Fahrenheit_value.toFixed(2)

    elemt_tr.appendChild(elemt_td2)  

    function convertir(valor){
        return (((valor-32) * 5)/9)
    }
}
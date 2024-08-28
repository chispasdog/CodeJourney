contador=0;
function printdiv() {
    contador++;
    if(contador%2 ===0){
        const divelement = document.getElementById("div").style.backgroundColor = 'red';
        
    }else{
        const divelement = document.getElementById("div").style.backgroundColor = 'blue';  
    }
}

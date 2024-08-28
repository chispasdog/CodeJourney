document.addEventListener("DOMContentLoaded", printNumbers);

function printNumbers() {
    const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    const listElement = document.getElementById("the_ul");
    
    for (let index = 0; index < numbers.length; index++) {
     
        const number = numbers[index]; //esta parte del codigo la tuve que consultar


        const item = document.createElement("li");
        item.textContent = number;
        
        
        if (number % 2 === 0) {
            item.style.color = "#0000FF";  
        } else {
            item.style.color = "#FF0000";  
        }
        
        listElement.appendChild(item);
    
    }
}

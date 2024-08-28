  
    function sumar(a,b){
        let resultado= a + b;
       return resultado
       }
     

       function multiplicar(a,b){
        let resultado= a * b;
        return resultado
       }
     
       function dividir(a,b){
        let resultado= a / b;
        return resultado
       }
     
       function restar(a,b){
        let resultado= a - b;
        return resultado
       }
     
       function porcentaje(a,b){
        let resultado= (a * b)/100;
        return resultado
       }

        function validar_numeros(a,b){
            if(a<0 || b<0){
                return false
            }
            if(isNaN(a)|| isNaN(b)){
              return false
            }

            return true
        }  

        
        function calcular(){
            let num1 = parseInt(document.getElementById("numero1").value);
            let num2 = parseInt(document.getElementById("numero2").value);
        
            if (validar_numeros(num1, num2)) {
                let resultadoSuma = sumar(num1, num2);
                let resultadoMultiplicar = multiplicar(num1, num2);
                let resultadoDividir = dividir(num1, num2);
                let resultadoRestar = restar(num1, num2);
                let resultadoPorcentaje = porcentaje(num1, num2);
                imprimir(resultadoSuma, resultadoMultiplicar, resultadoDividir, resultadoRestar, resultadoPorcentaje);
            }
        }
        


        function imprimir(sumar,multiplicar,dividir,restar,porcentaje){
            document.getElementById("resultado").innerHTML= "Suma: " + sumar + "<br>"
            + "Resta: " + restar + "<br>"
            + "Producto: " + multiplicar + "<br>"
            + "División: " + dividir.toFixed(2) + "<br>"
            + "Porcentaje: " + porcentaje.toFixed(2) + "%";

        }

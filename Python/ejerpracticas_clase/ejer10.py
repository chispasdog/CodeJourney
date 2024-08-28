 
#Ejercicio 10: Crea el juego de adivinar un número.
# El número es generado aleatoriamente y el usuario debe intentar adivinarlo. Dependiendo del número introducido,
# el programa deberá indicar si el número es mayor o menor que el número a adivinar.


import random


numeroaleatorio= random.randint(0,100)
numerointroducido=0

while True:
    
    numerointroducido=int(input("que numero cress que es?"))
    
    if(numeroaleatorio==numerointroducido):
        print("has acertado")
        break
    elif(numerointroducido<numeroaleatorio):
        print("el numero es mas grande ")
    else:
        print("el numero es mas pequeño")

 
#Ejercicio 9: Solicita números al usuario hasta que introduzca un -1.
# Luego, muestra: • El número más alto introducido • El número más bajo introducido
# • La suma de todos los números • La suma de todos los números positivos •
# La suma de todos los números negativos • La media de todos los números El -1 no cuenta como número.


numeros = []
num = 0


while num != -1:
    num = int(input("Introduce un número (o -1 para terminar): "))
    if num != -1:
        numeros.append(num)
        
 
 
 
maximo = max(numeros)
minimo = min(numeros)
suma_total = sum(numeros)
suma_positivos = sum(n for n in numeros if n > 0)
suma_negativos = sum(n for n in numeros if n < 0)
media = suma_total / len(numeros)
print("Número más alto:", maximo)
print("Número más bajo:", minimo)
print("Suma total:", suma_total)
print("Suma de positivos:", suma_positivos)
print("Suma de negativos:", suma_negativos)
print("Media:", media)
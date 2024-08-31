# Ejercicio 1: Bart Simpson tiene que escribir 10 veces "Hoy me voy a portar bien en clase".

for i in range(10):
    print("Hoy me voy a portar bien en clase")

# Ejercicio 2: Mostrar los números del 1 al 100.
for i in range(100):
    counter= i+1
    print(counter)

# Ejercicio 3: Mostrar los números de 5 en 5 hasta el 100.

for i in range(5, 101, 5):
    print(i)


# Ejercicio 4: Mostrar los números del 10 al 1.

for i in range(10,0,-1):
    print(i)

# Ejercicio 5: Tabla de multiplicar de un número que se pregunta al usuario.

numer2o= int(input(print("que numero quieres:")))
for i in range(11):
    number=i*numer2o
    print(number)

# Ejercicio 6: Preguntar números y sumarlos hasta que se introduzca un cero.
suma=0
while True:
    numero22 = int(input("Introduce un número (0 para terminar): "))
    if numero22==0:
        break
    suma += numero22
    print("suma: "+ suma)


# Ejercicio 7: Calcular el factorial de un número.

numero = int(input("Introduce un número para calcular su factorial: "))
factorial = 1
for i in range(1, numero + 1):
    factorial *= i
print("Factorial:", factorial)


# Ejercicio 8: Preguntar cinco números y mostrar un mensaje si alguno es negativo.

for i in range(6):
    numero=int(input("que numero quieres meter"))
    if numero < 0:
        print("has metido uno negativo")


# Ejercicio 9: Preguntar números hasta que se introduzca un cero y decir cuál es el máximo.








# Ejercicios con listas y bucles

# Ejercicio 1: Preguntar 4 números al usuario y añadirlos a una lista. Mostrar la lista al final.


lista = []
for i in range(4):
    numero = int(input("Introduce un número: "))
    lista.append(numero)
print("Lista:", lista)




# Ejercicio 2: Preguntar números hasta que el usuario escriba un 0 y añadirlos a una lista.


lista = []
while True:
    numero = int(input("Introduce un número (0 para terminar): "))
    if numero == 0:
        break
    lista.append(numero)
print("Lista:", lista)




# Ejercicio 3: Añadir al ejercicio anterior la suma de todos los elementos de la lista.

suma = sum(lista)
print(suma)


# Ejercicio 4: Multiplicación de todos los elementos de una lista.
listahram= [1,2,62,4]
counter=1
for i in listahram:
    counter*=i
    
    
print(counter)



 
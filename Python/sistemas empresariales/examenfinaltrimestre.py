# ejercicio13

edades = [34, 25, 32, 48, 120]  
suma = 0
contador = 0

for edad in edades:
    if 10 < edad < 60:
        suma += edad
        contador += 1

media = suma / contador if contador > 0 else 0
print("Suma:", suma)
print("Media:", media)




# ejercicio14

palabra = input("Escribe una palabra: ")
letras_separads = " ".join(palabra)
print(letras_separads)




# ejercicio15

numeros = [34, 25, 32, 48, 120]   
maximo = max(numeros)
minimo = min(numeros)
print("numero grande:", maximo)
print("numero mas pequeno:", minimo)




# ejercicio16

edades = {"Antonio": 29, "María": 19, "Roberto": 21}

nombre = input("Introduce un nombre: ")
edad = int(input("Introduce la edad: "))

edades[nombre] = edad

print("Dactualizado:", edades)


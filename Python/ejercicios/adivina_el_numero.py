import random

# Generamos un número aleatorio entre 1 y 10 y lo almacenamos en numero_aleatorio
numero_aleatorio = random.uniform(1, 10)

# Convertimos a entero para simplificar la adivinanza
numero_aleatorio = int(numero_aleatorio)

# Creamos una variable para almacenar la adivinanza del usuario
adivinanza = None

# Usamos un bucle while para repetir la pregunta hasta que el usuario acierte
while adivinanza != numero_aleatorio:
    # Solicitamos al usuario que ingrese su adivinanza
    adivinanza = input("Adivina el número aleatorio entre 1 y 10: ")
    
    # Intentamos convertir la adivinanza a entero
    try:
        adivinanza = int(adivinanza)
    except ValueError:
        # Si hay un error en la conversión (por ejemplo, si no es un número), informamos y seguimos preguntando
        print("Por favor, ingresa un número válido.")
        continue

    # Comparamos la adivinanza del usuario con el número aleatorio
    if adivinanza == numero_aleatorio:
        print("¡Felicidades! Adivinaste el número.")
    else:
        print("Ese no es el número, intenta de nuevo.")

print("El juego ha terminado.")

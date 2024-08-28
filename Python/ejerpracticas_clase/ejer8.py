#Ejercicio 8: Pide al usuario que introduzca dos números.
# Muestra todos los números entre ellos (incluyéndolos).
# Repite este proceso usando un bucle hasta que uno de los dos números sea -1.
 
 
numero1 = int(input("Introduce el primer número a de ser menor de -1: "))
numero2 = int(input("Introduce el segundo número a de ser mayor de 1: "))

if numero1<=-1 or numero2 <=1:
    print(" los numero no son correctos")
    

for n in range(numero1,numero2+1):
    print(n)
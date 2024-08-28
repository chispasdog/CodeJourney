#Ejercicio 4: Muestra los números del 1 al 100 (ambos incluidos) 
# que son divisibles tanto por 2 como por 3. Usa el bucle que prefieras.

for n in range(1,101):
    if n % 2 !=0 and n % 3 !=0:
        print(n)
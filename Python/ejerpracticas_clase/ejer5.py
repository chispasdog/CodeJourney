#Ejercicio 5: Solicita al usuario el número de
# ventas que va a introducir. Luego, pide esa cantidad 
# de ventas y al final muestra la suma de todas ellas.

numero_ventas= int(input("cuantas ventas?:"))

suma_ventas = 0

for num in range(numero_ventas):
    
    precio_ventas=int(input(" que precio tiene este venta?:"))
    suma_ventas+=precio_ventas
    
    
print("el dinero total es= "+str(suma_ventas))
#Ejercicio 1: Solicita al usuario la siguiente información y 
# almacénala en las variables 
# correspondientes: • Nombre • Edad • Calle • Ciudad • Sexo ('H', 'M')
print("mete tu nombre")
nombre=input()

edad= int(input("mete tu edad"))
 

calle= input("metet tu calle:")

print("metete tu ciudad:")
ciudad=input()


print("Métete tu sexo:")
while True:
    sexo = input()
    if sexo.upper() in ["M", "H"]:
        break
    else:
        print("Por favor, ingresa 'M' para masculino o 'H' para femenino.")
        


print("el nombre es " + nombre+ " la edad: "+str(edad)+" la calle "+calle+" ciudad: "+ ciudad + " sexo:"+ sexo)
#Ejercicio 7: Usa dos variables acumuladoras para almacenar 
# la suma de todos los números pares y la suma de todos los 
# números impares desde el 1 hasta el 100.


valpar=0
valinpar=0

 
for n in range(1, 101):
    if n % 2 == 0:  
        valpar += n
    else:   
        valinpar += n
    
print("los valores par: "+ str(valpar)+ " val inpar  " + str(valinpar))
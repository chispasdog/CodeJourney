# 1. Partiendo de una lista como [36, 25, 32, 48, 127] indica la cantidad de números que
#son múltiplos de 3 y 4 simultáneamente. El programa debe funcionar
#independientemente de la longitud que tenga la lista de números.

milista = [36, 25, 32, 48, 127]

def contar_multiplos(lista):
    contador = 0
    for i in lista:
        if i % 3 == 0 and i % 4 == 0:
            contador += 1
    return contador

cantidad_multiplos = contar_multiplos(milista)
print(cantidad_multiplos)




#En las siguientes listas tenemos los nombres de los rivales en los partidos de España
#en el Mundial en la fase de grupos, los goles que ha marcado España en cada
#partido y los goles que han marcado los rivales:
#a. rivales=["Costa Rica", "Alemania", "Japón"]
#b. golesAFavor=[7, 1, 2]
#4
#c. golesEnContra=[0,1, 0] #El resultado del partido contra Japón solo es un
#pronóstico
#Crea un programa que indique lo siguiente teniendo en cuenta los valores de las
#listas anteriores (El programa debe seguir funcionando correctamente si los datos
#cambian o se amplían):
#● Partidos jugados
#● Partidos ganados
#● Partidos empatados
#● Partidos perdidos
#● Goles a favor
#● Goles en contra
#● Diferencia de goles
#● Puntos totales conseguidos por España.
#● NOTA: Por cada partido ganado se consiguen 3 puntos, por cada partido
#empatado 1 punto y por cada partido perdido 0 puntos.
#● NOTA2: Por si alguien no lo tiene claro, en fútbol gana el equipo que mete
#más goles. En caso de que los dos equipos consigan los mismos goles, se
#produce un empate.


rivales=["Costa Rica", "Alemania", "Japón"]
golesAFavor=[7, 1, 2]
golesEnContra=[0,1, 0]



partidos_jugados = len(rivales)
partidos_ganados = 0
partidos_empatados = 0
partidos_perdidos = 0
goles_favor = sum(golesAFavor)
goles_contra = sum(golesEnContra)
puntos_totales = 0


for i in range(partidos_jugados):
    if golesAFavor[i] > golesEnContra[i]:
        partidos_ganados += 1
        puntos_totales += 3
    elif golesAFavor[i] == golesEnContra[i]:
        partidos_empatados += 1
        puntos_totales += 1
    else:
        partidos_perdidos += 1
        
        
diferencia_goles = goles_favor - goles_contra


print("Partidos jugados:", partidos_jugados)
print("Partidos ganados:", partidos_ganados)
print("Partidos empatados:", partidos_empatados)
print("Partidos perdidos:", partidos_perdidos)
print("Goles a favor:", goles_favor)
print("Goles en contra:", goles_contra)
print("Diferencia de goles:", diferencia_goles)
print("Puntos totales:", puntos_totales)



# En el siguiente diccionario tienes una lista de países y capitales. Crea un programa
#que pregunte al usuario el nombre de un país y después el de su capital y lo añada al
#diccionario:
#a. capitales={"España":"Madrid", "Italia":"Roma", "Francia":"París"}
#Después debe mostrar lo siguiente usando el diccionario:
#● Madrid capital de España
#● Roma capital de Italia
#● París capital de Francia


capitales = {"España": "Madrid", "Italia": "Roma", "Francia": "París"}

while True:
    pais = input("Introduce el nombre de un país: ")
    if pais == "0":
        break
    
    capital = input("Introduce el nombre de la capital de ese país: ")


    capitales[pais] = capital


for pais, capital in capitales.items():
    print(f"{capital} capital de {pais}")
for _ in range(10):
    print("Hoy me voy a portar bien en clase")

for i in range(1, 101):
    print(i)

for i in range(5, 101, 5):
    print(i)

for i in range(10, 0, -1):
    print(i)

num = int(input("Introduce un número: "))
for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")

suma = 0
while True:
    num = int(input("Introduce un número: "))
    if num == 0:
        break
    suma += num
print("Suma total:", suma)


num = int(input("Introduce un número: "))
factorial = 1
for i in range(1, num + 1):
    factorial *= i
print("Factorial:", factorial)


for _ in range(5):
    num = int(input("Introduce un número: "))
    if num < 0:
        print("Es negativo")


maximo = None
while True:
    num = int(input("Introduce un número: "))
    if num == 0:
        break
    if maximo is None or num > maximo:
        maximo = num
print("Número máximo:", maximo)


lista = []
for _ in range(4):
    num = int(input("Introduce un número: "))
    lista.append(num)
print("Lista:", lista)





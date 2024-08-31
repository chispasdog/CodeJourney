nobres = ["Adrian","Jaime","Gabriel", "Miki","Javi"]


nobres.insert(2, "Juan")


nobres.sort()

nobres.append("Antonio")

nobres.append("Rigoberta")


posicion_antonio = nobres.index("Antonio") + 1  
print(f"Antonio esta en la posicion {posicion_antonio}.")


nobres.sort()


posicion_rigoberta = nobres.index("Rigoberta")
nobres.insert(posicion_rigoberta + 1, "Merche")


print("Lista de companeros:")
for i, nobres in enumerate(nobres, start=1):
    print(f"{i}. {nobres}")
    
    
    
      
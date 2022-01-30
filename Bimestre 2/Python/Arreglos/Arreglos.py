suma=0;promed=0;mayor=0;

print("Ingrese el numero de notas")
n= int(input())

Notas = []
print("Nombres estudiantes")

Nombres = []

#Ingresa las notas al vector
for i in range(n):
    print("Ingrese el nombre ",i)
    Nombres[i] = str(input())
    print("Ingrese la nota ",i, ":")
    Notas[i]= float(input())
    Notas.append(Notas[i])
    print("----------------------------------------")


#Clacular suma de las notas
for i in range(n):
    suma=suma+Notas[i]

#Promedio

promed=suma/(n-1)
#Presentar os elementos del vector notas
print("---Las notas son:----")
for i in range(n):
    print("Notas[",i,"]=",Notas[i])
print("------------------------------")
print("El promedio de notas es: ",promed)

#nota mas alta
mayor= Notas[0]
for i in range(n):
    if(Notas[i]>mayor):
        mayor=Notas[i]
    #print("---"+mayor)
print("--Nota mayor = ",mayor)
print("--Las notas en las posiciones impares son")

for i in range(n):
    if(i%2!=0):
        print("Notas["+i+"] =",Notas[i])

print("\n NOTAS Y NOMBRES DE ESTUDIANTES")
for i in range(n):
    print(Nombres[i]," tiene una nota de ",Notas[i])

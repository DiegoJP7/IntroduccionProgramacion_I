n=0;mayor=0;
print("Encontrar el número mayor dentro de un vector.")
print("-------------------------------------------------")
print("Ingrese el tamaño del vector")
n=int(input())
A=[]

print("Ingrese los terminos del vector")
for i in range(0, n):
    print("A[",i,"]")
    val=int(input())
    A.append(val)

#Presentar vector original
print("Vector original")
for i in range(0, n):
    print("A[",i,"]=",A[i])

#Numero mayor
for i in range(0, n):
    if(A[i]>mayor):
        mayor=A[i]

print("El numero mayor del vector es: ",mayor)

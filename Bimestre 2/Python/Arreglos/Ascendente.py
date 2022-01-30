aux=0;n=0;
print("Ingrese el tamaño del vector")
n=int(input())
#declara vector
A = []
print("Ingrese los terminos del vector")

for i in range(n):
    print("A[",i,"]", end="")
    num=int(input())
    A.append(num)
#Presentar vector original
print("Vector original")
for i in range(n):
    print("A[",i,"]=",A[i], end="")

#ordenar vector
for i in range(n):
    for j in range(n):
        if(A[i]>A[j]):
            aux=A[i]
            A[i]=A[j]
            A[j]=aux

#Presentar el vector ordenado
print("---VECTOR ORDENADO-----")
for i in range(n):
    print("A[",i,"]=",A[i])
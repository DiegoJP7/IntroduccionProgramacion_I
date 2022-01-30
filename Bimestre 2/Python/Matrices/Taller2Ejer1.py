n=0;i=0;j=0;k=0;e=0;


print(" **** Leer una matriz de NxN e identificar en qué posiciones están los menores por fila. ****")
print("Ingrese el tamaño de la matriz")
n=int(input())
A=[]
for i in range(n):
    a = [0] * n
    A.append(a)
print("\n ingresar los terminos de la matriz")
for i in range(n):
    for j in range(n):
        print("A[", i, "][", j, "] :", end="")
        A[i][j] = int(input())

menor=A[1][1]
for i in range(n):
    for j in range(n):
        print(A[i][j]," ")
    print("")




for i in range(n):
    menor=A[i][0]
    for j in range(n):
        if(A[i][j]<menor):
            menor=A[i][j]
            A[k][e]=A[i][j]
    print("el elemento menor de la fila ",i," es ",menor," y esta en ",A[k][e])

    k=0
    e=0

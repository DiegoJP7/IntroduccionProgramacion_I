m=0;i=0;j=0;k=0;
print(" **** Una matriz m x m es simétrica si sus elementos satisfacen aij = aji.\n"
      "Realice un algoritmo que determine si una matriz es o no simétrica. ****")
print("Ingrese el tamaño de la matriz")
m=int(input())
A=[]
for i in range(m):
    a = [0] * m
    A.append(a)
for i in range(m):
    for j in range(m):
        print("A[", i, "][", j, "] :", end="")
        A[i][j] = int(input())

for i in range(m):
    for j in range(m):
        print(A[i][j]," ")
    print("")

for i in range(m):
    for j in range(m):
        print(A[j][i]," ")
    print("")

for i in range(m):
    for j in range(m):
        if(A[i][j]==A[j][i]):
            k=0

        else:
            k=k+1

if(k==0):
    print("La matriz es simetrica")

else:
    print("La matriz no es simetrica")

n=0;i=0;j=0;

print("Ingrese el tamaño de la matriz")
n=int(input())

A = []
for i in range(n):
    a = [0] * n
    A.append(a)
print("\n ingresar los terminos de la matriz")
for i in range(n):
    for j in range(n):
        print("A[", i, "][", j, "] :", end="")
        A[i][j] = int(input())
for i in range(n):
    for j in range(n):
        print(A[i][j]," ")
        print("")

print("Cambiar  por 0 la diagonal principal")
for i in range(n):
    for j in range(n):
        if(A[i][j]%2==0):
            A[i][j]=0

for i in range(n):
    for j in range(n):
        print(A[i][j]," ")
    print("")

print("Cambiar por 1 cuando i-n=0")
for i in range(n):
    for j in range(n):
        if((i==n-1) or (j==n-1)):
            A[i][j]=1
for i in range(n):
    for j in range(n):
        print(A[i][j]," ")
    print("")

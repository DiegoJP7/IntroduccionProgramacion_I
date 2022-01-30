n=0;i=0;j=0;numparA=0;numparB=0;
#Ingresar el tamaño de la matirz
print("Ingrese los elementos de la matriz A")
print("Ingrese le numero de filas")
n =int(input())

print("Ingrese el tamaño de las columnas")
m =int(input())
A=[]
for i in range(n):
    a = [0] * m
    A.append(a)
B=[]
for i in range(n):
    b = [0] * m
    B.append(b)
print("\n ingresar los terminos de la matriz A")
for i in range(n):
    for j in range(m):
        print("A[",i,"][",j,"]=")
        A[i][j]=int(input())

print("\n ingresar los terminos de la matriz B")
for i in range(n):
    for j in range(m):
        print("B[",i,"][",j,"]=")
        B[i][j]=int(input())

for i in range(n):
    for j in range(m):
        if(A[i][j]%2==0):
            numparA=numparA+1

for i in range(n):
    for j in range(m):
        if(B[i][j]%2==0):
            numparB=numparB+1

if(numparA==numparB):
    print("son iguales y el numero de pares entre los 2 vectores es:",numparB)

else:
    print("no lo son")

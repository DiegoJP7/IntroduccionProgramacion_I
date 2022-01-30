
mayorA=0;mayorB=0;
n=0;i=0;j=0;
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
        print("A[", i, "][", j, "] :", end="")
        A[i][j] = int(input())

print("\n ingresar los terminos de la matriz B")
for i in range(n):
    for j in range(m):
        print("B[", i, "][", j, "] :", end="")
        B[i][j] = int(input())

for i in range(n):
    for j in range(m):
        mayorA=A[i][j]
        if(A[i][j]>mayorA):

            mayorA=A[i][j]

print("El numero mayor de A es: ",mayorA)
#B
for i in range(n):
    for j in range(m):

        if(B[i][j]>mayorB):
            mayorB=B[i][j]


mayorB=B[i][j]

print("El numero mayor de B es: ",mayorB)

#Comparar los numeros mayores

if(mayorA==mayorB):
    print("El numero mayor A es ",mayorA," y el numero mayor de b es ",mayorB," entonces ambos numero son iguales")

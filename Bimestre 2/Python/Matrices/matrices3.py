n=0;i=0;j=0;

print("----Operaciones sobre matrices cuadradas")
print("Ingrese el tamaño de la matriz cuadrada: ")
n=int(input())
#Ingrese los elementos de la matriz
A=[]

for i in range(0, n):
    A.append([])
    for j in range(0, n):
        val = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        A.append(val)

print("La matriz A es:")
for i in range(n):
    for j in range(n):
        print(A)
    print('  ')

print('')

print("Cambiar por 0 la diagonal principal")
for i in range(n):
    for j in range(n):
        if(i==j):
            A[i][j]=0


for i in range(n):
    for j in range(n):

        print(A[i][j]," ")
        print("")

print("Cambiar por 1 la diagonal principal")
for i in range(n):
    for j in range(n):
        if(i==j):
            A[i][j]=0


print("Cambiar por 99 las esquinas de la matriz")
A[0][0]=99
A[0][0]=99
A[0][0]=99
A[0][0]=99

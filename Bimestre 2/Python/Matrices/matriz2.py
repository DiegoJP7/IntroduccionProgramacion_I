n=0;m=0;i=0;j=0;
#Ingresar el tamaño de la matirz
print("Ingrese le numero de filas")
n =int(input())

print("Ingrese el tamaño de las columnas")
m =int(input())
A=[]

#Ingresar elementos de la matriz

print("\n ingresar los terminos de la matriz")
for i in range(0, n):
    A.append([])
    for j in range(0, m):
        val = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        A.append(val)



print("La matriz A es:")
for i in range(0, n):
    for j in range(0, m):
        print(A[i][j])
    print("")
print('')
print("------------------------")
suma=0
B=[]
for i in range(0, n):
    for j in range(0, m):
        suma= suma + A[i][j]


    B[i]=suma
    suma = 0

print("El vector B es")
for k in range(0, n):
    print(B[k]," ")

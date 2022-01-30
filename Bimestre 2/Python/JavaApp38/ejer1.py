m=0;k=0; n=0;n1=0;m1=0;
print("Ingrese el tamaño en filas de la matriz: ")
n =int(input())

print("Ingrese el tamaño en columnas de la matriz: ")
m =int(input())

print("Ingrese el tamaño en filas de la matriz 2: ")
n1 =int(input())

print("Ingrese el tamaño en columnas de la matriz 2: ")
m1 =int(input())
A=[]
for i in range(n):
    a = [0] * m
    A.append(a)
B=[]
for i in range(n1):
    a = [0] * m1
    B.append(a)
C=[]
for i in range(A):
    a = [0] * B
    A.append(a)
if(m==n1):
    # Ingresar vector A
    for i in range(n):
        for j in range(m):
            print("A [",i,"] [",j,"] = ")
            A[i][j] =int(input())

    #Ingresar vector B
    for i in range(n):
        for j in range(m):
            print("B [",i,"] [",j,"] = ")
            B[i][j] =int(input())


    print("VECTOR A")
    #presentar vector A
    for i in range(n):
        for j in range(m):
            print(A[i][j] , "  ")

        print(" ")
    print("VECTOR B")
    # Presentar vector B
    for i in range(n1):
        for j in range(m1):
            print(B[i][j] , "  ")

        print(" ")

    print("VECTOR C")
    #Vector C

    result=0
    suma=0
    for i in range(m):
        for j in range(n1):
            for k in range(k):
                result=((A[i][k])*(B[k][j]))
                suma = suma + result

        C[i][j]= suma
        suma=0
    # Presentar vector C
    for i in range(n):
        for j in range(m1):
            print(C[i][j] , "  ")

        print(" ")
else:
    print("Las 2 matrices no se pueden multiplicar.")

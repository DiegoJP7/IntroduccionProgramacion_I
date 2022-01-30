m=0; n=0;
print("Ingrese el tamaño en filas de la matriz: ")
n =int(input())
print("Ingrese el tamaño en columnas de la matriz: ")
m =int(input())
A=[]
for i in range(n):
    a = [0] * m
    A.append(a)
for i in range(n):
    for j in range(m):
        print("A [",i,"] [",j,"] = ")
        A[i][j] =int(input())




for i in range(n):
    for j in range(m):
        print(A[i][j] , "  ")
    print(" ")

print("--------------------------------")
for i in range(m):
    for j in range(n):
        print(A[i][j] , "  ")
    print(" ")

m=0; n=0;
print("Ingrese el tamaño en filas de la matriz: ");
n =int(input())
A=[]
for i in range(n):
    a = [0] * n
    A.append(a)
for i in range(n):
    for j in range(n):
        print("A [",i,"] [",j,"] = ");
        A[i][j] =int(input())


for i in range(n):
    for j in range(n):
        print(A[i][j] , "  ");
    print(" ");

print("Diagonal Principal=0");
for i in range(n):
    for j in range(n):
        if(i<j):
            A[i][j] = 0;

for i in range(n):
    for j in range(n):
        print(A[i][j] , "  ");
    print(" ");

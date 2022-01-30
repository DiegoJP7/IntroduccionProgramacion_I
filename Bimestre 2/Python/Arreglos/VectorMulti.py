n=0; escalar=0;
print("Ingrese el tamaño del escalar");
escalar =int(input())
print("Ingrese el tamaño del vector");
n=int(input())
A = [n*n]
B = []
for i in range(n):
    print("Ingrese los numero del vector A:");
    num= float(input())
    A.append(num)

#Multiplicar por el escalar
for i in range(n):
    B[i]= A[i] * escalar

#Presentar el vector B
for i in range(n):
    print("B= ",B[i])
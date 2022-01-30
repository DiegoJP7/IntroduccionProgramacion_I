
n=5;aux=0;Ai=0;Bi=0;
A=[]
B=[]
for i in range(0, n):
    print("Ingresar los 5 Primeros Numeros del Vector A")
    val=int(input())
    A.append(val)

print("--------------------------------------------")
for i in range(0, n):
    print("Ingresar los 5 Primeros Numeros del Vector B")
    val=int(input())
    B.append(val)

print("--------------------------------------------")
print("***Vector original A *******")
for i in range(0, n):
    print("A[",i,"]=",A[i], end=" ")

print("********Vector original B*********")
for i in range(0, n):
    print("B[",i,"]=",B[i], end=" ")

for i in range(0, n):
    if((A[i]==B[i])and(i==i)):
        print("El vector A y el vector B tienen el mismo numero ",A[i]," y comparten la misma posicion en [",i,"]")

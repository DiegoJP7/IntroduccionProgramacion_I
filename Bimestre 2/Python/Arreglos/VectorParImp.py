n=0;

print("Ingrese el tamaño del vector")
n=int(input())
print("----------------------------")
A = []
par = []
impar = []
for i in range(n):
    print("Ingrese los terminos del vector")
    num=int(input())
    A.append(num)
#Presentar vector original
print("Vector original");
for i in range(n):
    print("A[",i,"]=",A[i]);

for i in range(n):
    if(A[i]%2==0):
        aux=par[i]
        par[i]=A[i]
        print("Pares ",i," : ",par[i])

print("------------------")
for i in range(n):
    if(A[i]%2!=0):
        impar[i]=A[i]
        aux=impar[i]
        print("Impares ",i," : ",impar[i])

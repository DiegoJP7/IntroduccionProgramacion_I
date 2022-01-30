#Declaracion de variables
i = 1; n = 0;num = 1; total = 1;
#Ingreso de datos
print("Ingrese el numero a multiplicar")
num = int(input())
print("Ingrese el maximo de numeros a multiplicar")
n  = int(input())
#Proceso
while (i<=n):
    total = num*i
    print(i)
    print(num," x ",i, " = ",total )
    i = i +1
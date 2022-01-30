#Inicializar las variables

n=0; num=0;divisor=0;
print("Ingrese el limite de numeros a vrificar")
n = int(input())

for i in range(0,n):
    print("Ingrese un numero")
    num = int(input())
    #par o imoar
    if(num%2==0):
        print("El numero ",num, " es par")
    else:
        print("El numero ",num, " es impar")
    #Obtener los metodos a verificar si un numero es primo
    j=1
    while(j<=num):
        if (num%j==0):
            divisor=divisor+1
        j=j+1
    if (divisor == 2):
        print("El numero " ,num," es primo")
        print("----------------------------------------------------")
    else:
        print("El numero " ,num," no es primo")
        print("----------------------------------------------------")
    divisor=0;
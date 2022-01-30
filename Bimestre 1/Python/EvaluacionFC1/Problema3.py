#Declaracion de variables

num1=0
num2=0
print("Programa para determinar si la diferencia entre los dos es un número divisor exacto de alguno de los dos números.\n")
print("Ingrese el primer numero: ")
num1= int(input())
print("Ingrese el segundo numero: ")
num2= int(input())

#Proceso
if (num1>num2):
    dif = num1 - num2

else:
    dif= num2 - num1
multiplo=dif
print("La diferencia es: ",multiplo)

if ((num1%multiplo == 0)or(num2%multiplo == 0)):
    print("La diferencia entre ambos numeros es un divisor de uno de los numeros")

else:
    print("La diferencia de ",multiplo," no es divisor para ninguno de los dos números ")

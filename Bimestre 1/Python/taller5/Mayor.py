#Declare las variables
#Ingreso de datos
print("Programa para verificar si un numero es mayor o menor a otro numero")
print("Ingrese el primer numero para verificar: ")
num1= float(input())
print("Ingrese el segundo numero verificar: ")
num2= float(input())

#Proceso
if(num1 > num2):
    print("El numero ",num1, " es mayor al numero ",num2)
else:
    print("El numero ",num2, " es mayor al numero ",num1)

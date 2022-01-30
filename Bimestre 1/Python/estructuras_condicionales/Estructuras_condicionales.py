
num = 0

#Entrada de datos
print("Estructuras logicas condicionales simples")
print("Programa para verificar si un numero es par")

print("Ingrese un numero para verificar: ")
num = int(input())

#if (num %2 == 0)
#    print("El numero " +num + " es par" )
#    if ((num %2 == 0) && (num > 0))
#print("El numero " +num + " es par y positivo")
#
#
#
#else
#    print("El numero "+num +" es impar" )
#
#Proceso
if (num %2 == 0):
    print("El numero " ,num , " es par" )
    if ((num %2 == 0) and (num > 0)):
        print("El numero " ,num , " es par y positivo")
else:
    print("El numero ",num ," es impar" )

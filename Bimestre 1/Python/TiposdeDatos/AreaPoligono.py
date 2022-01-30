

#Inicializar las variables
A = 0
B = 0
alTriag = 0
areaT = 0
areaR=0
areaTotal=0


print("---Programa para calcular el area de un poligono--- \n")
print("Ingrese el nombre del usuario: ")
nombre=str(input())
#Ingresar datos
print("Ingresa la altura del terreno (A): ")
A = float(input())

print("Ingresa la base del terreno (B): ")
B = float(input())

print("Ingresa la altura del rectangulo del terreno (C): ")
C = float(input())

#Proceso
alTriag = A - C
areaT = (B * alTriag)/2
areaR = B * C
areaTotal = areaT + areaR

print("El area del triangulo del terreno es: " ,areaT , "\n")
print("El area de triangulo del terreno es: " ,areaR , "\n")
print("El area total del triangulo es: " ,areaTotal , "\n")
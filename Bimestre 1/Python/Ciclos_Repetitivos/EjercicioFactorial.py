#Inicializar las variables
i=0
fac = 1; num = 1;
#Ingeso de datos

print("Ingrese el numero a calcular su factorial")
num = int(input())
#Proceso
while (i <= num):
    i = i+1
    print(i)
    fac = i * fac

print("El factorial del numero ",num," es : ",fac)
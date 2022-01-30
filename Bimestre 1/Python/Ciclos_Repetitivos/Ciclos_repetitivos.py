i = 1; n = 1;suma = 0;

#Ingresar el limite del cilco
print("Ingrese el limite del ciclo")
n = int(input())

#palabra reservada while
#Proceso
while(i <= n):
    print(i)
    suma = suma + i
    i = i + 1

print("i es ",i)
print("La suma es: ",suma)
i = n
suma = 0
while (i >= 1):
    print("Suma es ",suma)
    suma = suma + i
    print(i)
    i = i - 1
print("i es ",i)
print("La suma es: ",suma)

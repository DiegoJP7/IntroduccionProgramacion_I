#Declaracion de variables
i = 1; n = 0; suma =0;num = 1; den = 1;term=1;
#ingreso de datos
print("Ingrese el limite del cliclo")
n = int(input())
print("Ingrese el numerador")
num = int(input())
print("Ingrese en denominador")
den = int(input())

#Proceso
while (i <= n):
    num = num + 2
    den = den + 3
    term = num/den
    print(i)
    i = i + 1
    suma = suma + term
    print("El termino ",i, " es ",num,"/",den)
    print("La suma total es ",suma)
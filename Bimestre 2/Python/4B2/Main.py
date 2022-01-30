cont = 0;suma = 0;
i=0;n=1;
while (n!=0):
    print("Ingrese los Numeros, el numero 0 es el limite")
    n = int(input())
    i=i+1
if((n % 2 == 0 )and(n >0)):
    cont = cont + 1
    ft = 1
for i in range(n):
    ft = ft * i

suma = suma + ft
print(ft)


promed = suma/cont
#Salida
print("La suma de los numeros es: ",suma)
print("Media: ", promed)

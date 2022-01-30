#Declaracion de varibles
base=0; pot=0; result=1;i=1;

#ingreso de datos

print("ingrese la base:")
base = int(input())
print("Ingrese la potencia")
pot = int(input())

while (i <= pot):
    result=  result * base
    i = i + 1
print("i es ",i)
print("La potencia de la base ",base, " es ",result)

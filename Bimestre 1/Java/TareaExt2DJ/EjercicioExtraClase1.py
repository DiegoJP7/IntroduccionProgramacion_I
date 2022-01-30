
num1=0;num2=0;
int: num1; num2;

print("Programa para determinar si la diferencia entre los dos es un número divisor exacto de alguno de los dos números.\n");
print("Ingrese el primer numero: ");
num1= float(input())
print("Ingrese el segundo numero: ");
num2 = float(input())
#Proceso
if (num1>num2):
    dif = num1 - num2;

else:

    dif= num2 - num1;
if ((num1%dif == 0)|(num2%dif == 0)):
    print("La diferencia entre ambos numeros es un numero divisor de uno de los numeros")
else:
    print("La diferencia no es divisor para ninguno de los dos números ")


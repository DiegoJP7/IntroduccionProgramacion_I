#Declare la variable e inicializar
num1=0;num2=0;resp=0;

#ingreso de datos
print("Calculadora basica\n")

print("Ingrese el valor del primer numero")
num1 = float(input())
print("Ingrese el valor del segundo numero")
num2 = float(input())
print("\n")

print("Escoja la operacion del siguiente menu")
print("1. Suma")
print("2. Resta")
print("3. Multiplicacion")
print("4. Division\n")

print("Ingrese la opcion: ")
opc = int(input())

if opc==1:
    resp = num1 + num2
    print("La suma es: ",resp)

elif opc == 2:
    resp = num1 - num2
    print("La resta es: ",resp)

elif opc ==3:
    resp = num1*num2
    print("La multiplicacion es: ",resp)

elif opc ==4:
    resp = num1/num2
    print("La division es: ",resp)

elif opc>4:
    print("No existe la opcion que ingreso")

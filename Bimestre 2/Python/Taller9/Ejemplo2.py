try:
    print("ingresa el valor 1 ")
    valor1=int(input())
    print("ingresa el valor 2 ")
    valor2=int(input())

    result=valor1/valor2
    print("El resultado es ",result)

except ValueError:
     print("Existe un error de entrada de datos");
     print("De tipo: ",ValueError);

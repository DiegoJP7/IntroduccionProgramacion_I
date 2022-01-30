import sys
try:
    print("Ingrese el valor 1")
    valor1=int(input())

    print("Ingrese el valor 2")
    valor2 =int(input())

    if valor1<0 or valor2 < 0:
        raise print ("no se permite ingresar números negativos")
    resultado = valor1/valor2
    print("El resultado es ",resultado)

except:
    print("Ha ocurrido una excepcion de tipo ",sys.exc_info()[0])

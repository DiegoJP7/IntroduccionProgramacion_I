try:
    print("Ingrese el valor 1")
    valor1=int(input())

    print("Ingrese el valor 2")
    valor2 = int(input())

    resultado = valor1/valor2
    print("El resultado es ",resultado)

except ZeroDivisionError:
    print("LO sentimos hay un error")
    print("de tipo ",ZeroDivisionError)

except ValueError:
    print("Existe un error de entrada de datos")
    print("De tipo: ",ValueError)

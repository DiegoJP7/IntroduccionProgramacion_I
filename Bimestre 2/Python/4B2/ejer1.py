def Cifras(n):
    cifra=0
    while(n!=0):
        n = n/10
        cifra= cifra+1
    return cifra
num=0;
print("Función que reciba un número y devuelva la cantidad de digitos")
print("Ingrese un número: ")
num = int(input())
cif = Cifras(num)
print("El numero ",num, " tiene ",cif," digitos")



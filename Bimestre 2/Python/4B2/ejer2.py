def Primo(A,numero):
    div=0
    for i in range(numero):
        if(numero%i==0):
            div=div+1

    for i in range(numero):
        if (div==2):
            return True
        else:
            return False


    return False

A=[]
numero=0
n=10
for i in range(n):
    print("Ingrese el elemento A[",i,"]=")
    A[i]= int(input())
    numero=A[i]

    esPrimo=Primo(A,numero)
    if(esPrimo==True):
        print("***El numero ",numero," es primo***")



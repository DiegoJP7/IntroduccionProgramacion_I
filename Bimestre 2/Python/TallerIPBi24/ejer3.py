def FunDisp(Disp,g,q):
    if(Disp[g][q]==0):
        return 0

    else:
        return 1

Disp =[]
print("Ingrese el valor de k: ")
k  = int(input())
print("Ingrese el valor de n: ")
n  = int(input())

for i in range(k):
    for j in range(n):
        print("Ingrese el valor de Disp[",i,"][",j,"]= ")
        Disp[i][j] = int(input())


# Se hace el chequeo de la disponibilidad
# del anaquel q en la gondola g
print("Ingrese el valor de q: ")
q  = int(input())
print("Ingrese el valor de g: ")
g  = int(input())
rd = FunDisp(Disp,g,q)
if(rd==0):
    print("El anaquel ",q," en la gondola ",g," está disponible")

else:
    print("El anaquel ",q," en la gondola ",g," no está disponible")



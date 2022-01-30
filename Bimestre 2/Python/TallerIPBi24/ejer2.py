
def Sarrus(M=[]):
    A=[]
    for i in range(3):
        for j in range(3):
            A[i][j] = M[i][j]

    # Comlumnas adicionales de la matriz ampliada
    for i in range(3):
        for j in range(5):
            A[i][j] = A[i][j-3]

    #calculo del determinante
    i = 1;j = 1;dc = 1;t = 3;d = 1;sumad = 0
    while(i<=3):
        while((j<=t)and(t<=5)):
            d = d * A[i][j]
            i = i + 1
            j = j + 1
        sumad = sumad + d
        d = 1
        i =1
        dc = dc + 1
        j = dc
        t = t + 1

    i = 1 ;j = 3 ;dc = 3;t = 1;z = 1;sumai = 0
    while(i<=3):
        while((j>=t)and(t<=3)):
            z = z * A[i][j]
            i = i + 1
            j=j-1
        sumai = sumai + z
        z = 1
        i = 1
        dc = dc + 1
        j = dc
        t = t + 1

    det = sumad - sumai
    return det
# Lee la matriz de orden 3
M=[]
for i in range(3):
    for j in range(3):
        print("ingrese el valor de M[",i,"][",j,"]= ")
        M[i][j]=float(input())
    det = Sarrus(M)
    print("El determinante de la matriz es igual a: ",det)

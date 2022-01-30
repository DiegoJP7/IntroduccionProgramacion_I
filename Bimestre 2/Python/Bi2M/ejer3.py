n=0;i=0;j=0;
#Ingresar el tamaño de la matirz
print("Ingrese los elementos de la matriz A")
print("Ingrese le numero de filas")
n=int(input())

print("Ingrese el tamaño de las columnas")
m=int(input())
A=[]
for i in range(n):
    a = [0] * m
    A.append(a)
B=[]
for i in range(n):
    b = [0] * m
    B.append(b)
print("\n ingresar los terminos de la matriz A")
for i in range(n):
    for j in range(m):
        print("A[",i,"][",j,"]=")
        A[i][j]=int(input())


#Promedio
sumaA = A[0][0] + A[0][m-1] + A[n-1][0] + A[n-1][m-1]
promA= sumaA/4

#promb
print("\n ingresar los terminos de la matriz B")
for i in range(n):
    for j in range(m):
        print("B[",i,"][",j,"]=")
        B[i][j]=int(input())

sumaB = B[0][0] + B[0][m-1] + B[n-1][0] + B[n-1][m-1]
promB= sumaB/4

#Comparar promedios
if(promA==promB):
    print("El promedio de A es ",promA,"y el de la matriz b es ",promB,"es decir son promedios igualales")

else:
    print("los promedios no son iguales")

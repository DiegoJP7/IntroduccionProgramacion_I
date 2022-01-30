n=0;i=0;j=0;suma=0;

print("Ingrese el numero de personas")
n=int(input())
print("Ingrese los criterios a calificar")
m=int(input())

A = []
for i in range(n):
    a = [0] * m
    A.append(a)
for i in range(n):
    print("ingresar el valor de los criterios para la persona ",i)
    for j in range(m):
        print("Persona " ,i,"\nCriterio ",j)
        A[i][j]=int(input())
        print("---------------------------")

suma=A[0][j-1]
#Media
media=suma/m
for i in range(n):
    print(" Criterios Persona ",i," = ")
    for j in range(m):

        print(A[i][j]," ")

    print("Media=",media)
    print("")

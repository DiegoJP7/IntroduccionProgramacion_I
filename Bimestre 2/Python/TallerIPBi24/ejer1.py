def Cuadrado_Suc( m):
    r = 0
    j = m
    while True:
        r = r + m
        j = j - 1
        if(j < 0):
            break
    return r


#Declaración e Inicialización de las Variables
n = 0;

print("\t----Programa para calcular el cuadrado de los números ingresados en un vector----")

print("¿Cuántos números va a ingresar en el vector?")
n =int(input())

V=[]

for i in range(n):
    num = int(input("Ingrese numero del vector V:"))
    V.append(num)

C=[]
for i in range(n):
    C= Cuadrado_Suc(V)

for i in range(n):
    print("El número contenido en la posición V[" ,i ,"] tiene como cuadrado " ,C[i])




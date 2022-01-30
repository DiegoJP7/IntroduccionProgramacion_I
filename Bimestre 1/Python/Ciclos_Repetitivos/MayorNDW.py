#Declaracion de variables
i=1;n=0;num=0;mayor=0;menor=0;
#Ingrese los datos
print("\n***Encontrar el numero mayor de N numerosque ingrese el usuario. \n")
print("Ingrese el limite de los numeros:")
n = int(input())
while True:
    print("\n Ingrese un numero: ")
    num= int(input())
    if(num>mayor):
        mayor=num
    i=i+1
    if i<=n:
        break
print("El numero mayor de los valoes es " ,mayor)
print("\n*** Encontrar el numero menor de N")
for i in range(n):
    print("Ingrese el numero")
    num = int(input())
    if(i==1):
        menor = num
    print("**menor<- ",menor)
    if(num<menor):
        menor=num
    print("El numero menor es: ",menor)

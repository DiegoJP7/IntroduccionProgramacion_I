n=0;bsc=0;aux=0;
print("Ingrese el tamaño del vector")
n=int(input())
A=[]
for i in range(0, n):
    print("Ingrese los terminos del vector")
    val=int(input())
    A.append(val)
print("Vector original")
for i in range(0, n):
    print("A[",i,"]=",A[i], end=" ")

print("Ingrese el numero a buscar")
bsc=int(input())
for i in range(0, n):
    if(bsc==A[i]):
      aux=aux+1
      print("Su posicion es:A[",i,"]")

print("El numero ingresado se repite ",aux," veces en el vector")

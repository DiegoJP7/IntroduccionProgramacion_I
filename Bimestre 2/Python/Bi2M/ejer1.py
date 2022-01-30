num=0; cont=0; prom=0; suma = 0;
while True:
    print("Ingrese un número:")
    num = int(input())
    if((num % 2 == 0 )and(num >0)):
        cont = cont + 1
        fact = 1
        for i in range(num):
            fact = fact * i
    suma = suma + fact
    if(num == 0):
        break

prom = suma/cont
print(suma)
print(cont)
print("Media: " , prom)

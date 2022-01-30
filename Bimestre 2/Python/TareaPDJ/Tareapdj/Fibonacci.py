#Variables
i=0;fib1=0;fib2=1;num=0;
int: i;fib1;fib2;num;
while True:
    num = int(input("Ingrese el tamaño/limite de la serie: "))
    if num>=1:
        break
print("El " ,num, " tiene como primeros numero de la serie Fibonacci")
for i in range(num):
    if i <= num:
        print(fib2)
        fib2 = fib1 + fib2
        fib1 = fib2 - fib1
        i=i+1
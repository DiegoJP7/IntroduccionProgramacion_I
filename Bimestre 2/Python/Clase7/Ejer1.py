#Variables
n=1;divisor=1;num=1;menor=0;i=1;j=1;primo=0;
print("Ingrese el limite")
n  = int(input())

while (i<=n):
    print("Ingrese un numero")
    num  = int(input())
    for j in range(0, num):
        if (num%j==0):
            divisor=divisor+1

    if(divisor==2):
        primo=primo+1
        if(primo==1):
            menor=num
        if(num<menor):
            menor=num
    divisor=0
    i=i+1
    print("el numero menor es ",menor)
    print("-------------------------------------")
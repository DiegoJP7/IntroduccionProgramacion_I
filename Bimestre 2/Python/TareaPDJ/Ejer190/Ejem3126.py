#Variables
sdn=0;nd=0;
sdn, nd,
print("Por favor, digite un numero entero")
n = float(input())
cn=n
if(cn<0):
    cn=-n
if(cn==0):
    sdn=0
    nd+=1
    if(cn>0):
            sdn=sdn+(cn%10)
            nd+=1
            cn=cn/10
print(n," tiene " ,nd," digitos y la suma de los digitos de " ,n, " es: ",sdn );
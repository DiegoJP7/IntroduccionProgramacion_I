suma=0;i=0;
suma,i;
#Proceso
for i in range(1,999):
    i=i+1
    if(i%3==0 or i%5==0):
        suma=suma+i
print("Respuesta es: ",suma)
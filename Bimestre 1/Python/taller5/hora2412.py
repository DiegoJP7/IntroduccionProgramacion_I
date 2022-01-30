h24=0; n24=0; h12=0; n12=0;
periodo = "a.m"

#Ingresoso de los datos
print("Ingrese la hora en formato 24 horas a 12 horas\n")
print("Ingrese la hora en 24 horas")
h24 = int(input())

#Proceso
if ((h24 <= 24)and(h24 >= 0)and(n24 >= 0)and(n24 <= 60)):
    if (n24 == 60):
        h24= h24+1
        n24=0
    else:
        n12= n24
    if(h24>12):
        h12= h24 -12
        periodo = "pm"
        print("El tiempo de " ,h24," horas y " ,n24," minutos equivale a " ,h12, " horas ",n12, " minutos " ,periodo)
else:
    print("Error: La hora o minutos ingresados no son validos")

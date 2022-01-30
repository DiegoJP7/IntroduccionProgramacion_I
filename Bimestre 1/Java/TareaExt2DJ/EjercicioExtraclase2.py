#Declaracion de variables

anio=0; mes=0; dia=0; dia1=0; mes1=0; anio1=0;
int: anio; mes; dia; dia1; mes1; anio1;
#Ingreso de datos
print("Ingrese la fecha del dia de hoy ");
print("Dia: ");
dia1 = float(input())
print("Mes: ");
mes1 = float(input())
print("Año:");
anio1 = float(input())
print("\n");
print("--------------------------------------------------");
print("Ingrese el dia de nacimiento en numeros");
dia = float(input())
print("Ingrese el mes de nacimiento en numeros ");
mes = float(input())
print("Ingrese el año del nacimiento en numeros");
anio = float(input())
#Proceso
if (anio<= 1900):
    print(" el rango de los años es 1901 - 2021");
else:
    if ((anio >= 1901)&(anio <=2021)):
        anio = (anio1 - anio)
if (mes > 12):
    print(" el rango de los meses es 12")
if (mes<mes1):
    mes = mes1-mes
else:
    mes = (mes - mes1)
if (dia > 31):
    print("El rango maximo de dias es 31")
if (dia<dia1):
    dia= dia1-dia+1
else:
    dia= dia-dia1+1
#Salida
print("Los años son ",anio," los meses son ",mes," y los dias son ",dia )

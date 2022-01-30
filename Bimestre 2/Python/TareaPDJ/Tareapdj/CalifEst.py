#Inicializar las variables
num=0;divisor=0;aprov=0;deprov=0; i=1;j=0
int: i ; j;divisor;aprov;deprov;
double: num;


#Proceso
print("--Programa para verificar si la nota de N estudintes es aprovatoria o no")

n = int(input("Ingrese el numero de estudiantes a calificar"))
print ("el es",n)
for i in range(n):

    print("Ingrese la nota del estudiante")
    num = float(input())
    if num >= 7:
        print("El estuadiante tiene de nota ",num, " por lo tanto esta aprovado")
        print("---------------------------------------------------------------------")
        i = i + 1;
        aprov=aprov+1;
    else:
        print("El estuadiante tiene de nota ",num, " por lo tanto no esta aprovado")
    print("---------------------------------------------------------------------")
    i = i + 1
    deprov=deprov+1


print("El total de estudiantes aprobados es: ",aprov)
print("El total de estudiantes reprobados es: ",deprov)
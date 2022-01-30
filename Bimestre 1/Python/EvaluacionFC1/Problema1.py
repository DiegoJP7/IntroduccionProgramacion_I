#Declaracion de variables
n=float
n=0;
#Introduccion de datos
print("Introduzca la nota del estudiante");
n = float(input())
#Condiciones
if(n >= 3.0):
    print("La nota introducida es valida como aprovada");
    if((n >= 4.6)and(n<=5.0)):
        print("Estudiante exelente");

    else:
        if((n>=4.1)and(n >= 4.5)):
            print("El alumno es muy bueno");
        else:
            if((n>=3.6)and(n >= 4.0)):
                print("El estudiante es bueno");
            else:
                if((n>=3.3)and(n >= 3.5)):
                    print("El alumno registro un desempeño aceptable");
                else:
                    if((n>=3.0)and(n >= 3.2)):
                        print("Alumno aprovado");
else:
    print("El alumno registra una calificacion no aprovatoria");


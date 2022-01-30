A=float
B=float
C=float
D=float
nTrabajos=float
nLecciones=float
nParticipaciones=float
nExmfinal=float
nTotal=float
nombre=str


print("--Programa para calcular la nota final de un estudiante-- \n")
print("Ingresar el nombre del estudiante")
nombre=str(input())

#Datos
print("Ingrese la nota de los trabajos: ")
A =float(input())
if (A > 10):
    print("!!La nota es sobre 10 puntos!!")
    print("**Ingrese la nota otra vez**")
    print("")

print("-----------------------------------------------")


print("Ingrese la nota de las lecciones: ")
B =float(input())
if (B > 10):
    print("!!La nota es sobre 10 puntos!!")
    print("**Ingrese la nota otra vez**")
    print("")
print("-----------------------------------------------")

print("Ingrese la nota de las participaciones: ")
C =float(input())
if (C > 10):
    print("!!La nota es sobre 10 puntos!!")
    print("**Ingrese la nota otra vez**")
    print("")

print("-----------------------------------------------")

print("Ingrese la nota del examen final: ")
D =float(input())
if (D > 10):
    print("!!La nota es sobre 10 puntos!!")
    print("**Ingrese la nota otra vez**")
    print("")

print("-----------------------------------------------")


#Proceso
nTrabajos = A * 20/100
nLecciones = B * 30/100
nParticipaciones = C * 10/100
nExmfinal = D * 40/100
nTotal = nTrabajos + nLecciones + nParticipaciones + nExmfinal

print( ""+nombre+ " tiene la nota de: " ,nTotal, "\n")
if (nTotal < 6.99):
    print("No Aprobado")
    print("")

if (nTotal >= 7):
    if (nTotal <= 10):
        print("Aprobado")
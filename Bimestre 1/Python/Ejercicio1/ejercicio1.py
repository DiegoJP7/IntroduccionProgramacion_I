duraLlam=float
costMinuto=float
cosTotal=float
nombre=str

print("--Programa para calcular el costo total de una llamada-- \n")
print("Ingresar el nombre del usuario")
nombre=str(input())

#Ingresar datos
print("Ingresar el tiempo de llamada en minutos: ")
duraLlam = float(input())

print("Ingresar el valor de la llamada por minutos: ")
costMinuto = float(input())

#Proceso

cosTotal = duraLlam * costMinuto


print("La duracion de la llamada es: " , duraLlam , "\n")
print("El costo por minuto de la llamada es:  " ,costMinuto, "\n")
print("El costo total de la llamada es:    " ,cosTotal, "\n")
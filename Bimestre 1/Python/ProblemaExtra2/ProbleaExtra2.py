print("Programa para convertir de metros a centimetros, kilometros, pies y pulgadas, \n");

#Declaracion varibales
#Inializacion de variable
cM=0;
cCm=0;
cKm=0;
cFt=0;
cPl=0;

#Entrada de datos
print("Ingrese los metros")
cM = float(input())

#Proceso
cCm = cM * 100
cKm = cM /1000
cFt = cM * 3.281
cPl = cM * 39.37

#Salida
print(cM, " metros son " ,cCm , " centimetros")
print(cM," metros son " ,cKm , " kilometros")
print(cM," metros son " ,cFt ," pies")
print(cM," metros son " ,cPl , " pulgadas")

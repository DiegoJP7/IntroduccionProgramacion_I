gC = 0; gF = 0; gK = 0;

#entrda de datos
print("Estructuras logicas condicionales simples")
print("Programa para convertir en grados \n")

print("Ingrese los grados centigrados: ")
gC = float(input())

if (gC > 0):
    gF =(9/5)*(gC + 32)
    gK = gC + 273.15
print("La equivalencia en grados Farenheid es ",gF)
print("La equivalencia en grados Kelvin es ",gK)

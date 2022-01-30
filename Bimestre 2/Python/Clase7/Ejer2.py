print("Ingrese el numero")
n = int(input())
iCantidad = 0
cif = n
while (cif>0):
  cif = cif/10
  iCantidad=iCantidad+1
print(n , " tiene " ,iCantidad, " dígitos")
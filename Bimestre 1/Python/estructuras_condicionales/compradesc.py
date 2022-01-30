#declaracion de varibales
precioProd1 = 0; precioProd2 = 0; precioProd3 = 0;
cantProd1 = 0; cantProd2 = 0; cantProd3 = 0;
costoProd1 = 0; costoProd2 = 0; costoProd3 = 0;
subTotal = 0; desc = 0; IVA = 0; Total = 0;

#Ingresar datos
print("--Ingrese los datos del producto 1--")
print("Nombre:")
nomProd1 =str(input())
print("Precio:")
precioProd1 = float(input())
print("Cantidad: ")
cantProd1 = float(input())

print("--Ingrese los datos del producto 2--")
print("Nombre:")
nomProd2 =str(input())
print("Precio:")
precioProd2 = float(input())
print("Cantidad:")
cantProd2 = float(input())

print("--Ingrese los datos del producto 3--")
print("Nombre:")
nomProd3 =str(input())
print("Precio:")
precioProd3 = float(input())
print("Cantidad: ")
cantProd3 = float(input())

#Proceso
costoProd1 = precioProd1 * cantProd1
costoProd2 = precioProd2 * cantProd2
costoProd3 = precioProd3 * cantProd3

subTotal = costoProd1 + costoProd2 + costoProd3
if(subTotal <= 10):
    desc = subTotal * 0.05
if((subTotal > 10) and (subTotal <= 30)):
    desc=subTotal *0.15
if(subTotal > 30):
    desc=subTotal*0.20

IVA = ((subTotal - desc) *0.12)
Total = (subTotal - desc) + IVA

print("--Producto 1--")
print("Nombre: ",nomProd1)
print("Precio: ",precioProd1)
print("Cantidad: ",cantProd1)
print("-------------------------------------")
print("Costo: ",costoProd1)
print("\n")

print("--Producto 12--")
print("Nombre: ",nomProd2)
print("Precio: ",precioProd2)
print("Cantidad: ",cantProd2)
print("-------------------------------------")
print("Costo: ",costoProd2)
print("\n")

print("--Producto 3--")
print("Nombre: ",nomProd3)
print("Precio: ",precioProd3)
print("Cantidad: ",cantProd3)
print("-------------------------------------")
print("Costo: ",costoProd3)
print("\n")

print("----------")
print("SubTotal: ",subTotal)
print("Descuento: ",desc)
print("Valor IVA: ",IVA)
print("     ---------")
print("Total: ",Total)

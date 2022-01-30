nombre=str
tipo_cliente=int
desc1 =0; desc2 =0; desc3 =0; subtotal =0;subtotal1=0;costlibro =0;costotal=0;

#Intro
print("Ingrese el nombre del cliente")
nombre =str(input())
print("Ingrese el tipo de cliente")
tipo_cliente = int(input())
print("Ingrese la cantidad de libros")
cantlibros = float(input())
print("Ingrese el valor de los libros")
costlibro = float(input())

#Proceso
print("Nombre del cliente: " ,nombre)
print("Tipo del cliente: ",tipo_cliente)
print("Cantidad de libros: ",cantlibros)
print("Costo por libro: ",costlibro)
subtotal=costlibro*cantlibros

if tipo_cliente==1:
    desc1=subtotal*0.30
    subtotal1=subtotal-desc1
    print("El descuento es de 30%: " ,desc1)
elif tipo_cliente==2:
    desc2=subtotal*0.20
    subtotal1=subtotal-desc2
    print("El descuento es de 20%: " ,desc2)
elif tipo_cliente==3:
    desc3=subtotal*0.10
    subtotal1=subtotal-desc3
    print("El descuento es de 10%: " ,desc3)

if(cantlibros>10):
    desca1=subtotal1*0.08
    subtotal1=subtotal1-desca1
    print("El descuento es de 4%: ",desca1)
else:
    if ((cantlibros>5)or(cantlibros<9)):
            desca2=subtotal1*0.04
            subtotal1=subtotal1-desca2
            print("El descuento es de 8%: " ,desca2)
print("El precio final es: ",subtotal1)


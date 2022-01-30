print("---Programa de tipos de datos, operadores y expreciones en Java")
print("Introduccion a la programacion")
print("Diego Alfonso Jumbo")
print("----")

#Tipos de datos enteros

num1 = 14
num2 = 2
num3 = num1 + num2
print("El valor de la variable entera num3 es: " ,num3)

#Tipos de datos reales - double

print("----")
dec1 = 0.7
dec2 = 9.65
dec3 = dec1 * dec2
print("El valor de la variable decimal dec3 es:  " ,dec3)

#Tipos de datos caracter - char

print("----")
letra1 = 'D'
letra2 = 'J'
print("Los caracteres son: " ,letra1 , letra2)

#Tipo de datos tipo cadena - string

nombre=str
apellido=str
domicilio=str
telefono=str

#Inicio de los string
nombre = "Diego Alfonso"
apellido = "Jumbo Pardo"
domicilio = "Av Salvador Bustamante Celi, Urbanizacion Estancia del Rio, Loja - Ecuador"
telefono = "072711033"

print("**Presentar variables string**")
print("Mi nombre es: " ,nombre)
print("Mi apellido es: " ,apellido)
print("Vivo en: " ,domicilio)
print("mi numero de telefono es: " ,telefono)
print("\n")
print("Me llamo " ,nombre, "" ,apellido,", vivo en " ,domicilio,", y mi telefono de casa es ",telefono,"\n")

print("**Presentar en una sola linea**")

print("Me llamo " ,nombre,"",apellido, ", vivo en ",domicilio, ", y mi telefono de casa es ",telefono,"\n")

print("**Presentar concatenar variables de tipo string** \n")

print("Me llamo",(nombre)," ",(apellido),(" y vivo en "),(domicilio),(" y mi telefono es "),(telefono))

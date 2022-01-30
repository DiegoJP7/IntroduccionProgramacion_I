print("Programa para calcular el area del poligono compuesto, \n");

#Declarar las variables
lc= float
at= float
ar= float
A= float
B= float
C = float
ats= float
area =float

lc=0; at=0; ar=0; A=0; B=0; C=0;
ats=0; area=0;

#Datos ingresar
print("Ingrese el lado del cuadrado");
lc = float(input())
print("Ingrese la altura de triangulo");
at = float(input())
print("Ingresar la altura del rectangulo");
ar = float(input())

#Proceso
A = pow(lc, 2);
B = (lc * at)/2;
ats = (B * 3);
C = lc * ar;
area = A + ats + B;

#salida
print("El area total del poligono es: " ,area, " con un cuadrado" ," de area " ,A ," con tres triangulos rectangulos de area " ,ats ," y un rectangulo de area " ,C ,"\n" );

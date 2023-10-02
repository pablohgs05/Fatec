#Criar um algoritmo que entre com o valor de x, calcule e imprima o valor de f(x)
import math as m
x = float(input("Digite o valor de X: "))
if x > 4 or x < (-4):
    fx = (5 * x + 3) / m.sqrt(x**2 - 16)
    print(f"\nf(x):{fx: .2f}")
else:
    print("\nNÃO PODE SER FEITA")
    print("\n")
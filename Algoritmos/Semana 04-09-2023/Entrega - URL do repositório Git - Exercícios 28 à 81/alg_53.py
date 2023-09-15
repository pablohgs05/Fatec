import math as m
a = float(input("\nDigite a base: "))
b = float(input("\nDigite a altura: "))
c = float(input("\nDigite a profundidade: "))
diagonal = m.sqrt(a**2 + b**2 + c**2)
print("\nDiagonal:", round(diagonal, 2))
print("\n")
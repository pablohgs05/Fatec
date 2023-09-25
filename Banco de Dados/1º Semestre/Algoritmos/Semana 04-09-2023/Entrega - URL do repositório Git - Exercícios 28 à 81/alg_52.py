import math as m
lado = float(input("\nDigite o lado do quadrado: "))
perimetro = 4 * lado
area = lado**2
diagonal = lado * (m.sqrt(2))
print("\nPerímetro:", round(perimetro, 2))
print("\nÁrea:", round(area, 2))
print("\nDiagonal:", round(diagonal, 2))
print("\n")
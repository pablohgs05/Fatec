import math as m
xnum1 = float(input("\nEntrar com o 1º valor: "))
xnum2 = float(input("\nEntrar com o 2º valor: "))
xnum3 = float(input("\nEntrar com o 3º valor: "))
x = (xnum1 + xnum2 / (xnum3 + xnum1) + 2 *(xnum1 - xnum2) + m.log(64.) / m.log(2.))
print("\nX:", round(x, 2))
print("\n")
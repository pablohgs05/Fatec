import math as m
altura = float(input("\nDigite a altura da lata: "))
raio = float(input("\nDigite o raio da lata: "))
volume = m.pi * raio**2 * altura
print("\nO volume da lata é:", round(volume, 2))
print("\n")
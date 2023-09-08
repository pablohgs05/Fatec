import math as m

angulo = float(input("\nDigite um ângulo em graus: "))
rang = (angulo*m.pi /180)
print("\nSeno: ", m.sin(rang))
print("\nCo-seno: ", m.cos(rang))
print("\nTangente: ", m.tan(rang))
print("\nCo-secante: ", 1/ m.sin(rang))
print("\nSecante: ", 1/m.cos(rang))
print("\nCotangente: ", 1/ m.tan(rang))
print("\n")
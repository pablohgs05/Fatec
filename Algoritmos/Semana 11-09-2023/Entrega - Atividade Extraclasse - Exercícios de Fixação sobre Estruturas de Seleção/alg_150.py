import math as m
ang = float(input("\nDigite o ângulo em graus: "))
rang = ang * m.pi / 180
if (rang > m.pi and rang <= m.pi) or (rang > 3 * m.pi / 2 and rang <= 2 * m.pi):
    print(f"\nSeno:{m.sin(rang): .2f}")
else:
    print(f"\nCo-seno:{m.cos(rang): .2f}")
print("\n")
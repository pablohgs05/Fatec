import math as m
N = int(input("Digite um número inteiro positivo (N): "))

if N <= 1:
    print("N não é um número primo.")
else:
    primo = True
    for i in range(2, int(m.sqrt(N)) + 1): #pode ficar int(m.sqrt(N)) ou int(N**0.5)
        if N % i == 0:
            primo = False
            break

    if primo:
        print(f"{N} é um número primo.")
    else:
        print(f"{N} não é um número primo.")
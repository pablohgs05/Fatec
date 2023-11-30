def fatorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * fatorial(n - 1)

def verificar_propriedades_fatorial(num):
    for i in range(3, num + 1):
        assert fatorial(i) > i, f"Fatorial({i}) não é maior que {i}."

    for i in range(1, num):
        assert fatorial(i + 1) == (i + 1) * fatorial(i), f"Fatorial({i + 1}) não é igual a ({i + 1}) * Fatorial({i})."

    print(f"As propriedades foram verificadas até {num}!")

numero = int(input('\nInsira um número inteiro positivo: '))
verificar_propriedades_fatorial(numero)
print()
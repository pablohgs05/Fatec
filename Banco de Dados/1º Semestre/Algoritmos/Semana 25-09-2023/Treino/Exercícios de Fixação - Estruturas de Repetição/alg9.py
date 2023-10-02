def fatores_primos(numero):
    fatores = {}
    divisor = 2

    while numero > 1:
        multiplicidade = 0

        while numero % divisor == 0:
            numero //= divisor
            multiplicidade += 1

        if multiplicidade > 0:
            fatores[divisor] = multiplicidade

        divisor += 1

    return fatores

numero = int(input("\nDigite um número inteiro positivo: "))

if numero <= 0:
    print("Por favor, digite um número inteiro positivo.")
else:
    resultado = fatores_primos(numero)
    print("Decomposição em fatores primos:")
    for fator, multiplicidade in resultado.items():
        print(f"{fator}^{multiplicidade}", end=" ")
print("\n")
#Inicialização do vetor
a = [0] * 10

#Leitura e armazenamento dos elementos em ordem decrescente
for L in range(10):
    n = int(input(f"Digite o número {L + 1}: "))
    c = L

    while c > 0 and n > a[c - 1]:
        a[c] = a[c - 1]
        c -= 1

    a[c] = n


print("\nVetor ordenado:")
for L in range(10):
    print(f"a[{L + 1}] - {a[L]}")
print()
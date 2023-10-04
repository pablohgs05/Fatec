n = int(input("\nDigite um número inteiro para calcular o número de Fibonacci: "))
a = 1
b = 1
if n == 1 or n == 2:
    print("Nessa posição, é o número 1")
else:
    for batata in range(3, n + 1):
        c = a + b
        a = b
        b = c
    print(f"O número na posição {n}º é: {b}")
print("\n")
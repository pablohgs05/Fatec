N = int(input("Digite um número inteiro positivo (N): "))

if N <= 0:
    print("N deve ser um número inteiro positivo.")
else:
    H = 0.0
    for i in range(1, N + 1):
        H += 1.0 / i

    print(f"O valor de H é: {H:.6f}")
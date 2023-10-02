def calcular_fibonacci(n):
    fib1 = 1
    fib2 = 1
    for int in range(3, n+1):
        fib1, fib2 = fib2, fib1 + fib2
    return fib2
while True:
    try:
        n = int(input("\nDigite um número inteiro maior ou igual a 1: "))
        if n < 1:
            print("\n\n\n\n\nTente novamente.")
        else:
            resultado = calcular_fibonacci(n)
            print(f"Na {n}º posição, o número de fibonacci é {resultado}")
            break
    except ValueError:
        print("\n\n\n\n\n\nTente novamente e entre apenas com números.")
print("\n")
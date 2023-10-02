def calcularmdc(numero1, numero2):
    while numero2 != 0:
        numero1, numero2 = numero2, numero1 % numero2
    return numero1
while True:
    try:
        numero1 = int(input("\nDigite o primeiro número inteiro positivo: "))
        numero2 = int(input("Digite o segundo número: "))
        if numero1 > 0 and numero2 > 0:
            mdc = calcularmdc(numero1, numero2)
            print(f"\n\nO MDC de {numero1} e {numero2} é {mdc}")
            break
        else:
            print("\n\n\n\n\n\nTente novamente com números positivos.")
    except ValueError:
        print("\n\n\n\n\n\nCertifique-se que está utilizando números inteiros e positivos e tente novamente.")
print("\n")
#1 + 2 + 3 + ... + n = n.(n + 1) / 2
def soma_ate_n(n):
    return n * (n + 1) // 2

def verifica(n):
    for i in range(1, n + 1):
        if sum(range(1, i + 1)) != soma_ate_n(i):
            return False
    return True

numero = int(input('\nInsira um número inteiro positivo: '))
if verifica(numero):
    print(f'A afirmação é verdadeira para números de 1 até {numero}.')
else:
    print(f'A afirmação é falsa para números de 1 até {numero}.')
print()
def obter_fecho(relacao):
    fecho = set(relacao)
    for a, b in relacao:
        fecho.add((b, a))
    return fecho

def saida():
    relacao = set()
    print()
    while True:
        pair = input("Insira um par ordenado separado por vírgula (ou 'sair' para terminar): ")
        if pair.lower() == 'sair':
            break
        try:
            a, b = map(int, pair.split(','))
            relacao.add((a, b))
        except ValueError:
            print("\nEntrada inválida. Por favor, insira um par ordenado por vez como '1,2'")
    print("\nO fecho simétrico dos pares é:", obter_fecho(relacao))


saida()
print()
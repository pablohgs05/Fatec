def fecho_reflexivo(relacao):
    fecho = set(relacao)
    elements = {a for a, b in relacao} | {b for a, b in relacao}
    for a in elements:
        fecho.add((a, a))
    return fecho

def pedido():
    relacao = set()
    print()
    while True:
        pair = input("Insira um par ordenado ('s' para sair): ")
        if pair.lower() == 's':
            break
        try:
            a, b = map(int, pair.split(','))
            relacao.add((a, b))
        except ValueError:
            print("\nEntrada inválida. Insira um par ordenado como '1,2'")
    print("\nO fecho reflexivo é:", fecho_reflexivo(relacao))


pedido()
print()
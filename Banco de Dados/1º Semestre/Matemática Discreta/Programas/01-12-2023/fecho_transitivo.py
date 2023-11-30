def transitivo(pares):
    fechotransitivo = set(pares)

    for a, b in fechotransitivo.copy():
        for c, d in fechotransitivo.copy():
            if b == c and (a, d) not in fechotransitivo:
                fechotransitivo.add((a, d))

    return fechotransitivo

def trvo():
    pares_ordenados = set()
    print()
    while True:
        entrada = input("Insira um par ordenado ('s' para sair): ").strip().lower()

        if entrada == 's':
            break

        try:
            a, b = map(int, entrada.split(','))
            pares_ordenados.add((a, b))
        except ValueError:
            print("\nEntre apenas com pares no formato '1,2'")

    fecho_transitivo = transitivo(pares_ordenados)
    print("\nFecho transitivo:")
    for par in fecho_transitivo:
        print(par)

trvo()
print()
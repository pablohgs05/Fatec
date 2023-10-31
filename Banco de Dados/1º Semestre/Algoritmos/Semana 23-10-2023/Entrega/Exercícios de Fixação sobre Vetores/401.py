op = 0
c = 0
posmenor = 0
posmaior = 0
dados1 = [None] * 50
dados2 = [None] * 50
dados3 = [None] * 50
milha = [0.0] * 50

while op != 6:
    print("\n********************")
    print("* MENU *")
    print("********************")
    print("1 - cadastra dados do cliente")
    print("2 - cadastra milhagem do cliente")
    print("3 - lista milhagem do cliente")
    print("4 - imprime os nomes que têm maior e menor milhagem")
    print("5 - imprime os nomes e as milhagens")
    print("6 - SAIR")
    op = int(input("OPÇÃO: "))

    if op == 1:
        if c < 50:
            print(c, "- nome: ", end="")
            dados1[c] = input()
            print("endereco: ", end="")
            dados2[c] = input()
            print("telefone: ", end="")
            dados3[c] = input()
            c += 1
        else:
            print("arquivo cheio")

    elif op == 2:
        print("nome para procura: ", end="")
        nome = input()
        d = 0
        while d < c - 1 and nome != dados1[d]:
            d += 1
        if nome == dados1[d]:
            print(f"digite milhagem de {dados1[d]}: ", end="")
            milhas = float(input())
            milha[d] -= milhas
        else:
            print("nome não encontrado")

    elif op == 3:
        print("nome para procura: ", end="")
        nome = input()
        d = 0
        while d < c - 1 and nome != dados1[d]:
            d += 1
        if nome == dados1[d]:
            print(f"milhagem de {dados1[d]}: {milha[d]}")
        else:
            print("não encontrado")

    elif op == 4:
        d = 1
        posmenor = 0
        posmaior = 0
        while d <= c:
            if milha[d] > milha[posmaior]:
                posmaior = d
            else:
                if milha[d] < milha[posmenor]:
                    posmenor = d
            d += 1
        print("\nDados da pessoa de maior milhagem")
        print(f"Nome: {dados1[posmaior]}")
        print(f"Endereco: {dados2[posmaior]}")
        print(f"Telefone: {dados3[posmaior]}")
        print(f"Milhagem: {milha[posmaior]}\n")
        print("Dados da pessoa de menor milhagem")
        print(f"Nome: {dados1[posmenor]}")
        print(f"Endereco: {dados2[posmenor]}")
        print(f"Telefone: {dados3[posmenor]}")
        print(f"Milhagem: {milha[posmenor]}")

    elif op == 5:
        print("Listagem")
        for d in range(c):
            print(f"{d + 1}- {dados1[d]}: {milha[d]}")

    elif op == 6:
        print("BOA VIAGEM")

    else:
        print("Opção inexistente")
print()
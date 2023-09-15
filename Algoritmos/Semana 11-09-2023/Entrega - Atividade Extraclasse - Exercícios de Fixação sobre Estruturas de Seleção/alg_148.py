op = int(input("\n1 = Norte \n2 = Nordeste \n3 = Centro-Oeste \n4 = Sul \nDigite o número: "))
iv = int(input("\n1 = Ida \n2 = Ida e Volta \nDigite o número: "))
if op == 1:
    if iv == 1:
        print("\nO valor da passagem de ida será R$500,00")
    elif iv == 2:
        print("\nO valor da passagem de ida e volta será R$950,00")
    else:
        print("\nTente novamente e digite 1 ou 2.")
elif op == 2:
    if iv == 1:
        print("\nO valor da passagem de ida será R$350,00")
    elif iv == 2:
        print("\nO valor da passagem de ida e volta será R$650,00")
    else:
        print("\nTente novamente e digite 1 ou 2.")
elif op == 3:
    if iv == 1:
        print("\nO valor da passagem de ida será R$350,00")
    elif iv == 2:
        print("\nO valor da passagem de ida e volta será R$600,00")
    else:
        print("\nTente novamente e digite 1 ou 2.")
elif op == 4:
    if iv == 1:
        print("\nO valor da passagem de ida será R$300,00")
    elif iv == 2:
        print("\nO valor da passagem de ida e volta será R$550,00")
    else:
        print("\nTente novamente e digite 1 ou 2.")
else:
    print("\nTente novamente e selecione entre a região 1 à 4.")
print("\n")
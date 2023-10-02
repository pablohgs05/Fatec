while True:
    try:
        nota = float(input("\nDigite uma nota entre 0 e 10: "))
        if nota < 0 or nota > 10:
            print("\n\n\n\n\n\n\n\n\n\n\n\n\n\nValor inválido, tente novamente.")
        else:
            print("\n\nValor válido, encerrando programa.")
            break
    except ValueError:
        print("\n\n\n\n\n\n\n\n\n\n\n\n\n\nErro: entre apenas com números")
print("\n")
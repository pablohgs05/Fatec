#Venda de combustiveis com desconto
while True:
    combustivel = str(input("\nEscolha um combustível; G para gasolina e A para álcool: ")).upper()
    if combustivel == 'A':
        litro = int(input("\nDigite quantos litros vai querer: "))
        if litro <= 20:
            preco1 = (2.90 * 0.97) * litro
            print(f"\nCom desconto, você pagará {preco1: .2f}")
            break
        else:
            preco2 = (2.90 * 0.95) * litro
            print(f"\nCom desconto, você pagará {preco2: .2f}")
            break
    elif combustivel == 'G':
        litro = int(input("\nDigite quantos litros vai querer: "))
        if litro <= 20:
            preco1 = (3.30 * 0.96) * litro
            print(f"\nCom desconto, você pagará {preco1: .2f}")
            break
        else:
            preco2 = (3.30 * 0.94) * litro
            print(f"\nCom desconto, você pagará {preco2: .2f}")
            break
    else:
        print("\n\n\n\n\n\nPor favor, escolha a letra correspondente ao seu combustível.")
print("\n")
#Pede o número decimal
decimal = int(input("\n\n\n\n\n\n\n\n\n\nDigite um número decimal: "))
#Converte o número decimal em binário
binario = bin(decimal)
#Tira o "0b"
bi=binario[2:]
#Resultado
print(f"\nO binário é: {bi}")
print("\n")
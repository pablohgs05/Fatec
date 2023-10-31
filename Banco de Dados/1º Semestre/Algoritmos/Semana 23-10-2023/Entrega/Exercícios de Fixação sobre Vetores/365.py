#Listas vazias
num = []
valor = []
data = []
destino = []

nc = int(input("\nNúmero de cheques do talonário: "))

for k in range(nc):
    print(f"\nNúmero do cheque {k + 1}:")
    num.append(input())
    
    print(f"Valor do cheque {k + 1}:")
    valor.append(input())
    
    print(f"Data do cheque {k + 1} (ddmmaa):")
    data.append(input())
    
    print(f"Destino do cheque {k + 1}:")
    destino.append(input())

print("\nRelação dos cheques\n")
for k in range(nc):
    print("\nNúmero do cheque:", num[k])
    print("\nValor do cheque:", valor[k])
    print("\nData do cheque:", data[k])
    print("\nDestino do cheque:", destino[k])
    resp = input("\n\nPressione enter para ver outro cheque: ")
print()
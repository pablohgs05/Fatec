#Define os pesos das medalhas
peso_bronze = 1
peso_prata = 2
peso_ouro = 3

#Solicita informações para os três países
paises = []

for i in range(3):
    nome = input(f"\nDigite o nome do {i+1}º país: ")
    ouro = int(input("Digite a quantidade de medalhas de ouro: "))
    prata = int(input("Digite a quantidade de medalhas de prata: "))
    bronze = int(input("Digite a quantidade de medalhas de bronze: "))
    pontuacao = ouro * peso_ouro + prata * peso_prata + bronze * peso_bronze
    paises.append((nome, pontuacao))

#Classifica os países com base na pontuação
paises.sort(key=lambda x: x[1], reverse=True)

#Imprime a classificação
print("\nA classificação é:")
for i, (nome, pontuacao) in enumerate(paises, start=1):
    print(f"{i}. {nome} - Pontuação: {pontuacao}")
print("\n")
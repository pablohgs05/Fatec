#Ter como objetivo calcular o peso ideal para as pessoas com altura e sexo
#Fórmula para homens: (72.7*h)-58
#Fórmula para mulheres: (62.1*h)-44.7
while True:
    try:
        h = float(input("\nDigite sua altura em metros: "))
        break
    except ValueError:
        print("\n\n\nPor favor, tente novamente digitando apenas números.")
while True:
    sexo = str(input("\nDigite M para masculino ou F para feminino: ")).upper()
    if sexo == 'M':
        peso_ideal = (72.7*h)-58
        print(f"\nSeu peso ideal é:{peso_ideal: .2f}")
        break
    elif sexo == 'F':
        peso_ideal = (62.1*h)-44.7
        print(f"\nSeu peso ideal é:{peso_ideal: .2f}")
        break
    else:
        print("\n\n\nPor favor, tente novamente com a letra respectiva ao seu sexo.")
print("\n")
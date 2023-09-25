#Pede ao usuário para digitar os elementos de A
entradaA = input("\nDigite os elementos do conjunto A separados por (;): ")
#Transforma os elementos em uma lista
conjA = set(entradaA.split(';'))
#Pede ao usuário para digitar os elementos de B
entradaB = input("Digite os elementos do conjunto B separados por (;): ")
#Transforma os elementos em uma lista
conjB = set(entradaB.split(';'))
#Calcula a intersecção
intersecao = conjA.intersection(conjB)
#Resultado
print(f"\nA∩B = {intersecao}")
print("\n")
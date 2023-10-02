#Construa um algoritmo que seja capaz de dar a classificação de 3 países informados. Para cada país é informado o nome, quantidade de medalhas de ouro, prata e bronze. Considere que cada medalha de ouro tem peso 3, cada de prata tem peso 2 e cada de bronze tem peso 1.
bronze = 1
prata = 2
ouro = 3
pais1 = str(input("\nDigite o primeiro país: "))
bron1 = int(input("Digite a quantidade de medalhas de bronze: "))
pra1 = int(input("Digite a quantidade de medalhas de prata: "))
ou1 = int(input("Digite a quantidade de medalhas de ouro: "))
pais2 = str(input("\nDigite o segundo país: "))
bron2 = int(input("Digite a quantidade de medalhas de bronze: "))
pra2 = int(input("Digite a quantidade de medalhas de prata: "))
ou2 = int(input("Digite a quantidade de medalhas de ouro: "))
pais3 = str(input("\nDigite o terceiro país: "))
bron3 = int(input("Digite a quantidade de medalhas de bronze: "))
pra3 = int(input("Digite a quantidade de medalhas de prata: "))
ou3 = int(input("Digite a quantidade de medalhas de ouro: "))
valora1 = bron1 * bronze
valora2 = pra1 * prata
valora3 = ou1 * ouro
valorb1 = bron2 * bronze
valorb2 = pra2 * prata
valorb3 = ou2 * ouro
valorc1 = bron3 * bronze
valorc2 = pra3 * prata
valorc3 = ou3 * ouro
if (valora1 + valora2 + valora3) > (valorb1+valorb2+valorb3) > (valorc1+valorc2+valorc3):
    print(f"\nA classificação é:\n1.{pais1}\n2.{pais2}\n3.{pais3}")
elif (valora1 + valora2 + valora3) > (valorc1+valorc2+valorc3) > (valorb1+valorb2+valorb3):
    print(f"\nA classificação é:\n1.{pais1}\n2.{pais3}\n3.{pais2}")
elif (valorb1+valorb2+valorb3) > (valora1 + valora2 + valora3) > (valorc1+valorc2+valorc3):
    print(f"\nA classificação é:\n1.{pais2}\n2.{pais1}\n3.{pais3}")
elif (valorb1+valorb2+valorb3) > (valorc1+valorc2+valorc3) > (valora1 + valora2 + valora3):
    print(f"\nA classificação é:\n1.{pais2}\n2.{pais3}\n3.{pais1}")
elif (valorc1+valorc2+valorc3) > (valora1 + valora2 + valora3) > (valorb1+valorb2+valorb3):
    print(f"\nA classificação é:\n1.{pais3}\n2.{pais1}\n3.{pais2}")
elif (valorc1+valorc2+valorc3) > (valorb1+valorb2+valorb3) > (valora1 + valora2 + valora3):
    print(f"\nA classificação é:\n1.{pais3}\n2.{pais2}\n3.{pais1}")
print("\n")
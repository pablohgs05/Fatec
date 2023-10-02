#Dados três valores A, B, C, elaborar um algoritmo para verificar se eles pode ser os comprimentos dos lados de um triângulo. Se forem, verificar se compõem um triângulo equilátero, isósceles ou escaleno. Informar se não compuserem nenhum triângulo.
while True:
    try:
        l1 = float(input("\nDiga o primeiro lado: "))
        l2 = float(input("Diga o segundo lado: "))
        l3 = float(input("Diga o terceiro lado: "))
        if l1+l2 > l3 and l1+l3 > l2 and l3+l2 > l1:
            if l1 == l2 == l3:
                print("\n\nCom esses dados, é possível formar um triângulo equilátero.")
                break
            elif l1 == l2 or l1 == l3 or l2 == l3:
                print("\n\nCom esses dados, é possível formar um triângulo isósceles.")
                break
            else:
                print("\n\nCom esses dados, é possível formar um triângulo escaleno.")
                break
        else:
            print("\n\nNão é possível compor um triângulo")
            break
    except ValueError:
        print("\n\n\n\n\n\n\n\n\nPor favor, tente novamente e entre apenas com números.")
print("\n")
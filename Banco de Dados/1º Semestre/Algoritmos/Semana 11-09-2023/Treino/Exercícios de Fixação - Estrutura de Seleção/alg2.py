#Algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem crescente.
while True:
    try:
        valor1 = int(input("\nEntre com um valor inteiro: "))
        valor2 = int(input("Entre com um valor inteiro diferente do anterior: "))
        valor3 = int(input("Entre com um valor inteiro diferente dos anteriores: "))
        if valor1 < valor2 < valor3:
            print(f"\nA ordem crescente é: {valor1};{valor2};{valor3}")
            break
        elif valor1 < valor3 < valor2:
            print(f"\nA ordem crescente é: {valor1};{valor3};{valor2}")
            break
        elif valor2 < valor1 < valor3:
            print(f"\nA ordem crescente é: {valor2};{valor1};{valor3}")
            break
        elif valor2 < valor3 < valor1:
            print(f"\nA ordem crescente é: {valor2};{valor3};{valor1}")
            break
        elif valor3 < valor1 < valor2:
            print(f"\nA ordem crescente é: {valor3};{valor1};{valor2}")
            break
        elif valor3 < valor2 < valor1:
            print(f"\nA ordem crescente é: {valor3};{valor2};{valor1}")
            break
        else:
            print("\n\n\n\n\n\n\n\n\n\n\n\nTente novamente colocando valores distintos.")
    except ValueError:
        print("\n\n\n\n\n\n\n\n\n\n\n\nTente novamente e coloque apenas números inteiros.")
print("\n")
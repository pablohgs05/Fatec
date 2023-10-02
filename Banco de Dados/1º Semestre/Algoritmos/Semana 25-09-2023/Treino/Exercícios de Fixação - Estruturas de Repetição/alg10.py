#Verifica se o número é positivo
while True:
    try:
        # Solicita ao usuário um número inteiro positivo
        numero = int(input("\nDigite um número inteiro positivo: "))
        if numero < 0:
            print("\n\n\nPor favor, digite um número inteiro positivo.")
        else:
            #Converte o número em uma string para facilitar a inversão
            numero_str = str(numero)  
            #Inverte a string
            numero_invertido = numero_str[::-1]
            print(f"Número invertido: {numero_invertido}")
            break
    except ValueError:
        print("\n\n\nPor favor, não entre com caracteres que não sejam números.")
print("\n")
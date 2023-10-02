def primo(numero):
    #Verifica se o número é menor ou igual a 1, pois números menores que 2 não são primos
    if numero <= 1:
        return False    
    #Verifica se o número é divisível por algum número de 2 até a raiz quadrada do número
    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            return False 
    #Se não foi encontrado nenhum divisor, o número é primo
    return True
#Solicita ao usuário um número inteiro positivo
numero = int(input("\nDigite um número inteiro positivo: "))
#Verifica se o número é primo e exibe o resultado
if primo(numero):
    print(f"{numero} é um número primo.")
else:
    print(f"{numero} não é um número primo.")
print("\n")
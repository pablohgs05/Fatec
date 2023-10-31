#Inicialização do vetor num com 15 elementos
num = [0] * 15

#Trecho de entrada de 15 elementos
for L in range(15):
    print(f"Digite o {L + 1} número: ")
    num[L] = int(input())

#Trecho de saída
print("\nRelação dos números\n")
for L in range(15):
    print(f"\n{L + 1} - {num[L]}", end=' ')
    
    if num[L] % 2 == 0:
        print("é par")
    else:
        print("é ímpar")
print()
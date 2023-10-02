def eh_triangular(n):
    produto = 1
    int = 1
    while produto < n:
        int += 1
        produto += int
    return produto == n

numero = int(input("\nDigite um número não-negativo: "))
if eh_triangular(numero):
    print(f"\n{numero} é um número triangular.")
else:
    print(f"\n{numero} não é um número triangular.")
print("\n")
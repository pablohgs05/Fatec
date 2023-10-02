conta = int(input("\nDigite o valor da conta a ser paga: "))
pagamento = int(input("Digite o valor do pagamento realizado: "))
troco = pagamento - conta
notas = [50, 20, 10, 5, 2, 1]
for nota in notas:
    if troco >= nota:
        notas = troco // nota
        print(f"\nO troco será composto por {notas} nota(s) de {nota} reais.")
        troco = troco % nota
print("\n")
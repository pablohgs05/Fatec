deposito = float(input("\nValor do depósito: "))
taxa = float(input("\nValor da taxa de juros: "))
valor = deposito * taxa / 100
total = deposito + valor
print("\nRendimentos:", round(valor, 2), "\nTotal:", round(total, 2))
print("\n")
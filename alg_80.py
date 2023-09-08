quant = int(input("\nDigite a quantidade de fitas: "))
valAluguel = float(input("\nDigite o valor do aluguel: "))
fatAnual = quant/3 * valAluguel * 12
print("\nFaturamento anual:", round(fatAnual, 2))
multas = valAluguel * 0.1 * (quant/3) / 10
print("\n Multas mensais:", round(multas, 2))
quantFinal = (quant - quant * 0.02 + quant/10) #/* quant * 1.08 */??
print("\nQuantidade de fitas vendidas no final do ano:", round(quantFinal, 2))
print("\n")
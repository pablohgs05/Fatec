saldomedio = float(input("\nDigite o saldo médio: "))
if saldomedio < 501:
    credito = 0
elif saldomedio < 1001:
    credito = saldomedio * 0.3
elif saldomedio < 3001:
    credito = saldomedio * 0.4
elif saldomedio > 3000:
    credito = saldomedio * 0.5
if credito != 0:
    print(f"\nComo seu saldo era de:{saldomedio: .2f}, seu crédito será de:{credito: .2f}")
else:
    print(f"\nComo seu saldo era de:{saldomedio: .2f}, você não terá créditos.")
print("\n")
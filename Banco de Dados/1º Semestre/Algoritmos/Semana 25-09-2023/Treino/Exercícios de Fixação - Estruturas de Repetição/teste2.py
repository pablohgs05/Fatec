alcool = 4.89
gasolina = 6.58
comb = str(input("\nEntre com A para alcool ou G para gasolina: ")).upper()
litros = int(input("\nQuantos litros? "))
if comb == "A":
    if litros < 20:
        desconto = alcool * 0.97
    else:
        desconto = alcool * 0.95
elif comb == "G":
    if litros < 20:
        desconto = gasolina * 0.96
    else:
        desconto = gasolina * 0.94
else:
    print("\nCombustivel desconhecido.")
total = litros * desconto
print(f"\nO valor a ser pago será:{total: .2f}")
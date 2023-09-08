na = int(input("\nHoras trabalhadas: "))
vha = float(input("\nValor da hora-aula: "))
pd = float(input("\nPercentual de desconto: "))
sb = (na * vha)
td = (pd / 100) * sb
sl = sb - td
print("\nSalário líquido:", round(sl, 2))
print("\n")
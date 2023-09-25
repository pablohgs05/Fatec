num = float(input("\nDigite um número com parte fracionária: "))
numi = int((num - 0.5))
numfrac = num - numi
numa = round(num)
print("\nParte inteira:", numi)
print("\nParte fracionária:", round((numfrac + 0.00001), 3))
print("\nNúmero arredondado: ", numa)
print("\n")
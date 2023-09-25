#Pergunta ao usuário se são verdadeiros ou falsos
p = input("\nDiga se P é verdadeiro(v) ou falso(f): ").strip().lower()
q = input("Diga se Q é verdadeiro(v) ou falso(f): ").strip().lower()

if p not in ['v', 'f'] or q not in ['v', 'f']:
    print("\n\nTente novamente e digite V ou F.")
    print("\n")
else:
    #P<->Q
    if (p == 'v' and q == 'v') or (p == 'f' and q == 'f'):
        resultado = 'verdadeiro'
    else:
        resultado = 'falso'

    print(f"\nP<->Q é {resultado}")
print("\n")

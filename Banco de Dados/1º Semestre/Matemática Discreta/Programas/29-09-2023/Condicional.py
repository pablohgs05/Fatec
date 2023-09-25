#Pergunta ao usuário se são falsos ou verdadeiros
p = input("\nDiga se P é verdadeiro(v) ou falso(f): ").strip().lower()
q = input("Diga se Q é verdadeiro(v) ou falso(f): ").strip().lower()

if p not in ['v', 'f'] or q not in ['v', 'f']:
    print("\n\nTente novamente e digite V ou F.")
    print("\n")
else:
    #p->q
    if p == 'v' and q == 'f':
        resultado = 'falso'
    else:
        resultado = 'verdadeiro'

    print(f"\nP->Q é {resultado}")
print("\n")
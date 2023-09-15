#Entrar com o valor de x e imprimir y:
x = float(input("\nDigite o valor de x: "))
if x <= 1:
    y = 1
else:
    if x <= 2:
        y = 2
    else:
        if x <= 3:
            y = x ** 2
        else:
            y = x ** 3
print(f"\nValor de f(x):{y: .2f}")
print("\n")
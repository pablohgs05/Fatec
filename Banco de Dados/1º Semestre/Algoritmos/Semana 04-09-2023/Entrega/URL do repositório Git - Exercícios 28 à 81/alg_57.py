import math as m
pr1 = float(input("\nDigite a pr1: "))
pr2 = float(input("\nDigite a pr2: "))
mf = (pr1+pr2) / 2
print("\nMédia truncada:", int((mf - 0.5) + 0.001))
print("\nMédia arredondada:", int(mf+0.001))
print("\n\n\nNão consegui fazer a truncada ir para baixo e a arredondada para cima, elas estão se igualando")
print("\n")
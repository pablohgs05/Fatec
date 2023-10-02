#Aqui está a quantidade inicial de habitantes nos países
A = 80000
B = 200000
#Essa é a taxa de crescimento anual
crescimentoA = 0.03
crescimentoB = 0.015
#Como na primeira seção vemos a quantidade inicial, então a quantidade de anos é 0
anos = 0
#Por fim, para calcular em quanto tempo levará para A alcançar B:
#O "+=" serve para pegar o termo anterior e somar com o(s) próximo(s):
#Exemplo: (A += A * crescimentoA) = (A = A + A * crescimentoA)
while A < B:
    A += A * crescimentoA
    B += B * crescimentoB
    anos += 1
print(f"\nDemorará {anos} anos para que a população de A ultrapasse ou se iguale com B.")
print("\n")
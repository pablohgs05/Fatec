import openpyxl #Objetivo do código: realizar o fechamento de turmas pelo adm

#Nome do arquivo Excel
arquivo_excel = "Dados Cadastrais.xlsx"

#Carregar o arquivo
try:
    book = openpyxl.load_workbook(arquivo_excel)
except FileNotFoundError:
    print("O arquivo Excel não foi encontrado.")
    exit()

#Função criada para fechar uma turma específica
def fechar_turma(book, turma_numero):
    turma_nome = f"Turma {turma_numero}"
    if turma_nome in book.sheetnames:
        sheet = book[turma_nome]
        novo_nome = f"{turma_nome} (fechada)"
        sheet.title = novo_nome
        book.save(arquivo_excel)
        print(f"\n{turma_nome} foi fechada com sucesso.")
    else:
        print(f"\nA turma {turma_nome} já foi fechada ou não foi encontrada.")

#Outra função que agora pergunta ao usuário se deseja continuar fechando turmas
def continuar_fechando():
    while True:
        resposta = input("\nDeseja continuar fechando turmas? (S para continuar ou N para sair): ").strip().lower()
        if resposta == 's':
            turma_numero = int(input("Digite o número da próxima turma que deseja fechar: "))
            fechar_turma(book, turma_numero)
        elif resposta == 'n':
            book.save(arquivo_excel)
            print("Encerrando programa.")
            break
        else:
            print("Resposta inválida. Por favor, digite 'S' para continuar ou 'N' para sair e salvar.")

#Pergunta ao usuário qual o número da turma que deseja fechar
turma_numero = int(input("\nDigite o número da turma que deseja fechar: "))
fechar_turma(book, turma_numero)

#Por fim, pergunta se gostaria de continuar fechando turmas, ativando a função da linha 25-37
continuar_fechando()
print("\n")
while True:
    usuario = str(input("\nDigite o usuário: "))
    senha = str(input("Digite a senha: "))
    if usuario == senha:
        print("\n\n\n\n\nTente novamente e coloque a senha diferente do usuário.")
    else:
        print("\n\nEncerrando programa...")
        break
print("\n")
numero = int(input("Digite um número inteiro positivo maior que 1: "))

if numero <= 1:
    print("Número invalido.")
else:
    eh_primo = True

    for i in range(2, numero):
        if numero % i == 0:
            eh_primo = False
            break

    if eh_primo:
        print(f"O número {numero} é um número primo.")
    else:
        print(f"O número {numero} não é primo.")
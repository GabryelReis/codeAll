io.write("Entre com o 1o. valor: ")
A = io.read("*number") -- Informa que a entrada é um valor inteiro ou real.
io.write("Entre com o 2o. valor: ")
B = io.read("*number")

soma = A + B
vezes = A * B
divisao = A / B
menos = A - B

io.write("\nAdição..........: ", soma, "\n")
io.write("Subtração.......:", menos, "\n")
io.write("Multiplicação...:", vezes, "\n")
io.write("Divisão.........:", divisao, "\n")

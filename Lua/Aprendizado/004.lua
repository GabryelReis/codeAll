-- Outputs: saída de dados!
print("Digite um valor: ")

valor = io.read() 

-- Lê um valor que entra pelo teclado, esse valor será
-- armazenado na variável valor
 
print("\nO valor digitado foi: " .. tostring(valor))

--[[
Numa chamada a uma função, por exemplo o tostring(),
o valor passado dentro dos () é chamado de argumento.

O valor retornado pela função é chamado de retorno ou
saída.

E a função pode executar algo sem retornar, apenas 
executar uma tarefa, como a função print().

FONTE: Cria Jogo, aula 5.
]]--

print("\nYour name: ")
name = io.read()
print("\nYou nick: ")
nick = io.read()

print("\nYour name's: " .. name .. " " .. nick)

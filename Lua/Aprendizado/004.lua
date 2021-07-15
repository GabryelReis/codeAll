-- Outputs: saída de dados!
print("Digite um valor: ")

valor = io.read() 

-- Lê um valor que entra pelo teclado, esse valor será
-- armazenado na variável valor
 
print("\nO valor digitado foi: " .. tostring(valor))

print("\nYour name: ")
name = io.read()
print("\nYou nick: ")
nick = io.read()

print("\nYour name's: " .. name .. " " .. nick)

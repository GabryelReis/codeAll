--tabelas dentro de tabelas:
-- tabela = {variavel = 10, tabela1 = {}}
-- temos o if, elseif e else

money_cool = 150

function money()
	if (money_cool >= 100 and <= 200) then
		print("Dinheiro entre 100 e 200: " .. money_cool)
	elseif money_cool < 100 then
		print("O negócio está feio, irmão :( " .. money_cool)
	else 
		print("Só os patrãozão \o/ " .. money_cool)
	end
end
 
money()

money_cool = 9

money()

money_cool = 1000

money()

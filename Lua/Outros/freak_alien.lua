print('------------------------------------------------------------')
print('Freak Alien!')
print('------------------------------------------------------------')
print('Feito por: Gabryel Reis')
print('------------------------------------------------------------')
print('\n\nHistória: Você é um alien maluco que decidiu explodir uns planetas')
print('por aí, você pega a sua nave e parte rumo ao espaço sideral.\n')


::continue::
print("Escolha um planeta para explodir: ")
io.read()

print ("Digite F para explodir o planeta :)")

function atirar(tecla)
    tecla = io.read()
    return tecla == 'F' --O retorno verdadeiro é F
end

municao = 10

function verificarMunicao()
    if municao >= 1 then
        return true
    else
        return false
    end
end

while verificarMunicao() do
    if atirar(tecla) and verificarMunicao() then --Se o retorno for versadeiro, então
        print("Tiro no alvo! Buuuuum!") --Exploda!
        municao = municao - 1
        print("Sua munição: " .. municao)
    end
end

if municao == 0 then
    print("Suas munições acabaram, você não pode mais explodir uns planetas por aí :(")
end

print('\nDigite CONTINUAR para jogar novamente ou digite SAIR para sair do jogo:')
::final::
continuar_jogo = io.read()
    
if continuar_jogo == 'CONTINUAR' then
    print('Recarregando munições...')
    print('\n\n\n')
    goto continue
elseif continuar_jogo == 'SAIR' then
    print('\nObrigado por ter jogado, até mais :)')
else
    print('\nPor favor, digite CONTINUAR para continuar o jogo ou SAIR para sair do jogo')
    goto final
end

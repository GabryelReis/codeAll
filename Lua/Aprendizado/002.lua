-- Valores booleanos:

verdadeiro = true
falso = false

-- Falso e verdadeiro são valores booleanos, valores
-- lógicos, algo só pode ser verdadeiro ou falso.

print (verdadeiro == falso) -- É igual?

-- Retorna false, porque algo verdadeiro não é igual 
-- a algo falso.

print (verdadeiro == true) -- É igual?

-- Sim, algo verdadeiro é igual a algo verdadeiro.

print (falso == false) -- É igual?

-- Sim, algo falso é igual a algo falso.

print("Verdadeiro é verdadeiro? " .. tostring(verdadeiro) )

-- tostring() é uma função que transforma um valor em
-- string, em texto. String == cadeia de caracteres,
-- um texto. tostring significa to (para) com string
-- (cadeia de caracteres, texto), ou seja, converte
-- um valor para um texto, de um valor, seria como
-- converter um número para texto (1 viraria "1").

--[[

Os operadores lógicos:

>
<
>=
<=
==

Retornam valores booleanos, valores lógicos, ou seja,
true ou false (verdadeiro ou falso).
]]--

-- BÔNUS:

-- Valor nil significa que algo não tem nada.

nulo = nil
print(nulo) -- Represento que na variável nulo não
	    -- há absolutamente nada.

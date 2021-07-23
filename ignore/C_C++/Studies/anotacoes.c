/*
C, implementada originalmente por Dennis Ritchie,  utilizada para criar o SO Unix, originou-se da linguagem
B, que veio da linguagem BCPL.

C é denominado como linguagem de médio nível, porque C combina elementos de linguagens de alto nível com as
de baixo nível, no caso o Assembly.

Com C podemos manipular bits, bytes e endereços -- elementos básicos dos quais os PCs funcionam.
O C é portável, ou seja,  um mesmo código-fonte pode ser compilado em vários sistemas diferentes.

Linux -----|
           |
Windows -------- C
	   |
MacOS -----|

Tipos de dados: inteiro, caractere ou real.

As palavras-chaves de C:

auto, break, case, char, const, continue, default, do, double, else, enum, extern, float, for, goto, if, int,
long, register, return, short, signed, sizeof, static, struct, switch, typedef, union, unsigned, void,
volatile, while.

Os interpretadores são mais lentos porque o interpretador lê seu código linha-por-linha, enquanto vai
aportando os erros, se caso tiver, e só depois ele executa o código, quando não houver mais erros.
Com uma linguagem compilada, ela é convertida para machine-code, senão houver erros, e depois disso o programa
pode ser executado.

O C funciona com funções, a principal é a função main(), que é a primeira função a ser chamada quando criamos
um programa. A função main() é o esboço do seu programa, sendo o esboço um composto de chamadas de funções.

OFF_TOPIC: Utilize a biblioteca <stdlib.h> para importar o system("CLS");
OFF_TOPIC: <bits/stdc++.h> importa bibliotecas padrões no C++.
*/

# Descrições Sintáticas e Semânticas 

## Linguagem Fictícia: SimpleCode

### 1. Gramática em Pseudocódigo (BNF Simplificado)

    <programa>      ::= <declaração>+
    <declaração>    ::= <atribuição> | <condicional> | <repetição> | <saída>
    <atribuição>    ::= IDENTIFICADOR '=' <expressão> ';'
    <expressão>     ::= <termo> (OPERADOR <termo>)*
    <termo>         ::= IDENTIFICADOR | NÚMERO
    <condicional>   ::= 'se' '(' <expressão> ')' '{' <declaração>+ '}' ('senão' '{' <declaração>+ '}')?
    <repetição>     ::= 'enquanto' '(' <expressão> ')' '{' <declaração>+ '}'
    <saída>         ::= 'exibir' '(' <expressão> ')' ';'

### 2. Análise Léxica/Sintática

| Token         | Classificação     | Regra        |
|---------------|-------------------|--------------|
| `x`           | IDENTIFICADOR     | `[a-z]+`     |
| `=`           | OPERADOR          | `=`          |
| `10`          | NÚMERO            | `[0-9]+`     |
| `;`           | DELIMITADOR       | `;`          |

### 3. Exemplos

#### SimpleCode:

    x = 10;
    y = x + 5;

    se (x > y) {
     exibir(x);
    } senão {
    exibir(y);
    } 

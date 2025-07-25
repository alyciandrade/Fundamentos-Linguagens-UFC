# Programação Lógica

## Problema Lógico:
Neste exemplo, usamos a linguagem lógica **Prolog** para modelar uma árvore genealógica simples, com regras que permitem consultas como: filhos, irmãos e avós.

---

### Fatos
```prolog
% Definindo pessoas
homem(joao).
homem(carlos).
homem(pedro).
homem(antonio).

mulher(maria).
mulher(ana).
mulher(joana).

% Definindo relações de pai/mãe
pai(joao, carlos).
pai(joao, maria).
pai(carlos, pedro).
pai(carlos, joana).

mae(ana, carlos).
mae(ana, maria).
mae(maria, pedro).
mae(maria, joana).
```
---

### Regras
```prolog
% Regra: X é filho de Y se Y for pai ou mãe de X
filho(X, Y) :- pai(Y, X).
filho(X, Y) :- mae(Y, X).

% Regra: X é irmão de Y se compartilham o mesmo pai e não são a mesma pessoa
irmao(X, Y) :- pai(P, X), pai(P, Y), X \= Y.

% Regra: X é avô de Y se ele for pai do pai ou da mãe de Y
avô(X, Y) :- pai(X, Z), pai(Z, Y).
avô(X, Y) :- pai(X, Z), mae(Z, Y).

% Regra: X é avó de Y se ela for mãe do pai ou da mãe de Y
avó(X, Y) :- mae(X, Z), pai(Z, Y).
avó(X, Y) :- mae(X, Z), mae(Z, Y).
```
---

### Exemplos de Consultas
```prolog
% Quem são os filhos de joao?
?- filho(X, joao).

% Quem são os irmãos de maria?
?- irmao(X, maria).

% Quem é o avô de joana?
?- avo(X, joana).

% Quem são os filhos de maria?
?- filho(X, maria).
```
---

### Saída Esperada
```prolog
?- filho(X, joao).
X = carlos ;
X = maria.

?- irmao(X, maria).
X = carlos.

?- avo(X, joana).
X = joao.

?- filho(X, maria).
X = pedro ;
X = joana.

```

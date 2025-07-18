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


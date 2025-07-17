# Programação Orientada a Objetos
Para este desafio, foi implementado, na linguagem Java, uma classe abstrata "ContaBancaria" e duas subclasses "ContaPoupanca" e "ContaEspecial". Na classe "TestaContas" (main), foram criadas instâncias dessas subclasses e chamados métodos comuns, que se comportam de maneira especializada em cada tipo de conta.

### Objetivo
- O principal objetivo deste código é simular e demonstrar operações bancárias básicas para diferentes tipos de contas, aplicando os princípios fundamentais da Programação Orientada a Objetos (POO). Ele permite gerenciar contas de clientes, possibilitando depósitos, saques e a visualização de dados específicos para cada tipo de conta. A finalidade é ilustrar como a herança e o polimorfismo podem ser usados para criar um sistema flexível e extensível, onde comportamentos variam de acordo com o tipo de conta (poupança com rendimento ou especial com limite de saque).

### Funcionalidades

#### Cada tipo de conta possui:

Atributos comuns (definidos em ContaBancaria):
- cliente (String)
- numConta (int)
- saldo (double)

Métodos comuns (definidos em ContaBancaria):
- sacar(): Permite retirar um valor, verificando se há saldo suficiente.
- depositar(): Permite adicionar um valor ao saldo.
- mostrarDados(): Método abstrato que serve como uma interface genérica para exibir informações específicas de cada tipo de conta.

#### Características adicionais das subclasses:

Classe ContaPoupanca:
- Atributo: **diaDeRendimento** (int)
- Método: **calcularNovoSaldo()**: Recebe uma taxa de rendimento e atualiza o saldo da poupança.
- Sobrescreve **mostrarDados()** para exibir detalhes específicos da conta poupança.

Classe ContaEspecial:
- Atributo: **limite** (double)
- Sobrescreve **sacar()**: Permite sacar um valor, utilizando o limite caso o saldo seja insuficiente, permitindo saldo negativo até o valor do limite.
- Sobrescreve **mostrarDados()** para exibir detalhes específicos da conta especial, incluindo o limite.




# Trabalho Prático 01: Restaurante

*Valor: 15 pontos*

*Trabalho individual*

## Descrição

O dono de um restaurante entrou em contato com sua equipe no intuito de informatizar a gestão de suas comandas. Para isto, ele entrou em contato com o gerente de produto de sua equipe, que levantou as seguintes histórias de usuário:

**Garçon**

* Como garçon, desejo poder abrir uma nova mesa
* Como garçon, desejo poder fechar uma determinada mesa
* Como garçon, desejo poder fazer novos pedidos para uma mesa

**Gerente**
* Como gerente, desejo poder abrir uma nova mesa
* Como gerente, desejo poder fechar uma determinada mesa
* Como gerente, desejo poder visualizar pedidos de uma mesa

Ao mostrar essas histórias para o arquiteto de software da sua equipe, ele determinou que deveriam ser criadas as seguintes classes:

* `Mesa`: representa uma mesa do restaurante
* `Funcionario`: representa um funcionário qualquer do restaurante
* `Garcon`: representa um garçon
* `Gerente`: representa um gerente
* `Pedido`: representa um pedido realizado
* `Restaurante`: Classe principal do programa.

## Detalhes

Para cada classe, o arquiteto ainda determinou que os seguintes atributos e métodos estejam presentes e implementados:

### Classe `Pedido.java`

**Atributos**
* Descrição do pedido
* Valor do pedido
* TOTAL DE PEDIDOS: Número total de pedidos realizados no geral

### Classe `Mesa.java`

**Atributos**
* Número da mesa
* Número de clientes
* Histórico de pedidos (no máximo 100)
* Funcionário responsável pela mesa
* TOTAL DE MESAS: Número total de mesas abertas no geral

### Classe `Funcionario.java`

* Um funcionário *nunca* deverá ser inicializado diretamente.

**Atributos**
* Nome do funcionário
* Código do funcionário

**Métodos**
* `Mesa abrirMesa(int numClientes)`: método responsável por abrir uma nova mesa. A mesa a ser aberta torna o funcionário responsável por ela.
* `void fecharMesa(Mesa mesa)`: método responsável por fechar uma determinada mesa (apaga-se seu histórico e número de clientes)

### Classe `Garcon.java`

* Essa classe deve herdar as características de Funcionário.

**Métodos**
* `void fazerPedido(Mesa mesa, Pedido pedido)`: realize um determinado pedido para uma determinada mesa.

### Classe `Gerente.java`

* Essa classe deve herdar as características de Funcionário.

**Métodos**

* `void visualizarPedidos(Mesa mesa)`: lista os pedidos realizados em uma determinada mesa, junto do total da conta da mesa até o momento.

## Observações

Você deverá seguir as seguintes observações para todas as classes que serão implementadas no programa:

* Todos os atributos deverão ser privados. Crie getters e setters para acessá-los.
* Você deverá implementar testes para todos os métodos implementados. Utilize a classe `Restaurante` para isso.

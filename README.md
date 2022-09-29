# Trabalho Prático 01

*Valor: 15 pontos*

*Trabalho em dupla*

## Sistema de Reservas

A diretoria do Colégio Técnico deseja informatizar o processo de reserva de salas de aula disponíveis no colégio. 
Esse sistema deverá exibir a lista de salas de aula disponíveis para reserva, além de permitir que professores e responsáveis possam requerer a reserva da sala para um determinado dia/horário. 
Para que isso seja possível, é necessário que cada sala seja representada pelos seguintes dados: número da sala, capacidade, e a lista de reservas realizadas.
Ainda, existem dois tipos de sala de aula: convencional, e laboratório. 
Em relação a reserva, cada uma deverá informar o nome do professor responsável, o setor ao qual esse professor pertence, e a data/hora da reserva realizada.


## Prova de Conceito

Nesta primeira etapa do trabalho, foi requerido a sua equipe a implementação de uma prova de conceito do sistema.
Nesta prova de conceito não será necessário, por enquanto, o uso de mecanismos de armazenamento externo (arquivos e/ou banco de dados).
Isso significa que os dados do sistema (salas, reservas, etc) deverão ser fornecidos toda vez que o sistema for executado.
Ainda neste primeiro momento, cada sala está restrita a receber até 20 reservas.

Em relação as funcionalidades, a sua equipe conversou com a direção do colégio, e chegou às seguintes histórias de usuário:

- Como usuário, gostaria de visualizar as salas disponíveis para reserva
- Como usuário, gostaria de visualizar as reservas realizadas em uma sala
- Como professor, gostaria de reservar uma sala

Por fim, a interface dessa prova de conceito deverá ser implementada por meio diálogos (`JOptionPane`).

### Avaliação

Para a primeira etapa, o trabalho deverá ser apresentado para o professor no dia 20/10/2022 (duração de 10 minutos).
A avaliação levará em consideração os seguintes critérios:

- Modelagem das classes, métodos e atributos para representar os dados do sistema
- Implementação e uso adequado dos recursos de encapsulamento oferecidos pela linguagem Java
- Uso adequado dos recursos de herança e polimorfismo
- Implementação das funcionalidades requeridas no trabalho
- Utilização dos recursos de interface gráfica (`JOptionPane`)
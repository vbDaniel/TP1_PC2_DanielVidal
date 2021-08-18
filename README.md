## Relatório Prático 1 PC2-2021-1

**Nome:** xxxxx

## Questionário

1. **Você fez uso do conceito de sobrecarga de funções? Onde?**

Sim, porem apenas para construtores, para que eu possa escolhe o melhor construtor para cada situação;

2. Você fez uso do conceito de Herança de funções? Onde? Você vê que houve benefícios?

Sim a utilização da função getX e getY nas classes que herdão point.  Facilitar a obter um valor especifico.

3. Você fez uso da função super() em construtores mesmo que indiretamente? Onde?

Não diretamente, pórem o uso de super() indiretamente ocorre de maneira natural sem necessidade de explicitar.

4. Você fez uso da função this() em construtores mesmo que indiretamente? Onde?

Sim diretamente em todos os construtores, para armazenar os valores na variavel da classe que o this() está. 

5. Você fez uso de sobreescrita de funções? onde? só de Object ou de alguma função sua mesmo?

Sim uso na sobrescrita de objects como o toString, e em funções proprias como abstract getHight.

6. Qual o benefício do uso de classes ENUM?

A classe ENUM, deixa o programa mais flexivel e preparado para qualquer mudança facilitando o trabalho, além de aumentar a organização do projeto.

7. Cole a imagem do diagrama de classe do seu sistema e faça um paragrafo se você entende este diagrama e ele representa realmente objetos do mundo real, com nomes de Metodos coerentes.


9. Você fez uso da palavra Protected? Ela foi relevante onde?

A declaração como Protected foi muito util ao usar uma variavel que iria receber a mesmas var de uma outra classe ou pack, mas que não devem ter acesso por outras externas. Como nos construtores e funções que devem protegidos.


## Questionário FASE 2 E 3:

1 - Você acredita que o correto uso da Orientação à objetos traz mais benefícios ao seu código fonte?

  Acredito que visando o programador trás altos benefícios como a facil compreensão por conta da alta organização de de uma correta POO, oque possibilita o trabalho em um grupo de programadores. Além de existir uma reutilização de codigos no futuro. 

2 - O que é o tratamento de exceções e porque ele é necessário para a organização da transmissão de mensagens entre classes?

  O tratamento possibilita impedir que o fluxo do programa seja interrompido de forma que se retorne um erro que possa ocorrer sem que finalize o programa.  Pois usando o catch ou o throws posse se definir em qual classe o tratamento será realizado ou não.

3 - Porque o uso de interfaces é útil no lugar do uso de Herança Multipla?

   A ideia de inicial de OO seria aplicar a responsabilidade individual, e em herança multipla com uma classe que pode extender uma grande quantidade de classe pode acabar perdendo o foco inicial do OO. (Obs: visão de quem nunca usou Multiplas Heranças) .

4 - Você tem alguma classe que usa extends e implements simultaneamente? se sim qual a justificativa para isso no modelo do seu trabalho?

  Há diversas classes de view que usam ambas palavras, e a utilização é para que extendem uma classe mãe ( classe essa que tbm implementa uma outra que tbm é mãe ),  e ao implementar uma classe filha possibilita que ocorra uma troca de metodos entre todas as outras classes que podem ser implementadas.

5 - O que é UML e dentre os possíveis diagramas existentes, cite 3 que poderiam ser úteis para descrever o seu projeto prático desta disciplina.

  UML é uma linguagem de modelagem de softwares. O Diagrama comportamental de caso de uso para mostrar o casos gui e cli do programa, tambem o Diagrama de atividade pode mostrar o comportamento de uma atividade pra outra de meu programa, Diagramas estruturais principalmente o de objetos para mostrar parte do polimórfismo

6 - Do seu protótipo até esta etapa você acabou fazendo uso de comportamentos Polimórficos no seu trabalho prático. Qual foi o benefício sobre a visão de "Legibilidade" do código fonte? E sobre "organização" das classes?

  O grande volume de codigos, classes, interfaces e enuns mostra o quão necessário é a utilização de bons padrões de organização em OO. O uso de pacotes é extremamente importante para separa. Além da legibilidade no padrão do nome de tudo de metodos a pacotes facilita exponencialmente encontrar possiveis erros e criar o proprio comportamente polimórfico em si. 

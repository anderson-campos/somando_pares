<h1>Programa de Soma dos Números Pares até 20</h1>
<h3>Descrição</h3>
<p>Este programa em Java calcula e exibe a soma dos números pares entre 1 e 20. Ele utiliza um laço for para iterar de 1 a 20 e, em cada iteração, verifica se o número atual é par. Se for, o número é somado a uma variável acumuladora chamada soma. No final da execução, o programa exibe o valor final da soma.</p>

<p>O programa serve para exemplificar operações básicas de controle de fluxo e operações matemáticas simples, como a verificação de paridade (i % 2 == 0). Além disso, imprime todos os números pares encontrados e o valor acumulado final, que corresponde à soma de todos os números pares dentro do intervalo especificado.</p>

<h3>Estrutura do Código</h3>
<p>O código é estruturado da seguinte forma:</p>
<ul>
  <li>Variáveis: São declaradas duas variáveis principais: soma, que armazena a soma dos números pares encontrados, e i, usada como o contador do laço for.</li>
  <li>Laço for: Itera de 1 a 20, usando a variável i como contador.</li>
  <li>Estrutura Condicional: Verifica se i é par usando o operador de módulo (%). Se i for par, ele é adicionado à variável soma.</li>
  <li>Saída de Dados: Para cada número par, o programa imprime o valor na saída padrão. Após o término do laço, exibe o valor total acumulado e uma mensagem de encerramento da execução.</li>
</ul>

<h3>Funcionamento Interno</h3>
<ul>
  <li><strong>Declaração e Inicialização de Variáveis</strong>strong>: A variável soma é inicializada com zero para acumular a soma dos números pares, e i é usada para iterar de 1 a 20.</li>
  <li><strong>Laço de Iteração (for)</strong>strong>: O laço percorre cada número inteiro de 1 a 20. Em cada iteração:
    <ul>
      <li><strong>Verificação de Paridade</strong>strong>: A instrução if (i % 2 == 0) verifica se o número é par. Caso seja, o número é somado à variável soma.</li>
      <li><strong>Impressão do Número Par</strong>strong>: O número par é exibido na saída padrão.</li>
    </ul>
  </li>
  <li><strong>Exibição da Soma Total</strong>strong>: Ao final do laço, o programa imprime a soma acumulada de todos os números pares.</li>
  <li><strong>Mensagem de Finalização</strong>strong>: Exibe uma mensagem informando que a execução foi concluída.</li>
</ul>

# Calculadora Java

Este é um projeto simples de uma calculadora desenvolvida em Java, que permite realizar operações matemáticas básicas, como soma, subtração, multiplicação, divisão e módulo. O projeto inclui uma interface de linha de comando para interagir com o usuário e realizar as operações.

## Descrição

O programa principal (`Main.java`) solicita ao usuário que insira dois números e escolha uma operação matemática entre as seguintes opções:

- Soma (`+`)
- Subtração (`-`)
- Multiplicação (`*`)
- Divisão (`/`)
- Módulo (`%`)

Após o usuário fornecer os dados, a operação é realizada e o resultado é exibido no console.

Além disso, o projeto inclui uma classe de testes (`CalculadoraTest.java`) que utiliza o framework JUnit para validar o comportamento da classe `Calculadora`.

## Estrutura do Projeto

### Classe `Main.java`
A classe `Main` é o ponto de entrada para o programa. Ela executa a interação com o usuário e chama os métodos da classe `Calculadora` para realizar as operações matemáticas.

### Classe `Calculadora.java`
A classe `Calculadora` contém métodos para realizar operações matemáticas:

- `somar(Integer n1, Integer n2)`
- `subtrair(Integer n1, Integer n2)`
- `dividir(Integer n1, Integer n2)`
- `multiplicar(Integer n1, Integer n2)`
- `modulo(Integer n1, Integer n2)`

Cada um desses métodos retorna o resultado da operação correspondente entre os dois números fornecidos.

### Classe `CalculadoraTest.java`
A classe `CalculadoraTest` é uma classe de teste utilizando o framework JUnit 5. Ela contém testes unitários para verificar se os métodos da classe `Calculadora` estão funcionando corretamente:

- `testSomar()`
- `testSubtrair()`
- `testDividir()`
- `testMultiplicar()`
- `testModulo()`

## Como Executar

1. **Compilar o código**:
    - Certifique-se de que você tenha o JDK instalado.
    - Compile o código com o seguinte comando:

      ```bash
      javac -d bin src/br/com/zup/*.java
      ```

2. **Executar o programa**:
    - Para rodar o programa principal (`Main`), use o comando:

      ```bash
      java -cp bin br.com.zup.Main
      ```

3. **Executar os testes**:
    - Para rodar os testes com JUnit, você precisa ter o JUnit 5 configurado no seu projeto. Use o Maven ou Gradle para gerenciar as dependências.
    - Para executar os testes, use o seguinte comando:

      ```bash
      mvn test
      ```

## Dependências

- JUnit 5: Para execução dos testes unitários.

## Exemplo de Saída

```text
Digite o primeiro número: 
5
Digite o segundo número: 
7
Digite qual operação realizar (+, -, /, *, %)
+
5 + 7 = 12
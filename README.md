# Conta Bancária - Versão Maven

Boas-vindas ao repositório do exercício Conta Bancária - Versão Maven

<details>
  <summary><strong> O que deverá ser desenvolvido</strong></summary><br />

Olá! Hoje nosso vamos simular um cenário onde supostamente estaremos dentro de um time de desenvolvimento de uma instituição financeira, e você, enquanto pessoa desenvolvedora, será responsável por implementar um pequeno sistema de apoio à validação de contas bancárias.

Nosso arquiteto de software montou uma especificação técnica que foi designada como uma demanda para você (veja os detalhes abaixo).

</details>

<details>
  <summary><strong> Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

- Solucionar problemas relacionados ao gerenciamento de dependências no Maven;
- Configurar e utilizar o Maven como ferramenta de gerenciamento de dependências em um projeto Java

</details>

## Requisitos

Verificamos que, ao utilizar a função de transferência eletrônica, outras instituições financeiras não estabelecem o mesmo formato no envio dos números das contas. Sendo assim, o desenvolvimento deste sistema tem como objetivo garantir que o formato das contas informadas pela pessoa usuária esteja de acordo com as diretrizes da nossa instituição (contas com 6 dígitos).

Neste projeto utilizaremos o gerenciador de dependências `Maven`.

### 1. Adicionar dependência no projeto

<details>
  <summary>descrição</summary><br />
    Neste projeto utilizaremos a dependência `Apache Commons Lang` versão `3.11`. Você precisará adicionar essa dependência nas configurações do projeto, levando em consideração o que aprendeu sobre o gerenciador de dependência sendo utilizado.
</details>

### 2. Implementar formatação do número da conta

<details>
  <summary>descrição</summary><br />
      No projeto já temos uma classe chamada `AccountNumberFormatter` contendo um método chamado `formatAccountNumber`. Nesse método, você deve receber o número de uma conta e retornar uma String formatada corretamente, conforme as seguintes regras conforme a quantidade de dígitos da conta:

      - `conta < 6 dígitos`: deverá adicionar zeros àa esquerda até atender ao tamanho de 6 números;
      - `conta > 6 dígitos`: deverão ser removidos todos os números antes dos 6 últimos;
      - `conta == 6 dígitos`: já está aderente, o valor deve permanecer inalterado.

      Exemplos:
      - Conta `448` deverá ser formatada como `"000448"`
      - Conta `877665544` deverá ser formatada como `"665544"`
      - Conta `334455` deverá ser formatada como `"334455"`

      Para nossa sorte, não precisamos implementar isso manualmente, uma vez que a biblioteca que adicionamos anteriormente já possui métodos para nos ajudar nesse trabalho. Dê uma olhada na documentação dos métodos `leftPad` e `right` da classe [StringUtils](https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html).
</details>

### 3. Ler conta no terminal

<details>
  <summary>descrição</summary><br />
    O projeto já possui uma classe principal chamada `Application`. Neste requisito você deve:

    - Receber o número da conta bancária (apenas números) no console (terminal) do sistema.
    - Rejeitar valores não numéricos com a mensagem: `Número da conta inválido!`
    - Caso a conta seja válida, mostrar como resultado a conta com a formatação padrão, utilizando a implementação feita no requisito anterior. A conta deve ser mostrada seguindo o padrão de mensagem `Número da conta: XXXXXX` , onde `XXXXXX`  é o número da conta já formatado.

    **Dica**: há várias formas de se fazer a validação, mas a classe da biblioteca mencionada anteriormente pode ter métodos úteis para isso 😉

    Por exemplo, 👓

    Se a pessoa usuária informar a conta `448` no input do console, deverá obter como resultado um feedback ok:

        Informe o número da conta:
        448
        Número da conta: 000448

    No entanto, se a pessoa usuária informar a conta `1234567890` no input do console, deverá obter como resultado a mensagem de aviso:

        Informe o número da conta:
        1234567890
        Número da conta: 567890

    Caso seja informado um valor não numérico (por exemplo `12345-X`), uma mensagem validando deverá aparecer:

        Informe o número da conta: 
        12345-X
        Número da conta inválido!
</details>
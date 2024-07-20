# Consulta CEP

**Consulta CEP** é uma aplicação Java que consulta e salva informações de endereço a partir de um CEP usando a API do ViaCEP. O projeto demonstra o uso de APIs RESTful, manipulação de JSON e escrita de arquivos.

## Funcionalidades

- Consulta de endereço através da API do ViaCEP.
- Exibição dos dados no console.
- Salvamento dos dados em um arquivo JSON.
- Tratamento básico de erros.

## Estrutura do Projeto

- **`Main`**: Gerencia a execução e interação com o usuário.
- **`GeradorArquivo`**: Salva os dados do endereço em um arquivo JSON.
- **`Endereco`**: Define a estrutura dos dados do endereço.
- **`ConsultaCep`**: Realiza a consulta à API e converte a resposta em um objeto `Endereco`.

## Como Funciona

1. **Entrada do CEP**: O usuário insere um CEP ou digita `sair` para encerrar.
2. **Consulta à API**: O programa faz uma solicitação à API do ViaCEP.
3. **Processamento**: Os dados recebidos são convertidos em um objeto `Endereco`.
4. **Exibição e Salvamento**: Os dados são exibidos no console e salvos em um arquivo JSON.

## Requisitos

- **Java 17 ou superior**.
- **Biblioteca Gson**. [Download do Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)

# Lexer Web Interface

## Descrição
Este é um projeto de interface web para um analisador léxico (lexer). Em compiladores, as linguagens livres de contexto (GLC) são frequentemente usadas para descrever a sintaxe das linguagens de programação. Este projeto utiliza um lexer para analisar uma string de entrada, identificar tokens e exibir os resultados em uma interface web amigável.

## Funcionalidades
- **Análise Léxica:** Identifica e classifica tokens na string de entrada.
- **Interface Web Responsiva:** Interface de usuário amigável e responsiva construída com HTML, CSS e JavaScript.
- **Feedback Imediato:** Exibe tokens analisados diretamente na interface após a entrada do usuário.

![GLC](https://github.com/MatheuseduPinheiro/Lexer-Web-Interface/assets/100390250/7e6c726a-b2a4-4a5e-9cb8-f7442388cbc2)

## Tecnologias Utilizadas
- **Frontend:** HTML, CSS, JavaScript
- **Backend:** Java com Spring Boot
- **Template Engine:** Thymeleaf

## Como Utilizar
1. Clone o repositório:
    ```bash
    git clone https://github.com/MatheuseduPinheiro/Lexer-Web-Interface.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd Lexer-Web-Interface
    ```
3. Compile e execute o projeto Spring Boot:
    ```bash
    ./mvnw spring-boot:run
    ```
4. Abra o navegador e acesse `http://localhost:8081`.
   
5. Digite a string que deseja analisar no campo de entrada e pressione "Parse".

## Estrutura do Projeto
```plaintext
C:.
├───.mvn
│   └───wrapper
├───.vscode
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───br
│   │   │           └───glcweb
│   │   │               └───lexer
│   │   │                   ├───controller
│   │   │                   └───service
│   │   └───resources
│   │       ├───static
│   │       │   ├───css
│   │       │   ├───img
│   │       │   └───js
│   │       └───templates
│   └───test
│       └───java
│           └───com
│               └───glcweb
│                   └───glcweb
└───target
    ├───classes
    │   ├───com
    │   │   └───br
    │   │       └───glcweb
    │   │           └───lexer
    │   │               ├───controller
    │   │               └───service
    │   ├───static
    │   │   ├───css
    │   │   └───js
    │   └───templates
    └───test-classes
        └───com
            └───glcweb
                └───glcweb
```

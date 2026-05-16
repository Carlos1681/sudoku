# Projeto Jogo de Sudoku 🧠

O Projeto Jogo de Sudoku é uma aplicação baseada em Java projetada para fornecer uma experiência de quebra-cabeça divertida e desafiadora para os usuários. O projeto consiste em múltiplos componentes, incluindo a lógica do jogo, interface do usuário e mecanismos de manipulação de eventos. O jogo é construído usando uma abordagem modular, com classes separadas para o tabuleiro do jogo, interface do usuário e manipulação de eventos.

## 🚀 Funcionalidades

* **Tabuleiro do Jogo**: Uma grade 9x9 que representa o tabuleiro de Sudoku, com métodos para gerar tabuleiros aleatórios, definir níveis de dificuldade e fornecer um modelo para o jogo.
* **Interface do Usuário**: Uma interface gráfica do usuário (GUI) construída usando a biblioteca Swing do Java, proporcionando uma maneira amigável de interagir com o jogo.
* **Manipulação de Eventos**: Um mecanismo para escutar e responder aos eventos que ocorrem dentro do jogo, como a entrada do usuário, mudanças no estado do jogo e notificações.
* **Lógica do Jogo**: Um conjunto de regras e algoritmos que governam o comportamento do jogo, incluindo a geração de tabuleiros aleatórios, verificação de validade e determinação do resultado da partida.
* **Sistema de Notificação**: Um sistema para enviar notificações aos usuários ou a outros componentes do jogo, como mudanças no estado do jogo, novas mensagens ou atualizações no tabuleiro.

## 🛠️ Tecnologias Utilizadas

* **Java**: A linguagem de programação principal utilizada no projeto.
* **Java Swing**: Uma biblioteca usada para construir a interface gráfica do usuário (GUI).
* **Java Enum**: Recursos usados para definir enumerações de eventos e status do jogo.
* **Java Event Listener**: Interfaces utilizadas para escutar e responder aos eventos que ocorrem dentro do jogo.

## 📦 Instalação

Para instalar o projeto, siga estes passos:

1. Clone o repositório usando o Git.
2. Importe o projeto para a sua IDE Java de preferência (ex: Eclipse, IntelliJ).
3. Certifique-se de que o Java Development Kit (JDK) está instalado e configurado corretamente.
4. Compile (build) o projeto usando a ferramenta de build da sua IDE (ex: Maven, Gradle).

## 💻 Como Usar

Para executar o projeto, siga estes passos:

1. Inicie a aplicação usando a configuração de execução (*run configuration*) da sua IDE.
2. Interaja com o jogo usando a interface gráfica do usuário (GUI).
3. Use o mecanismo de manipulação de eventos para responder aos eventos que ocorrem dentro do jogo.

## 📂 Estrutura do Projeto

```markdown
Projeto Jogo de Sudoku
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Board.java
│   │   │   ├── BoardService.java
│   │   │   ├── BoardTemplate.java
│   │   │   ├── EventEnum.java
│   │   │   ├── EventListener.java
│   │   │   ├── GameStatusEnum.java
│   │   │   ├── MainFrame.java
│   │   │   ├── MainScreen.java
│   │   │   ├── NotifierService.java
│   │   │   ├── UIMain.java
│   │   │   └── Main.java
│   │   └── resources
│   └── test
│       ├── java
│       └── resources
├── README.md
└── LICENSE

```

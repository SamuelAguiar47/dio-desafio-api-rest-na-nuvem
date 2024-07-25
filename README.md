# DIO - Desafio API REST na Nuvem
Repositório para armazenar os arquivos do desafio do bootcamp de desenvolvimento Java com IA da plataforma DIO. O desafio consiste em desenvolver uma aplicação de um banco digital em Java (versão 17) utilizando o Spring Boot 3 e realizar o seu deploy através do Railway e PostgreeSQL.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```

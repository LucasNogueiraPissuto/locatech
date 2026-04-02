# Locatech

Um sistema de gerenciamento de locação de veículos desenvolvido como projeto acadêmico para a disciplina de **Arquitetura e Desenvolvimento Java** da FIAP.

## ⚠️ Status do Projeto

Este projeto está **em desenvolvimento** e pode conter funcionalidades incompletas ou bugs. As implementações estão sendo realizadas gradualmente conforme o progresso do curso.

## 📋 Descrição

Locatech é uma aplicação backend desenvolvida em Spring Boot que fornece uma API para gerenciar:
- **Veículos**: Cadastro, atualização, listagem e exclusão de veículos disponíveis para locação
- **Pessoas**: Gerenciamento de clientes que alugam os veículos
- **Aluguéis**: Controle de locações, datas e valores

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 4.0.4**
  - Spring MVC
  - Spring JDBC
- **Maven** (Build tool)
- **H2 Database** (Banco de dados em memória para testes/desenvolvimento)
- **Lombok** (Redução de boilerplate)

## 📁 Estrutura do Projeto

```
src/main/java/br/com/lucasP/locatech/locatech/
├── controllers/
│   └── VeiculoController.java      # Endpoints para gerenciar veículos
├── entities/
│   ├── Veiculo.java                 # Entidade que representa um veículo
│   ├── Pessoa.java                  # Entidade que representa uma pessoa/cliente
│   └── Aluguel.java                 # Entidade que representa um aluguel
├── repositories/
│   ├── VeiculoRepository.java        # Interface do repositório de veículos
│   └── VeiculoRepositoryImp.java     # Implementação do repositório
└── LocatechApplication.java          # Classe principal da aplicação

src/main/resources/
└── application.properties            # Configurações da aplicação
```

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

- **Controllers**: Responsáveis por receber requisições HTTP e retornar respostas
- **Entities**: Objetos de domínio que representam os dados da aplicação
- **Repositories**: Camada de acesso a dados que abstrai a comunicação com o banco de dados

## 📝 Entidades Principais

### Veiculo
- `id`: Identificador único
- `marca`: Marca do veículo
- `modelo`: Modelo do veículo
- `placa`: Placa do veículo
- `anoFabricacao`: Ano de fabricação
- `cor`: Cor do veículo
- `valorDiaria`: Valor da diária em BigDecimal

### Pessoa
- `id`: Identificador único
- `nome`: Nome completo
- `cpf`: CPF da pessoa
- `telefone`: Número de telefone
- `email`: Endereço de email

### Aluguel
- `id`: Identificador único do aluguel
- `idPessoa`: Referência à pessoa que aluga
- `idVeiculo`: Referência ao veículo alugado
- `dataInicio`: Data de início do aluguel
- `dataFim`: Data de término do aluguel
- `valorTotal`: Valor total do aluguel

## 🚀 Como Executar

### Pré-requisitos
- Java 21 ou superior
- Maven 3.6+

### Passos

1. Clone ou baixe o projeto
2. Navegue até o diretório do projeto
3. Execute o comando:
   ```bash
   mvnw spring-boot:run
   ```
   Ou no Linux/Mac:
   ```bash
   ./mvnw spring-boot:run
   ```

A aplicação será iniciada na porta padrão do Spring Boot (8080).

## 🔌 Endpoints Atuais

- `GET /veiculos`: Retorna informações sobre veículos (em desenvolvimento)

## 📚 Funcionalidades em Desenvolvimento

- [ ] CRUD completo de Veículos
- [ ] CRUD de Pessoas
- [ ] CRUD de Aluguéis
- [ ] Validações de dados
- [ ] Integração com banco de dados persistente
- [ ] Testes unitários e de integração
- [ ] Documentação da API (Swagger/OpenAPI)
- [ ] Tratamento de exceções

## 👨‍💻 Autor

Lucas P. - Projeto acadêmico FIAP

## 📄 Licença

Este projeto é acadêmico e está disponível para fins educacionais.

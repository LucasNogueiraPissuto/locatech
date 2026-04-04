# 🚗 Locatech - Sistema de Aluguel de Veículos

## 📋 Descrição do Projeto

**Locatech** é um projeto acadêmico desenvolvido durante o curso de **Arquitetura e Desenvolvimento Java** na **FIAP**. Trata-se de uma API REST construída com **Spring Boot** que gerencia um sistema de aluguel de veículos.

> ⚠️ **NOTA IMPORTANTE**: Este é um projeto em desenvolvimento e ainda não possui todas as funcionalidades finalizadas.

## 🎯 Objetivo

O projeto tem como objetivo aplicar conceitos de arquitetura em camadas, padrões de design e boas práticas de desenvolvimento Java em uma aplicação RESTful.

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot** - Framework principal
- **Spring Data JDBC** - Acesso a dados
- **Maven** - Gerenciador de dependências
- **Lombok** - Redução de boilerplate
- **SLF4J** - Logging

## 🏗️ Arquitetura

O projeto segue o padrão de arquitetura em camadas:

```
📦 locatech
 ├── 🎮 controllers/    - Controladores REST
 ├── 🔧 services/       - Lógica de negócio
 ├── 💾 repositories/    - Acesso a dados
 └── 📊 entities/        - Modelos de dados
```

## 📦 Entidades Principais

### Pessoa
Representa um cliente ou pessoa que pode alugar um veículo.

**Atributos:**
- `id` - Identificador único
- `nome` - Nome da pessoa
- `cpf` - CPF da pessoa
- `email` - Email da pessoa
- `telefone` - Telefone da pessoa

### Veiculo
Representa um veículo disponível para aluguel.

**Atributos:**
- `id` - Identificador único
- `modelo` - Modelo do veículo
- `placa` - Placa do veículo
- (Mais atributos a serem adicionados)

### Aluguel
Representa um contrato de aluguel entre uma Pessoa e um Veículo.

**Atributos:**
- `id` - Identificador único
- `idPessoa` - ID da pessoa que aluga
- `idVeiculo` - ID do veículo alugado
- `dataIncio` - Data de início do aluguel
- `dataFim` - Data de término do aluguel
- `valorTotal` - Valor total do aluguel

## 🔌 Endpoints da API

### Pessoas
- `GET /pessoas` - Lista todas as pessoas (com paginação)
- `GET /pessoas/{id}` - Obtém uma pessoa específica
- `POST /pessoas` - Cria uma nova pessoa
- `PUT /pessoas/{id}` - Atualiza uma pessoa existente
- `DELETE /pessoas/{id}` - Deleta uma pessoa

### Veículos
- `GET /veiculos` - Lista todos os veículos (com paginação)
- `GET /veiculos/{id}` - Obtém um veículo específico
- `POST /veiculos` - Cria um novo veículo
- `PUT /veiculos/{id}` - Atualiza um veículo existente
- `DELETE /veiculos/{id}` - Deleta um veículo

### Alugueis
- `GET /alugueis` - Lista todos os aluguéis (com paginação)
- `GET /alugueis/{id}` - Obtém um aluguel específico
- `POST /alugueis` - Cria um novo aluguel
- `PUT /alugueis/{id}` - Atualiza um aluguel existente
- `DELETE /alugueis/{id}` - Deleta um aluguel

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+
- Banco de dados configurado (verifique `application.properties`)

### Passos

1. **Clonar ou baixar o projeto**
   ```bash
   cd locatech
   ```

2. **Instalar dependências**
   ```bash
   mvn clean install
   ```

3. **Executar a aplicação**
   ```bash
   mvn spring-boot:run
   ```

4. **Acessar a API**
   ```
   http://localhost:8080
   ```

## ⚙️ Configuração

Edite o arquivo `src/main/resources/application.properties` para configurar:
- Conexão com o banco de dados
- Porta da aplicação
- Perfis de execução (dev, prod)

## 📝 Exemplo de Requisição

### Criar uma Pessoa
```bash
curl -X POST http://localhost:8080/pessoas \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "João Silva",
    "cpf": "12345678901",
    "email": "joao@email.com",
    "telefone": "11999999999"
  }'
```

### Listar Pessoas
```bash
curl http://localhost:8080/pessoas?page=1&size=10
```

## 🔄 Funcionalidades em Desenvolvimento

- [ ] Autenticação e autorização
- [ ] Validação de dados
- [ ] Testes unitários
- [ ] Documentação com Swagger
- [ ] Relatórios de aluguéis
- [ ] Integração com gateway de pagamento

## 👤 Autor

Lucas P. - Projeto acadêmico FIAP

## 📄 Licença

Este projeto é um trabalho acadêmico e pode ser usado livremente para fins educacionais.

## 📞 Contato

Para dúvidas ou sugestões sobre o projeto, abra uma issue ou contacte o desenvolvedor.

---

**Status**: 🔄 Em Desenvolvimento
**Última Atualização**: 03 de Abril de 2026


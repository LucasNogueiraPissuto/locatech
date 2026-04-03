CREATE TABLE veiculos(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    placa VARCHAR(255) NOT NULL,
    ano_fabricacao INT NOT NULL,
    cor VARCHAR(255) NOT NULL,
    valor_diaria DECIMAL(10, 2) NOT NULL
);

INSERT INTO veiculos (marca, modelo, placa, ano_fabricacao, cor, valor_diaria) VALUES
('Toyota', 'Corolla', 'ABC-1234', 2020, 'Prata', 150.00),
('Honda', 'Civic', 'DEF-5678', 2019, 'Preto', 140.00);

CREATE TABLE pessoas(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(20) NOT NULL
);

INSERT INTO pessoas (nome, cpf, email, telefone) VALUES
('João Silva', '123.456.789-00', 'JoaoSilva@email.com', '(11) 98765-4321'),
('Maria Oliveira', '987.654.321-00', 'MariaOliveira@email.com', '(21) 91234-5678');
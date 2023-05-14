CREATE TABLE CRIAR_EDITAR_ROTAS (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    LOCAL VARCHAR(255) NOT NULL,
    QTD_PESSOA INT,
    GUIA_RESPONSAVEL VARCHAR(255),
    VALOR_UNITARIO VARCHAR(255),
    DATA_INICIO DATE,
    DATA_FINAL DATE,
    DESCRICAO VARCHAR(255),
    IMAGE VARCHAR(255)
);
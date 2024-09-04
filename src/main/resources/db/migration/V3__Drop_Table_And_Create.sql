-- Deletar tabelas se já existirem
DROP TABLE IF EXISTS Musica;
DROP TABLE IF EXISTS Artista;

-- Criar tabela Artista
CREATE TABLE Artista (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    generoMusica VARCHAR(255),
    nacionalidade VARCHAR(255),
    biografia VARCHAR(1000)
);

-- Criar tabela Musica
CREATE TABLE Musica (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    artistaId BIGINT,
    duracao BIGINT, -- Armazena a duração em segundos
    album VARCHAR(255),
    anoLancamento INT,
    CONSTRAINT fk_artista FOREIGN KEY (artistaId) REFERENCES Artista(id)
);

-- Inserir dados na tabela Artista
INSERT INTO Artista (nome, generoMusica, nacionalidade, biografia) VALUES
('Artista 1', 'Pop', 'Brasileiro', 'Biografia detalhada do Artista 1'),
('Artista 2', 'Rock', 'Americano', 'Biografia detalhada do Artista 2');

-- Inserir dados na tabela Musica
INSERT INTO Musica (titulo, artistaId, duracao, album, anoLancamento) VALUES
('Música 1', 1, 270, 'Álbum 1', 2020),  -- 270 segundos = 4 minutos e 30 segundos
('Música 2', 2, 210, 'Álbum 2', 2018);  -- 210 segundos = 3 minutos e 30 segundos

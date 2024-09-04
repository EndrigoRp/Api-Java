DROP TABLE IF EXISTS Musica;
DROP TABLE IF EXISTS Artista;

CREATE TABLE Artista (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    generoMusica VARCHAR(255),
    nacionalidade VARCHAR(255),
    biografia VARCHAR(1000)
);

CREATE TABLE Musica (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    artistaId BIGINT,
    album VARCHAR(255),
    anoLancamento INT,
    CONSTRAINT fk_artista FOREIGN KEY (artistaId) REFERENCES Artista(id)
);
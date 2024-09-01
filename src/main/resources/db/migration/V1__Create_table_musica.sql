CREATE TABLE musica (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    artista VARCHAR(255) NOT NULL,
    album VARCHAR(255) NOT NULL,
    ano_lancamento INT NOT NULL
);

INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Bohemian Rhapsody', 'Queen', 'A Night at the Opera', 1975);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Stairway to Heaven', 'Led Zeppelin', 'Led Zeppelin IV', 1971);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Hotel California', 'Eagles', 'Hotel California', 1976);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Imagine', 'John Lennon', 'Imagine', 1971);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Smells Like Teen Spirit', 'Nirvana', 'Nevermind', 1991);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Billie Jean', 'Michael Jackson', 'Thriller', 1982);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Like a Rolling Stone', 'Bob Dylan', 'Highway 61 Revisited', 1965);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Hey Jude', 'The Beatles', 'Single', 1968);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Comfortably Numb', 'Pink Floyd', 'The Wall', 1979);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Purple Haze', 'Jimi Hendrix', 'Are You Experienced', 1967);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Born to Run', 'Bruce Springsteen', 'Born to Run', 1975);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Let It Be', 'The Beatles', 'Let It Be', 1970);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Wonderwall', 'Oasis', '(What\'s the Story) Morning Glory?', 1995);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('No Woman, No Cry', 'Bob Marley', 'Live!', 1975);
INSERT INTO musica (titulo, artista, album, ano_lancamento) VALUES ('Sweet Child O\' Mine', 'Guns N\' Roses', 'Appetite for Destruction', 1987);

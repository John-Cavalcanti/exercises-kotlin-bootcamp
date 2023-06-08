CREATE TABLE pessoa (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(20) NOT NULL,
    nascimento DATE
)

INSERT INTO pessoa ( nome, nascimento ) VALUES(
    'Joao','2001-09-03'
);

INSERT INTO pessoa ( nome, nascimento ) VALUES(
    'Pedro','2001-07-17'
);

INSERT INTO pessoa ( nome, nascimento ) VALUES(
    'Marcela','2001-04-05'
);


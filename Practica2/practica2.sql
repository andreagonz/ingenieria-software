CREATE TABLE pais(
       id INTEGER PRIMARY KEY,
       nombre VARCHAR(64) NOT NULL
);

CREATE TABLE usuario(
       id INTEGER PRIMARY KEY,
       nombre VARCHAR(64) NOT NULL,
       correo VARCHAR(128) NOT NULL,
       contrasenia VARCHAR(128) NOT NULL,
       idpais INTEGER REFERENCES pais(id) NOT NULL
 );

INSERT INTO pais VALUES(1,'mexico');
INSERT INTO usuario VALUES(1,'chepe','chepe@gmail.com','chepe123',1);  
INSERT INTO usuario VALUES(2,'pacha','pacha@gmail.com','pacha123',1);

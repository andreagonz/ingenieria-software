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


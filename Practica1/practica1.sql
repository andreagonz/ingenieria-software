CREATE TABLE usuario(
       id INTEGER PRIMARY KEY,
       nombre VARCHAR(64) NOT NULL,
       correo VARCHAR(128) NOT NULL,
       contrasenia VARCHAR(128) NOT NULL,
       idpais INTEGER NOT NULL
 );

CREATE TABLE pais(
       id INTEGER PRIMARY KEY,
       nombre VARCHAR(64) NOT NULL
);

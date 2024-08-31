
--pokemon proyect
CREATE TABLE Pokedex (
  num_pokedex INT PRIMARY KEY,  
  nombre_pokemon VARCHAR(50) NOT NULL,
  tipo1 VARCHAR(50) not null,
  tipo2 VARCHAR(50)
);

  
   
   CREATE TABLE movimientos (
  id_movimiento INT PRIMARY KEY,  
  nombre_movimiento VARCHAR(50) NOT NULL,
  potencia INT,
  tipo VARCHAR(50),
  estado VARCHAR(50),
  ataque INT,
  defensa INT,
  estamina INT,
  ataque_especial INT,
  defensa_especial INT,
  velocidad INT,
  vitalidad INT
);





    CREATE TABLE Entrenador (
  id_entrenador INT PRIMARY KEY,
  nombre_entrenador VARCHAR(50) NOT NULL,
  nivel_entrenador int,
  pokedolars int
);



  
CREATE TABLE Pokemon (
  id_pokemon INT PRIMARY KEY,
  num_pokedex INT,
  id_entrenador INT,
  mote_pokemon VARCHAR(50) NOT NULL,
  atack INT NOT NULL,
  ataque_especial INT,
  defensa INT,
  def_especial INT,
  fertilidad INT,
  vitalidad INT,
  equipo INT CHECK (equipo IN (1, 2)),
  nivel INT,
  movimiento INT REFERENCES movimientos(id_movimiento),
  experiencia INT,
  id_objeto INT);







  CREATE TABLE Objeto (
id_objeto INT PRIMARY KEY,
cantidad INT NOT NULL,
nombre_objeto VARCHAR(50) NOT NULL,
puntosDefensa INT,
DefensaEspecial INT,
Velocidad INT,
estamina INT,
recuperacion_de_estamina INT,
Ataque INT,
ataque_especial INT
);





  
    CREATE TABLE pokemovi    (
  id_pokemon INT PRIMARY KEY,  
 id_movimiento INT);
    





  CREATE TABLE Mochila (
  id_entrenador INT PRIMARY KEY,  
  id_objeto INT NOT NULL,
  cantidad_obgetos int);
  
  
  
  ALTER TABLE Pokemon
ADD CONSTRAINT id_entrenador_poke FOREIGN KEY (id_entrenador) REFERENCES Entrenador(id_entrenador),
ADD CONSTRAINT id_objeto_poke FOREIGN KEY (id_objeto) REFERENCES Objeto(id_objeto),
ADD CONSTRAINT id_nupokdex_poke FOREIGN KEY (num_pokedex) REFERENCES Pokedex(num_pokedex);


ALTER TABLE pokemovi
ADD CONSTRAINT id_pokemondelaunionconmovimiento FOREIGN KEY (id_pokemon) REFERENCES Pokemon(id_pokemon),
ADD CONSTRAINT id_movimientosunion FOREIGN KEY (id_movimiento) REFERENCES movimientos(id_movimiento);

ALTER TABLE Mochila
ADD CONSTRAINT id_entrenadorob FOREIGN KEY (id_entrenador) REFERENCES Entrenador(id_entrenador),
ADD CONSTRAINT id_objeto_mochi FOREIGN KEY (id_objeto) REFERENCES Objeto(id_objeto);


  
INSERT INTO Entrenador VALUES (1, 'pepe', 1, 700), (2, 'juan', 1, 700), (3, 'pablo', 1, 700);



INSERT INTO Pokedex (num_pokedex, nombre_pokemon, tipo1, tipo2)
VALUES (1, 'Bulbasaur', 'PLANTA', 'VENENO');

INSERT INTO Pokedex (num_pokedex, nombre_pokemon, tipo1, tipo2)
VALUES (4, 'Charmander', 'FUEGO', NULL);

INSERT INTO Pokedex (num_pokedex, nombre_pokemon, tipo1, tipo2)
VALUES (7, 'Squirtle', 'AGUA', NULL);

INSERT INTO Pokedex (num_pokedex, nombre_pokemon, tipo1, tipo2)
VALUES (25, 'Pikachu', 'ELECTRICO', NULL);

INSERT INTO Pokedex (num_pokedex, nombre_pokemon, tipo1, tipo2)
VALUES (10, 'Caterpie', 'BICHO', NULL);


INSERT INTO Objeto (id_objeto, cantidad, nombre_objeto, puntosDefensa, DefensaEspecial, Velocidad, estamina, recuperacion_de_estamina, Ataque, ataque_especial)
VALUES (1, 1, 'pesa', 20, 20, -20, 0, 0, 20, 20);

INSERT INTO Objeto (id_objeto, cantidad, nombre_objeto, puntosDefensa, DefensaEspecial, Velocidad, estamina, recuperacion_de_estamina, Ataque, ataque_especial)
VALUES (2, 1, 'pluma', 0, -20, 30, 0, 0, 0, 0);

INSERT INTO Objeto (id_objeto, cantidad, nombre_objeto, puntosDefensa, DefensaEspecial, Velocidad, estamina, recuperacion_de_estamina, Ataque, ataque_especial)
VALUES (3, 1, 'chaleco', 20, 20, -15, 0, 0, -15, 0);

INSERT INTO Objeto (id_objeto, cantidad, nombre_objeto, puntosDefensa, DefensaEspecial, Velocidad, estamina, recuperacion_de_estamina, Ataque, ataque_especial)
VALUES (4, 1, 'bastón', 0, 0, -15, 20, 0, 0, 0);

INSERT INTO Objeto (id_objeto, cantidad, nombre_objeto, puntosDefensa, DefensaEspecial, Velocidad, estamina, recuperacion_de_estamina, Ataque, ataque_especial)
VALUES (5, 1, 'pilas', 0, -30, 0, 0, 50, 0, 0);







INSERT INTO movimientos (id_movimiento, nombre_movimiento, potencia, tipo, estado, ataque, defensa, estamina, ataque_especial, defensa_especial, velocidad, vitalidad) VALUES
(1, 'Ascuas', 40, 'Fuego', 'Ataque', 52, 43, 65, 60, 50, 65, NULL),
(2, 'Arañazo', 40, 'Normal', 'Ataque', 55, 35, 40, NULL, NULL, 90, NULL),
(3, 'Malicioso', NULL, 'Siniestro', 'Estado', NULL, NULL, NULL, NULL, NULL, 100, NULL),
(4, 'Picotazo Venenoso', 60, 'Veneno', 'Ataque', 65, 55, 35, NULL, NULL, 75, NULL),
(5, 'Doblebofetón', 15, 'Normal', 'Ataque', 15, 85, 90, NULL, NULL, 55, NULL),
(6, 'Pistola Agua', 40, 'Agua', 'Ataque', 40, 40, 60, 40, 40, 55, NULL),
(7, 'Placaje', 40, 'Normal', 'Ataque', 40, 40, 35, NULL, NULL, 90, NULL),
(8, 'Doble Filo', 120, 'Normal', 'Ataque', 120, 85, 65, NULL, NULL, 75, NULL),
(9, 'Golpe Cuerpo', 85, 'Lucha', 'Ataque', 80, 50, 35, NULL, NULL, 35, NULL),
(10, 'Derribo', 90, 'Normal', 'Ataque', 120, 85, 65, NULL, NULL, 75, NULL);




INSERT INTO Pokemon (id_pokemon, num_pokedex, id_entrenador, mote_pokemon, atack, ataque_especial, defensa, def_especial, fertilidad, vitalidad, equipo, nivel, movimiento1, movimiento2, movimiento3, movimiento4, experiencia, id_objeto)
VALUES (1, 1, 1, 'Bulbasaur', 50, 65, 49, 65, 70, 70, 1, 5, 1, 4, 3, 2, 0, 1);

INSERT INTO Pokemon (id_pokemon, num_pokedex, id_entrenador, mote_pokemon, atack, ataque_especial, defensa, def_especial, fertilidad, vitalidad, equipo, nivel, movimiento1, movimiento2, movimiento3, movimiento4, experiencia, id_objeto)
VALUES (2, 4, 2, 'Charmander', 52, 60, 43, 50, 70, 70, 1, 5, 7, 1, 4, 2, 0, 2);

INSERT INTO Pokemon (id_pokemon, num_pokedex, id_entrenador, mote_pokemon, atack, ataque_especial, defensa, def_especial, fertilidad, vitalidad, equipo, nivel, movimiento1, movimiento2, movimiento3, movimiento4, experiencia, id_objeto)
VALUES (3, 7, 3, 'Squirtle', 48, 50, 65, 64, 70, 70, 1, 5, 6, 1, 4, 2, 0, 3);

INSERT INTO Pokemon (id_pokemon, num_pokedex, id_entrenador, mote_pokemon, atack, ataque_especial, defensa, def_especial, fertilidad, vitalidad, equipo, nivel, movimiento1, movimiento2, movimiento3, movimiento4, experiencia, id_objeto)
VALUES (4, 25, 1, 'Pikachu', 55, 50, 40, 50, 70, 70, 1, 5, 5, 1, 4, 3, 0, 4);

INSERT INTO Pokemon (id_pokemon, num_pokedex, id_entrenador, mote_pokemon, atack, ataque_especial, defensa, def_especial, fertilidad, vitalidad, equipo, nivel, movimiento1, movimiento2, movimiento3, movimiento4, experiencia, id_objeto)
VALUES (5, 10, 2, 'Caterpie', 30, 20, 35, 20, 70, 70, 1, 5, 2, 1, 4, 3, 0, 5);

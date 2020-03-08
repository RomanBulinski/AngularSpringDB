DROP TABLE IF EXISTS cities;
CREATE TABLE cities(id serial PRIMARY KEY, name VARCHAR(255), population integer);

DROP TABLE IF EXISTS owners;
CREATE TABLE owners(id serial PRIMARY KEY, name VARCHAR(255), surname VARCHAR(255) );

DROP TABLE IF EXISTS apartments;
CREATE TABLE apartments(id serial PRIMARY KEY, apartment_number VARCHAR(255), area numeric, level integer);

DROP TABLE IF EXISTS garages;
CREATE TABLE garages(id serial PRIMARY KEY, garage_number VARCHAR(255), area numeric, level integer);
INSERT INTO garages(garage_number, area, level) VALUES('1G', 12.75, -1);
INSERT INTO garages(garage_number, area, level) VALUES('2G', 12.75, -1);

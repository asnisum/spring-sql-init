DROP TABLE IF EXISTS dish;
DROP TABLE IF EXISTS accounts;
DROP TABLE IF EXISTS members;

CREATE TABLE dish
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    vegetarian BOOLEAN NOT NULL,
    calories INT NOT NULL,
    type ENUM('MEAT', 'FISH', 'OTHER'),
    PRIMARY KEY(id)
);

CREATE TABLE accounts
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE members
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY(id)
);

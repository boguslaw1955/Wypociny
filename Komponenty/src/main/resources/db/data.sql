
CREATE TABLE component
(
    id int PRIMARY KEY NOT NULL ,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(3000) NULL,
    logo VARCHAR(100) NULL,
    active boolean DEFAULT true
);

INSERT INTO component(id, name, logo, description, active)
VALUES(1, 'komponent1', 'resources/images/obrazek1.gif', 'duzy opis komponentu 1', true);

INSERT INTO component(id, name, logo, description, active)
VALUES(2, 'komponent2', 'resources/images/obrazek2.gif', 'duzy opis komponentu 2', true);

INSERT INTO component(id, name, logo, description, active)
VALUES(3, 'komponent3', 'resources/images/obrazekINSET  3.gif', 'duzy opis komponentu 3', true);
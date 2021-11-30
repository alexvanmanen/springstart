CREATE TABLE IF NOT EXISTS `person` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `first_name` varchar(20),
    `last_name` varchar(20)
);

INSERT INTO person (first_name, last_name) VALUES ( 'Stephen', 'Strange' );
INSERT INTO person (first_name, last_name) VALUES ( 'Peter', 'Parker' );
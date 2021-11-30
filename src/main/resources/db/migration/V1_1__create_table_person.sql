CREATE TABLE IF NOT EXISTS `person` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `firstName` varchar(20),
    `lastName` varchar(20)
);
--
-- INSERT INTO person (firstName, lastName) VALUES ( 'Stephen', 'Strange' );
-- INSERT INTO person (firstName, lastName) VALUES ( 'Peter', 'Parker' );
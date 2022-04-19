CREATE DATABASE cities;

USE cities;

CREATE TABLE IF NOT EXISTS cities (
    id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    lattitude DECIMAL(8,6) NOT NULL,
    longtitude DECIMAL(8,6) NOT NULL
    );

CREATE TABLE IF NOT EXISTS distances (
    id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    from_city INT(11) UNSIGNED NOT NULL,
    to_city INT(11) UNSIGNED NOT NULL,
    distance BIGINT(21) NOT NULL,
    INDEX (from_city),
    INDEX (to_city),
    FOREIGN KEY (from_city)
    REFERENCES cities(id)
    ON DELETE CASCADE,
    FOREIGN KEY (to_city)
    REFERENCES cities(id)
    ON DELETE CASCADE
    );
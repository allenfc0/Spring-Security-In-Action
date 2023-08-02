-- `springbootpractice`.`users`
-- `springbootpractice`.`authorities`
-- CREATE TABLE user (
-- 	`id` INT NOT NULL AUTO_INCREMENT,
-- 	`username` VARCHAR(45) NOT NULL,
-- 	`password` VARCHAR(255) NOT NULL,
-- 	`authority` INT NOT NULL,
-- 	PRIMARY KEY (`id`)
-- );

CREATE TABLE authorities (
	`id` INT NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(45) NOT NULL,
	`authority` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`id`)
);
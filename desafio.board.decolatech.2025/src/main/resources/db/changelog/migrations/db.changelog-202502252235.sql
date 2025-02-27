--liquibase formatted sql
--changeset myrella:202502252235
--comment: board table create

CREATE TABLE IF NOT EXISTS board(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE=InnoDB;



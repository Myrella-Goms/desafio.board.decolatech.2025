--liquibase formatted sql
--changeset myrella:202502261619
--comment: cards table create

CREATE TABLE IF NOT EXISTS cards(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    board_columns_id BIGINT NOT NULL,
    CONSTRAINT boards__columns_cards_fk FOREIGN KEY (board_columns_id) REFERENCES board_columns(id) ON DELETE CASCADE

) ENGINE=InnoDB;
CREATE TABLE if NOT EXISTS `user`(
    email VARCHAR(255),
    id VARCHAR(255) NOT NULL,
    NAME VARCHAR(255),
    patronymic VARCHAR(255),
    role VARCHAR(255),
    surname VARCHAR(255),
    PRIMARY KEY(id)
) ENGINE = InnoDB
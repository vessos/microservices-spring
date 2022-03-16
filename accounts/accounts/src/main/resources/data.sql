DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;

CREATE TABLE `customer` (
    `customer_id` int AUTO_INCREMENT NOT NULL ,
    `name` varchar(100) NOT NULL,
    `email` varchar(100) NOT NULL,
    `mobile_number` varchar(20) NOT NULL,
    `create_dt` date DEFAULT NULL,
    PRIMARY KEY (`customer_id`)
);

CREATE TABLE `accounts` (
    `customer_id` int NOT NULL,
    `account_number` int AUTO_INCREMENT NOT NULL ,
    `account_type` varchar(100) NOT NULL,
    `branch_address` varchar(200) NOT NULL,
    `create_dt` date DEFAULT NULL,
    PRIMARY KEY (`account_number`)
);

INSERT INTO `customer` (`customer_id`,`name`,`email`,`mobile_number`,`create_dt`)
    VALUES (1,'Eazy Bytes','tutor@eazybytes.com','9876548337',CURRENT_DATE());

INSERT INTO `accounts` (`customer_id`, `account_number`, `account_type`, `branch_address`,`create_dt`)
    VALUES (1,185,'Savings','123 Main Street,New york',CURDATE());

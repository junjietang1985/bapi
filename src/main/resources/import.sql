CREATE DATABASE IF NOT EXISTS `bapi`;
USE `bapi`;

CREATE TABLE IF NOT EXISTS `User` ( `id` bigint(20) NOT NULL AUTO_INCREMENT, `name` varchar(12) NOT NULL DEFAULT '', `created` datetime NOT NULL, `last_modified` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP, `deleted` tinyint(1) NOT NULL, PRIMARY KEY (`id`), UNIQUE KEY `unique_name` (`name`) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--INSERT INTO `User` (`name`, `created`, `last_modified`, `deleted`) VALUES ('aaa', '2000-01-11 00:00:00', '2000-11-11 00:00:00', 0);
--INSERT INTO `User` (`name`, `created`, `last_modified`, `deleted`) VALUES ('bbb', '2000-01-11 00:00:00', '2000-11-11 00:00:00', 0);

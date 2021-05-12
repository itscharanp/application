CREATE DATABASE  IF NOT EXISTS `log_directory`;
USE `log_directory`;

CREATE TABLE `logmodel` (
  `id` varchar(45) unique,
  `name` varchar(45) DEFAULT NULL,
  `logtype` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




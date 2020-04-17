/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 10.1.36-MariaDB : Database - banksdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`banksdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `banksdb`;

/*Table structure for table `accounts` */

DROP TABLE IF EXISTS `accounts`;

CREATE TABLE `accounts` (
  `Account_no` int(11) NOT NULL,
  `Name` char(50) DEFAULT NULL,
  `Date_of_Birth` varchar(50) DEFAULT NULL,
  `Pin` int(50) DEFAULT NULL,
  `Account_type` char(10) DEFAULT NULL,
  `Nationality` char(10) DEFAULT NULL,
  `Caste` char(10) DEFAULT NULL,
  `MICR_no` int(50) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Mobile` int(12) DEFAULT NULL,
  `Address` text,
  `Sec_Q` varchar(50) DEFAULT NULL,
  `Sec_A` char(10) DEFAULT NULL,
  `Balance` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `accounts` */

insert  into `accounts`(`Account_no`,`Name`,`Date_of_Birth`,`Pin`,`Account_type`,`Nationality`,`Caste`,`MICR_no`,`Gender`,`Mobile`,`Address`,`Sec_Q`,`Sec_A`,`Balance`) values 
(5815,'jen','Feb 3, 2020',7908,'saving','Korean','fasd',646,'Female',234567,'san jose del monte','What is your Nick name?','jen',3000),
(7317,'yaw','Feb 2, 2020',572,'Savings','Filipino','fasd',631,'Male',12345,'manilas','What is your Nick name?','jay',1100),
(3809,'rhin','Feb 3, 2020',8080,'','Korean','sdadsd',100,'Female',234567,'quezon','What is your Nick name?','rhin',2000);

/*Table structure for table `balance` */

DROP TABLE IF EXISTS `balance`;

CREATE TABLE `balance` (
  `name` char(50) DEFAULT NULL,
  `account` int(50) DEFAULT NULL,
  `MICR_no` int(50) DEFAULT NULL,
  `balances` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `balance` */

insert  into `balance`(`name`,`account`,`MICR_no`,`balances`) values 
('jen',5815,646,3000),
('yaw',7317,631,1000),
('rhin',3809,100,1900);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

/*
SQLyog Ultimate v9.10 
MySQL - 6.0.11-alpha-community : Database - myshare
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`myshare` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `myshare`;

/*Table structure for table `ordertable` */

DROP TABLE IF EXISTS `ordertable`;

CREATE TABLE `ordertable` (
  `orderId` varchar(100) COLLATE utf8_bin NOT NULL,
  `userId` int(11) NOT NULL,
  `odrderMOney` double(5,2) NOT NULL,
  `orderDdate` datetime NOT NULL,
  `orderStatus` int(2) NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `FKuser_order` (`userId`),
  CONSTRAINT `FKuser_order` FOREIGN KEY (`userId`) REFERENCES `usertable` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `ordertable` */

/*Table structure for table `usertable` */

DROP TABLE IF EXISTS `usertable`;

CREATE TABLE `usertable` (
  `userId` int(11) NOT NULL,
  `UserAccount` varchar(20) COLLATE utf8_bin NOT NULL,
  `userName` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `userPass` varchar(20) COLLATE utf8_bin NOT NULL,
  `userBirth` date DEFAULT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `userAccountUniquieIndex` (`UserAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `usertable` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

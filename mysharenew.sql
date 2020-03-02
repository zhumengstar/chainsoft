/*
SQLyog Ultimate v9.10 
MySQL - 6.0.11-alpha-community : Database - sharedatabase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sharedatabase` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `sharedatabase`;

/*Table structure for table `goodscartable` */

DROP TABLE IF EXISTS `goodscartable`;

CREATE TABLE `goodscartable` (
  `goodsCradId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`goodsCradId`,`userId`),
  KEY `goodsCar` (`userId`),
  CONSTRAINT `goodsCar` FOREIGN KEY (`userId`) REFERENCES `usertable` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `goodscartable` */

/*Table structure for table `orderprotabale` */

DROP TABLE IF EXISTS `orderprotabale`;

CREATE TABLE `orderprotabale` (
  `proId` int(11) NOT NULL,
  `orderId` varchar(100) COLLATE utf8_bin NOT NULL,
  KEY `order_pro1` (`proId`),
  KEY `order_pro2` (`orderId`),
  CONSTRAINT `order_pro1` FOREIGN KEY (`proId`) REFERENCES `producttable` (`proId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `order_pro2` FOREIGN KEY (`orderId`) REFERENCES `ordertable` (`orderId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `orderprotabale` */

/*Table structure for table `ordertable` */

DROP TABLE IF EXISTS `ordertable`;

CREATE TABLE `ordertable` (
  `orderId` varchar(100) COLLATE utf8_bin NOT NULL,
  `userId` int(11) NOT NULL,
  `odrderMoney` double(5,2) NOT NULL,
  `orderDdate` datetime NOT NULL,
  `orderStatus` int(2) NOT NULL,
  `userSex` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `transferMoney` double(5,2) DEFAULT NULL,
  `type` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `FKuser_order` (`userId`),
  CONSTRAINT `FKuser_order` FOREIGN KEY (`userId`) REFERENCES `usertable` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `ordertable` */

/*Table structure for table `producttable` */

DROP TABLE IF EXISTS `producttable`;

CREATE TABLE `producttable` (
  `proId` int(11) NOT NULL,
  `proName` varchar(100) COLLATE utf8_bin NOT NULL,
  `proPrice` double(10,2) NOT NULL,
  `proNum` int(11) NOT NULL,
  `proPhoto` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `salCup` double(10,2) DEFAULT NULL,
  `proInfo` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `producttable` */

/*Table structure for table `usergoodspro` */

DROP TABLE IF EXISTS `usergoodspro`;

/*加约束  唯一约束*/
CREATE TABLE `usergoodspro` (
  `userId` int(11) DEFAULT NULL,
  `proId` int(11) DEFAULT NULL,
  KEY `userGoods1` (`userId`),
  KEY `userGoods2` (`proId`),
  CONSTRAINT `userGoods1` FOREIGN KEY (`userId`) REFERENCES `usertable` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `userGoods2` FOREIGN KEY (`proId`) REFERENCES `producttable` (`proId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `usergoodspro` */

/*Table structure for table `usertable` */

DROP TABLE IF EXISTS `usertable`;

CREATE TABLE `usertable` (
  `userId` int(11) NOT NULL,
  `UserAccount` varchar(20) COLLATE utf8_bin NOT NULL,
  `userName` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `userPass` varchar(20) COLLATE utf8_bin NOT NULL,
  `userBirth` date DEFAULT NULL,
  `userSex` varchar(4) COLLATE utf8_bin DEFAULT NULL,
  `userPhoto` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `userPhone` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `userAccountUniquieIndex` (`UserAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `usertable` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

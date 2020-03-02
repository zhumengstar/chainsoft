/*
SQLyog Ultimate v9.10 
MySQL - 5.1.49-community : Database - sharedatabase
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

insert  into `orderprotabale`(`proId`,`orderId`) values (1,'202002051428001'),(2,'202002051428001'),(3,'202002051428003'),(2,'202002051428002');

/*Table structure for table `ordertable` */

DROP TABLE IF EXISTS `ordertable`;

CREATE TABLE `ordertable` (
  `orderId` varchar(100) COLLATE utf8_bin NOT NULL,
  `userId` int(11) NOT NULL,
  `odrderMoney` double(5,2) NOT NULL,
  `orderDdate` datetime NOT NULL,
  `orderStatus` int(2) NOT NULL,
  `transferMoney` double(5,2) DEFAULT NULL,
  `type` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `FKuser_order` (`userId`),
  CONSTRAINT `FKuser_order` FOREIGN KEY (`userId`) REFERENCES `usertable` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `ordertable` */

insert  into `ordertable`(`orderId`,`userId`,`odrderMoney`,`orderDdate`,`orderStatus`,`transferMoney`,`type`) values ('202002051428001',1,999.99,'2020-02-25 14:28:30',0,50.00,'顺风'),('202002051428002',1,999.99,'2020-02-25 14:59:59',0,22.00,'顺风'),('202002051428003',3,999.99,'2020-02-25 00:00:00',0,30.00,NULL),('20201920333',1,123.00,'2020-02-26 13:47:45',0,NULL,NULL);

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

insert  into `producttable`(`proId`,`proName`,`proPrice`,`proNum`,`proPhoto`,`salCup`,`proInfo`) values (1,'华硕笔记本',5000.00,10000,NULL,NULL,'这是一款性价比非常高的'),(2,'手机',3599.00,190,NULL,NULL,'像素手机'),(3,'surface',7800.00,100,NULL,NULL,NULL);

/*Table structure for table `usergoodspro` */

DROP TABLE IF EXISTS `usergoodspro`;

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

insert  into `usertable`(`userId`,`UserAccount`,`userName`,`userPass`,`userBirth`,`userSex`,`userPhoto`,`userPhone`,`type`) values (1,'wm001',NULL,'wm001123456',NULL,NULL,NULL,NULL,NULL),(2,'liyue',NULL,'liyue123456',NULL,NULL,NULL,NULL,NULL),(3,'wuxiaofei',NULL,'wuxiaofei123456',NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

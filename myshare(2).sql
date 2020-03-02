/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50643
Source Host           : localhost:3306
Source Database       : myshare

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2020-02-25 14:11:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goodscartable
-- ----------------------------
DROP TABLE IF EXISTS `goodscartable`;
CREATE TABLE `goodscartable` (
  `goodsCradId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`goodsCradId`,`userId`),
  KEY `goodsCar` (`userId`),
  CONSTRAINT `goodsCar` FOREIGN KEY (`userId`) REFERENCES `usertable` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for orderprotabale
-- ----------------------------
DROP TABLE IF EXISTS `orderprotabale`;
CREATE TABLE `orderprotabale` (
  `proId` int(11) NOT NULL,
  `orderId` varchar(200) COLLATE utf8_bin NOT NULL,
  KEY `order_pro1` (`proId`),
  KEY `order_pro2` (`orderId`),
  CONSTRAINT `order_pro1` FOREIGN KEY (`proId`) REFERENCES `producttable` (`proId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `order_pro2` FOREIGN KEY (`orderId`) REFERENCES `ordertable` (`orderId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for ordertable
-- ----------------------------
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

-- ----------------------------
-- Table structure for producttable
-- ----------------------------
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

-- ----------------------------
-- Table structure for usergoodspro
-- ----------------------------
DROP TABLE IF EXISTS `usergoodspro`;
CREATE TABLE `usergoodspro` (
  `userId` int(11) DEFAULT NULL,
  `proId` int(11) DEFAULT NULL,
  KEY `userGoods1` (`userId`),
  KEY `userGoods2` (`proId`),
  CONSTRAINT `userGoods1` FOREIGN KEY (`userId`) REFERENCES `usertable` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `userGoods2` FOREIGN KEY (`proId`) REFERENCES `producttable` (`proId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for usertable
-- ----------------------------
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

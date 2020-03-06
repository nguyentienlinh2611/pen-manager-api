-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: sapo
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product_mn`
--

DROP TABLE IF EXISTS `product_mn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_mn` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `portfolio` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `color` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL,
  `created` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `product_mn_name_uindex` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_mn`
--

LOCK TABLES `product_mn` WRITE;
/*!40000 ALTER TABLE `product_mn` DISABLE KEYS */;
INSERT INTO `product_mn` VALUES (2,'pencil','pencil green 0.2mm','green','0.2mm',20000,'2020-03-05 10:58:45'),(3,'pencil','pencil green 0.5mm','green','0.5mm',8000,'2020-03-05 11:03:37'),(4,'pen','pen red 0.3mm','red','0.3mm',8000,'2020-03-05 11:24:57'),(5,'point pen','point pen black 0.5mm','black','0.5mm',5000,'2020-03-06 13:57:30'),(6,'pencil','Pencil pinks 0.2mm','pink','0.2mm',20000,'2020-03-06 15:11:23'),(7,'point pen','point pen blue 0.5mm','blue','0.5mm',5000,'2020-03-06 15:15:41'),(8,'point pen','point pen red 0.8mm','red','0.8mm',8000,'2020-03-06 15:17:33'),(9,'point pen','point pen orange 0.5mm','orange','0.5mm',5000,'2020-03-06 15:18:01'),(10,'pen','pen blue black 0.8mm','blue black','0.8mm',35000,'2020-03-06 15:24:07'),(11,'pencil','pencil fruit pink 0.5mm','pink','0.5mm',15000,'2020-03-06 15:32:30'),(12,'brush pen','brush pen sakura black','black',NULL,25000,'2020-03-06 15:32:30'),(13,'brush pen','brush pen sakura red','red',NULL,25000,'2020-03-06 15:32:30'),(14,'brush pen','brush pen KOI gray','gray',NULL,30000,'2020-03-06 15:32:30'),(15,'crayon','crayon rabit','all',NULL,30000,'2020-03-06 15:37:53'),(16,'gel pen','gel pen TL black 0.7mm','black','0.7mm',10000,'2020-03-06 15:37:53'),(17,'gel pen','gel pen TL blue 0.7mm','blue','0.7mm',10000,'2020-03-06 15:37:53');
/*!40000 ALTER TABLE `product_mn` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-06 15:51:55

-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: new_schema
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `author` (
  `author_id` bigint(15) NOT NULL,
  `author_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Nam Cao'),(2,'Tố Hữu'),(3,'Xuân Diệu'),(4,'Hồ Chí Minh'),(5,'Ngọc Hà');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bill` (
  `billID` bigint(15) NOT NULL,
  `userID` bigint(15) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `payment` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `date` timestamp(6) NULL DEFAULT NULL,
  PRIMARY KEY (`billID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (0,0,0,'s','s','2018-12-28 04:48:35.346000'),(1545,1,20000,'Bank transfer','vanphu','2018-12-28 07:32:31.213000'),(33501,154583,20000,'Bank transfer','vanphu','2018-12-28 07:42:13.504000'),(33727,154583,20000,'Bank transfer','vÄn phÃº','2018-12-28 07:48:53.730000'),(154598,1,20000,'Bank transfer','vanphu','2018-12-28 07:38:47.276000'),(15459828,154583,20000,'Bank transfer','vanphu','2018-12-28 07:40:13.196000'),(1545984340416,1,20000,'Bank transfer','vÄn phÃº','2018-12-28 08:05:40.416000'),(1545985392350,1,20000,'Bank transfer','vanphu','2018-12-28 08:23:12.350000'),(1545995454279,1,70000,'Live','vÄn phÃº','2018-12-28 11:10:54.283000'),(1546010185101,1,20000,'Bank transfer','vanphu','2018-12-28 15:16:25.107000'),(1546013059831,1,20000,'Bank transfer','','2018-12-28 16:04:19.836000'),(1546013209633,1,0,'Live','vanphu','2018-12-28 16:06:49.633000'),(1546075959370,154583,30000,'Live','ha noi','2018-12-29 09:32:39.374000'),(1546098940908,154583,0,'Live','vanphu','2018-12-29 15:55:40.908000'),(1546186247873,1,40000,'Qua thẻ ngân hàng','văn phú','2018-12-30 16:10:47.901000');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `billdetail`
--

DROP TABLE IF EXISTS `billdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `billdetail` (
  `billDetailID` bigint(15) NOT NULL,
  `billID` bigint(15) DEFAULT NULL,
  `productID` bigint(15) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` bigint(15) DEFAULT NULL,
  PRIMARY KEY (`billDetailID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billdetail`
--

LOCK TABLES `billdetail` WRITE;
/*!40000 ALTER TABLE `billdetail` DISABLE KEYS */;
INSERT INTO `billdetail` VALUES (1,0,0,0,0),(33524,33501,1,20000,1),(33787,33727,1,20000,1),(154598,154598,1,20000,1),(15459828,15459828,1,20000,1),(1545984340481,1545984340416,1,20000,1),(1545985392413,1545985392350,1,20000,1),(1545995454402,1545995454279,1,20000,1),(1545995454420,1545995454279,2,30000,1),(1545995454440,1545995454279,6,20000,1),(1546010185148,1546010185101,1,20000,1),(1546013059944,1546013059831,1,20000,1),(1546075959454,1546075959370,1,20000,1),(1546075959469,1546075959370,3,10000,1),(1546186247959,1546186247873,2,30000,1),(1546186247972,1546186247873,3,10000,1);
/*!40000 ALTER TABLE `billdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `id` bigint(15) NOT NULL,
  `category_id` bigint(15) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `author_id` bigint(15) DEFAULT NULL,
  `publisher_id` bigint(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,3,'Một đi không trở lại','1dikotrolai.jpg',20000,1,2),(2,4,'ASP.net','ASP.net.jpg',30000,3,4),(3,1,'CCNA','CCNA.jpg',10000,1,1),(4,3,'Áo dài xưa nay','aodai_xuanay.jpg',15000,2,3),(5,2,'Con thuyền','conthuyen.jpg',50000,3,2),(6,4,'Đắc nhân tâm','danhantam.jpg',20000,4,4),(7,2,'Giã từ trần thế','giatutranthe.jpg',30000,1,1),(8,3,'Ông già và biển cả','onggia_bienca.jpg',40000,2,3),(9,1,'Phong thủy','phongthuy.jpg',100000,4,1),(10,1,'Điện tử thực hành','dientuthuchanh.jpg',40000,3,4),(11,1,'Đơn giản thuần khiết','dongianvathuankhiet.jpg',20000,2,5),(12,1,'Giả từ trần thế','giatutranthe.jpg',15000,1,3),(14,1,'Điện tử Kỹ thuật số','khoahockythuat_dayvahocngheDienTu.jpg',70000,3,5),(15,3,'Ký ức miền quê','kyuc_mienque.jpg',20000,2,2),(16,3,'Lá nằm trong lá','lanamtrongla.jpg',20000,2,2),(17,4,'Laptop đa năng','laptopdanang.jpg',40000,3,5),(18,1,'Limh hồn và quỷ dữ','linhhonvaquydu.jpg',30000,4,1),(19,3,'Mèo đen','meoden.jpg',15000,2,5),(20,4,'Microsoft VISIO','microsoft_visio.jpg',90000,4,5),(21,4,'Máy tính sát thủ','mtsatthu.jpg',70000,4,5),(23,2,'Nghiệp vụ nhà hàng','nghiepvunhahang.jpg',20000,2,1),(24,2,' Chuẩn đoán thủy sản','NLNG_thuysan.jpg',20000,3,4),(25,2,'Trồng và uốn tỉa Bonsai','NLNG_tiabonsai.jpg',20000,3,4),(26,2,'Kỹ thuật trồng cà chua','NLNG_trongcachua.jpg',20000,2,4),(27,2,'Kỹ thuật trồng hoa Lan','NLNG_tronghoaLan.jpg',20000,2,4),(28,2,'Luật tổ chức tín dụng','PL_luatcactochuctindung.jpg',50000,5,5),(29,2,'Luật đầu tư','PL_luatdautu.jpg',60000,5,5),(30,2,'Luật doanh nghiệp 2015','PL_luatdoanhnghiep.jpg',60000,5,5),(31,2,'Luật kinh tế','PL_luatkinhte.jpg',40000,3,5),(32,2,'Luật phá sản','PL_luatphasan.jpg',40000,3,5),(34,2,'Quy tắc công việc','qtcv.jpg',30000,1,2),(35,2,'Quy tắc để giàu có','qtgc.jpg',30000,1,2),(36,2,'Những quy tắc quản lý','qtql.jpg',30000,1,2),(37,2,'Quản trị khủng hoảng','quantrithoiKH.jpg',20000,3,4),(38,4,'Sử dụng Internet','sotayMeovatIntenet.jpg',30000,2,5),(39,4,'Sử dụng máy vi tính','sotayMeovatSudungvitinh.jpg',30000,2,5),(40,4,'Tin học cho nhân viên','sotayTinHoc.jpg',20000,3,5),(41,4,'Tin học cho xin việc','sotayTinHoc_xinviec.jpg',20000,3,5),(43,1,'Tâm bình an','tambinhan.jpg',30000,2,2),(44,1,'Thế giới vô hình','thegioivohinh.jpg',30000,2,2),(45,4,' Thiết kế website','thietkeWebsite.jpg',100000,3,5),(46,3,'Ông kể cháu nghe','thieunhi_chuyenongchau.jpg',20000,1,1),(47,3,'Cổ tích thiếu nhi','thieunhi_cotich.jpg',20000,1,1),(48,3,'Đây là nhà của tôi','thieunhi_daylanhacuatoi.jpg',20000,3,3),(49,3,'Thằng mõ trâu','thieunhi_thangmotrau.jpg',20000,3,3),(50,3,'Thiên tài sáng tạo','thieunhi_thientainhotuoi.jpg',20000,4,2),(51,3,'Hùng Vương','thieunhi_truyenthuyetHV.jpg',20000,3,2),(52,2,'Thương mại điện tử','thuongmaidientu.jpg',60000,1,4),(53,1,'Trang bị điện','trangbidien.jpg',30000,2,3),(54,1,'Từ điển TOEFL','tudien_TOEFL.jpg',80000,3,4),(55,1,'Từ điển phổ thông','tudienchinhta.jpg',20000,1,1),(56,1,'Từ điển hình ảnh','tudienhinhanh.jpg',50000,1,2),(57,1,'Từ điển Hoa - Việt','tudienHV.jpg',70000,2,3),(58,1,'Từ điển kỹ thuật','tudienKTTH.jpg',80000,3,5),(59,1,'Từ điển ngân hàng','tudiennganhang.jpg',100000,5,3),(60,1,'Từ điển Pháp - Việt','tudienPhapPhapViet.jpg',100000,5,3);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category` (
  `id` bigint(15) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Sách khoa học'),(2,'Sách kinh tế'),(3,'Truyện'),(4,'Sách lập trình');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `publisher` (
  `publisher_id` int(11) NOT NULL,
  `publisher_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`publisher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES (1,'Kim Đồng'),(2,'Giáo Dục'),(3,'Văn Học'),(4,'Thanh Niên'),(5,'Thông tin và truyền thông');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `user_id` bigint(15) NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `user_email` varchar(45) DEFAULT NULL,
  `user_pass` varchar(45) DEFAULT NULL,
  `user_role` bit(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'hiep','hoanghiep1097@gmail.com','1',_binary ''),(154583,'a','a@gmail.com','1',_binary '\0'),(1545989395161,'aa','aa','1',_binary '\0'),(1545990292662,'ab','1234','1',_binary '\0');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-30 23:28:46

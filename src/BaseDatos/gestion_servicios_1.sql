-- MySQL dump 10.13  Distrib 5.7.44, for Win64 (x86_64)
--
-- Host: localhost    Database: gestion_servicios
-- ------------------------------------------------------
-- Server version	5.7.44-log

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
-- Current Database: `gestion_servicios`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `gestion_servicios` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `gestion_servicios`;

--
-- Table structure for table `dependencias`
--

DROP TABLE IF EXISTS `dependencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dependencias` (
  `centro_costo` varchar(20) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  PRIMARY KEY (`centro_costo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependencias`
--

LOCK TABLES `dependencias` WRITE;
/*!40000 ALTER TABLE `dependencias` DISABLE KEYS */;
INSERT INTO `dependencias` VALUES ('CC-002','Departamento de Contabilidad'),('CC-003','Departamento de Recursos Humanos'),('CC-004','Facultad de Ingeniería'),('CC-005','Rectoría');
/*!40000 ALTER TABLE `dependencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `descripcion_servicios`
--

DROP TABLE IF EXISTS `descripcion_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descripcion_servicios` (
  `numero_orden` int(11) NOT NULL,
  `servicioselec` enum('Fotocopia Carta','Fotocopia Oficio','Fotocopia lado por lado','Duplicacion Offset','Ampliacion','Reduccion','Quema de acetato','Acetato completo','Hojas en blanco','Anillo de plastico','Argollado doble 0','Engomado','Perforado','Cartulina','Impresion B/N','Impresion Color','Impresion lado x lado','Acetato B/N','Acetato color','Label de cd','Quema de cd','Scanner','Pasar archivo PDF') NOT NULL,
  PRIMARY KEY (`numero_orden`),
  CONSTRAINT `descripcion_servicios_ibfk_1` FOREIGN KEY (`numero_orden`) REFERENCES `ordenes` (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descripcion_servicios`
--

LOCK TABLES `descripcion_servicios` WRITE;
/*!40000 ALTER TABLE `descripcion_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `descripcion_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especificacion_papeles`
--

DROP TABLE IF EXISTS `especificacion_papeles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especificacion_papeles` (
  `numero_orden` int(11) NOT NULL,
  `tipo_papel` varchar(30) NOT NULL,
  `trae_papel` tinyint(1) NOT NULL DEFAULT '0',
  `cantidad_carta` int(11) DEFAULT NULL,
  `cantidad_oficio` int(11) DEFAULT NULL,
  `cantidad_total` int(11) NOT NULL,
  PRIMARY KEY (`numero_orden`,`tipo_papel`),
  CONSTRAINT `especificacion_papeles_ibfk_1` FOREIGN KEY (`numero_orden`) REFERENCES `ordenes` (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especificacion_papeles`
--

LOCK TABLES `especificacion_papeles` WRITE;
/*!40000 ALTER TABLE `especificacion_papeles` DISABLE KEYS */;
/*!40000 ALTER TABLE `especificacion_papeles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liquidaciones`
--

DROP TABLE IF EXISTS `liquidaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liquidaciones` (
  `numero_orden` int(11) NOT NULL,
  `maquina` varchar(50) NOT NULL,
  `hora` time NOT NULL,
  `ficha` varchar(20) NOT NULL,
  `local` varchar(50) NOT NULL,
  `auxiliar` varchar(100) NOT NULL,
  `fecha_elaboracion` date NOT NULL,
  PRIMARY KEY (`numero_orden`),
  CONSTRAINT `liquidaciones_ibfk_1` FOREIGN KEY (`numero_orden`) REFERENCES `ordenes` (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liquidaciones`
--

LOCK TABLES `liquidaciones` WRITE;
/*!40000 ALTER TABLE `liquidaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `liquidaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liquidaciones_papeles_reproducciones`
--

DROP TABLE IF EXISTS `liquidaciones_papeles_reproducciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liquidaciones_papeles_reproducciones` (
  `numero_orden` int(11) NOT NULL,
  `tipo_papel` varchar(30) NOT NULL,
  `nro_unidades` int(11) NOT NULL,
  `hojas_malas_operario` int(11) NOT NULL,
  `hojas_malas_maquina` int(11) NOT NULL,
  `hojas_no_contab_maquina` int(11) NOT NULL,
  `hojas_en_blanco` int(11) NOT NULL,
  `valor` float(10,2) NOT NULL,
  `nro_reproducciones` int(11) NOT NULL,
  PRIMARY KEY (`numero_orden`,`tipo_papel`),
  CONSTRAINT `fk_papeles_reproducciones_liquidaciones` FOREIGN KEY (`numero_orden`) REFERENCES `liquidaciones` (`numero_orden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liquidaciones_papeles_reproducciones`
--

LOCK TABLES `liquidaciones_papeles_reproducciones` WRITE;
/*!40000 ALTER TABLE `liquidaciones_papeles_reproducciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `liquidaciones_papeles_reproducciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liquidaciones_servicios_adicionales`
--

DROP TABLE IF EXISTS `liquidaciones_servicios_adicionales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liquidaciones_servicios_adicionales` (
  `numero_orden` int(11) NOT NULL,
  `servicio_liquidacion` enum('Anillo','Argollado','Caratula','Perforado','Engomado','Scanner','Quema cd','Pasar archivo .pdf') NOT NULL,
  `referencia` varchar(100) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `valor` float(10,2) NOT NULL,
  PRIMARY KEY (`numero_orden`),
  CONSTRAINT `fk_servicio_adicional_liquidaciones` FOREIGN KEY (`numero_orden`) REFERENCES `liquidaciones` (`numero_orden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liquidaciones_servicios_adicionales`
--

LOCK TABLES `liquidaciones_servicios_adicionales` WRITE;
/*!40000 ALTER TABLE `liquidaciones_servicios_adicionales` DISABLE KEYS */;
/*!40000 ALTER TABLE `liquidaciones_servicios_adicionales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordenes`
--

DROP TABLE IF EXISTS `ordenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordenes` (
  `numero` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_solicitud` date NOT NULL,
  `observaciones` text,
  `tipo` enum('IMPRESIONES','FOTOCOPIAS') NOT NULL,
  `cedula_solicitante` int(11) NOT NULL,
  PRIMARY KEY (`numero`),
  KEY `cedula_solicitante` (`cedula_solicitante`),
  CONSTRAINT `ordenes_ibfk_1` FOREIGN KEY (`cedula_solicitante`) REFERENCES `solicitantes` (`cedula`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordenes`
--

LOCK TABLES `ordenes` WRITE;
/*!40000 ALTER TABLE `ordenes` DISABLE KEYS */;
INSERT INTO `ordenes` VALUES (5,'2026-05-01','Exámenes parciales contabilidad','FOTOCOPIAS',10234567),(6,'2026-05-05','Contratos personal nuevo','IMPRESIONES',15678432),(7,'2026-05-10','Talleres de programación','FOTOCOPIAS',19876543),(8,'2026-05-15','Circulares rectoría','IMPRESIONES',22345678);
/*!40000 ALTER TABLE `ordenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitantes`
--

DROP TABLE IF EXISTS `solicitantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitantes` (
  `cedula` int(11) NOT NULL,
  `extension` varchar(10) NOT NULL,
  `nombre_apellido` varchar(80) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `centro_costo_dependencia` varchar(80) NOT NULL,
  PRIMARY KEY (`cedula`),
  KEY `centro_costo_dependencia` (`centro_costo_dependencia`),
  CONSTRAINT `solicitantes_ibfk_1` FOREIGN KEY (`centro_costo_dependencia`) REFERENCES `dependencias` (`centro_costo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitantes`
--

LOCK TABLES `solicitantes` WRITE;
/*!40000 ALTER TABLE `solicitantes` DISABLE KEYS */;
INSERT INTO `solicitantes` VALUES (10234567,'Ext 201','María González Ruiz','Coordinadora Académica','CC-002'),(15678432,'Ext 305','Carlos Martínez López','Jefe de Recursos Humanos','CC-003'),(19876543,'Ext 412','Andrés Herrera Castro','Docente Tiempo Completo','CC-004'),(22345678,'Ext 102','Laura Jiménez Mora','Secretaria Rectoría','CC-005');
/*!40000 ALTER TABLE `solicitantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudes`
--

DROP TABLE IF EXISTS `solicitudes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitudes` (
  `numero_orden` int(11) NOT NULL,
  `reproducciones` int(11) NOT NULL,
  `original` varchar(100) DEFAULT NULL,
  `firma_autorizada` varchar(100) NOT NULL,
  `tipo_servicio` enum('Fotocopia Carta','Fotocopia Oficio','Fotocopia lado por lado','Duplicacion Offset','Ampliacion','Reduccion','Quema de acetato','Acetato completo','Hojas en blanco','Anillo de plastico','Argollado doble 0','Engomado','Perforado','Cartulina','Impresion B/N','Impresion Color','Impresion lado x lado','Acetato B/N','Acetato color','Label de cd','Quema de cd','Scanner','Pasar archivo PDF') NOT NULL,
  PRIMARY KEY (`numero_orden`),
  CONSTRAINT `fk_orden_solicitud` FOREIGN KEY (`numero_orden`) REFERENCES `ordenes` (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudes`
--

LOCK TABLES `solicitudes` WRITE;
/*!40000 ALTER TABLE `solicitudes` DISABLE KEYS */;
/*!40000 ALTER TABLE `solicitudes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajos`
--

DROP TABLE IF EXISTS `trabajos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trabajos` (
  `numero_orden` int(11) NOT NULL,
  `numero` varchar(15) NOT NULL,
  `titulo` varchar(150) NOT NULL,
  PRIMARY KEY (`numero_orden`,`numero`),
  CONSTRAINT `fk_trabajos` FOREIGN KEY (`numero_orden`) REFERENCES `liquidaciones` (`numero_orden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajos`
--

LOCK TABLES `trabajos` WRITE;
/*!40000 ALTER TABLE `trabajos` DISABLE KEYS */;
/*!40000 ALTER TABLE `trabajos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-05-22 19:55:22

-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 12-10-2020 a las 18:19:36
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ri_incret`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE IF NOT EXISTS `estudiantes` (
  `id_e` int(11) NOT NULL AUTO_INCREMENT,
  `nomb_e` varchar(100) NOT NULL,
  `ape_e` varchar(150) NOT NULL,
  `cedula_e` varchar(12) NOT NULL,
  `num_tlf` varchar(12) NOT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `tiene_instrumento` tinyint(1) DEFAULT NULL,
  `borrado_e` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_e`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instrumentos`
--

CREATE TABLE IF NOT EXISTS `instrumentos` (
  `id_instru` int(11) NOT NULL AUTO_INCREMENT,
  `fk_nomb_instru` int(11) NOT NULL,
  `fk_marca_instru` int(11) NOT NULL,
  `color_instru` varchar(50) NOT NULL,
  `serial_instru` varchar(50) NOT NULL,
  `disponible` tinyint(1) DEFAULT NULL,
  `borrado_instru` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_instru`),
  KEY `fk_nomb_instru` (`fk_nomb_instru`),
  KEY `fk_marca_instru` (`fk_marca_instru`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca_instrumento`
--

CREATE TABLE IF NOT EXISTS `marca_instrumento` (
  `id_marca` int(11) NOT NULL AUTO_INCREMENT,
  `nomb_marca` varchar(50) NOT NULL,
  `borrado_marca` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_marca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nombre_instrumento`
--

CREATE TABLE IF NOT EXISTS `nombre_instrumento` (
  `id_nombi` int(11) NOT NULL AUTO_INCREMENT,
  `nomb_i` varchar(50) NOT NULL,
  `borrado_nombi` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_nombi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE IF NOT EXISTS `prestamo` (
  `id_pres` int(11) NOT NULL AUTO_INCREMENT,
  `fk_id_usu` int(11) NOT NULL,
  `fk_id_estu` int(11) NOT NULL,
  `fk_id_instru` int(11) NOT NULL,
  `fecha_entrega` date NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `prestamo_terminado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_pres`),
  KEY `fk_id_usu` (`fk_id_usu`),
  KEY `fk_id_estu` (`fk_id_estu`),
  KEY `fk_id_instru` (`fk_id_instru`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usu` int(11) NOT NULL AUTO_INCREMENT,
  `nomb_usu` varchar(50) NOT NULL,
  `clave_usu` varchar(10) NOT NULL,
  `administrador` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_usu`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usu`, `nomb_usu`, `clave_usu`, `administrador`) VALUES
(1, 'Artt', '12345', 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `instrumentos`
--
ALTER TABLE `instrumentos`
  ADD CONSTRAINT `instrumentos_ibfk_1` FOREIGN KEY (`fk_nomb_instru`) REFERENCES `nombre_instrumento` (`id_nombi`),
  ADD CONSTRAINT `instrumentos_ibfk_2` FOREIGN KEY (`fk_marca_instru`) REFERENCES `marca_instrumento` (`id_marca`);

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`fk_id_usu`) REFERENCES `usuarios` (`id_usu`),
  ADD CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`fk_id_estu`) REFERENCES `estudiantes` (`id_e`),
  ADD CONSTRAINT `prestamo_ibfk_3` FOREIGN KEY (`fk_id_instru`) REFERENCES `instrumentos` (`id_instru`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

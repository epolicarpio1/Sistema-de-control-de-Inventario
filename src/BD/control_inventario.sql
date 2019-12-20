-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2015 a las 17:34:18
-- Versión del servidor: 5.6.24
-- Versión de PHP: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `control_inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE IF NOT EXISTS `administrador` (
  `id_admi` int(11) NOT NULL,
  `nom_admi` varchar(15) NOT NULL,
  `ape_admi` varchar(25) NOT NULL,
  `tipo_invi` varchar(15) NOT NULL,
  `no_ficha` varchar(6) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `edificio` varchar(25) NOT NULL,
  `tipo_sesion` varchar(15) NOT NULL,
  `contra_usu` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE IF NOT EXISTS `articulos` (
  `nom_cli` varchar(30) NOT NULL,
  `equip` varchar(25) NOT NULL,
  `marc` varchar(25) NOT NULL,
  `model` varchar(25) NOT NULL,
  `seri` varchar(30) NOT NULL,
  `inmo` varchar(25) NOT NULL,
  `ubi` varchar(25) NOT NULL,
  `obser` varchar(100) NOT NULL,
  `acti` varchar(20) NOT NULL,
  `nom_sala` varchar(15) NOT NULL,
  `pertenece` varchar(9) NOT NULL,
  `nom_pertenece` varchar(15) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `resolucion` varchar(15) NOT NULL,
  `ram` varchar(15) NOT NULL,
  `dd` varchar(15) NOT NULL,
  `pulgadas` varchar(15) NOT NULL,
  `lector` varchar(2) NOT NULL,
  `ip` varchar(20) NOT NULL,
  `impresora` varchar(30) NOT NULL,
  `hdmi` varchar(2) NOT NULL,
  `usb` varchar(2) NOT NULL,
  `explic` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invitado`
--

CREATE TABLE IF NOT EXISTS `invitado` (
  `id_invi` int(11) NOT NULL,
  `nom_invi` varchar(15) NOT NULL,
  `ape_invi` varchar(25) NOT NULL,
  `tipo_invi` varchar(15) NOT NULL,
  `no_ficha` varchar(6) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `lugar_reg` varchar(25) NOT NULL,
  `contra_usu` varchar(15) NOT NULL,
  `tipo_sesion` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_admi`);

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`seri`);

--
-- Indices de la tabla `invitado`
--
ALTER TABLE `invitado`
  ADD PRIMARY KEY (`id_invi`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id_admi` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `invitado`
--
ALTER TABLE `invitado`
  MODIFY `id_invi` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

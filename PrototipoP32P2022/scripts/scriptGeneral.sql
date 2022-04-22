CREATE SCHEMA IF NOT EXISTS `prototipoP32P2022` DEFAULT CHARACTER SET utf8 ;
USE `prototipoP32P2022` ;

CREATE TABLE IF NOT EXISTS tbl_usuarios (
	usuid INT NOT NULL AUTO_INCREMENT,
	usunombre VARCHAR(45) NOT NULL,
    usucontrasena VARCHAR(45) NOT NULL,
    Tipousu VARCHAR(45) NOT NULL,
	PRIMARY KEY (usuid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_tipousuarios (
	tipousuid INT NOT NULL AUTO_INCREMENT,
	tipousunombre VARCHAR(45) NOT NULL,
	PRIMARY KEY (tipousuid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_empleados (
	emplid INT NOT NULL AUTO_INCREMENT,
	emplnombre VARCHAR(45) NOT NULL,
    emplapellidos VARCHAR(45) NOT NULL,
    empldireccion VARCHAR(45) NOT NULL,
    emplTipousu VARCHAR(45) NOT NULL,
    emplnacimiento DATE NOT NULL,
    empldpi int (11) NOT NULL,
	PRIMARY KEY (emplid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_entrenadores (
	entreid INT NOT NULL AUTO_INCREMENT,
	entrenombre VARCHAR(45) NOT NULL,
    entreapellidos VARCHAR(45) NOT NULL,
    entredireccion VARCHAR(45) NOT NULL,
    entrenacimiento DATE NOT NULL,
	PRIMARY KEY (entreid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_equipos (
	equiid INT NOT NULL AUTO_INCREMENT,
	equinombre VARCHAR(45) NOT NULL,
    equitorneosganados VARCHAR(45) NOT NULL,
	equitorneosperdidos VARCHAR(45) NOT NULL,
    equientre VARCHAR(45) NOT NULL,
    equideporte VARCHAR(45) NOT NULL,
	PRIMARY KEY (equiid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_jugadores (
	jugaid INT NOT NULL AUTO_INCREMENT,
	juganombre VARCHAR(45) NOT NULL,
    jugaapellidos VARCHAR(45) NOT NULL,
    jugadireccion VARCHAR(45) NOT NULL,
    juganacimiento DATE NOT NULL,
	PRIMARY KEY (jugaid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_tiposjugadores (
	tiposjugaid INT NOT NULL AUTO_INCREMENT,
	tiposjuganombre VARCHAR(45) NOT NULL,
    tiposjugadeporte VARCHAR(45) NOT NULL,
	PRIMARY KEY (tiposjugaid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_deportes (
	deporid INT NOT NULL AUTO_INCREMENT,
	depornombre VARCHAR(45) NOT NULL, 
	PRIMARY KEY (deporid) )
ENGINE = InnoDB CHARACTER SET = latin1;


CREATE TABLE IF NOT EXISTS tbl_sedes (
	sedeid INT NOT NULL AUTO_INCREMENT,
	sedenombre VARCHAR(45) NOT NULL,
    sededireccion VARCHAR(45) NOT NULL,
    sedepais VARCHAR(45) NOT NULL,
    sedecapacidad INT(20) NOT NULL,
	PRIMARY KEY (sedeid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_pais (
	paisid INT NOT NULL AUTO_INCREMENT,
	paisnombre VARCHAR(45) NOT NULL,
	PRIMARY KEY (paisid) )
ENGINE = InnoDB CHARACTER SET = latin1;


CREATE TABLE IF NOT EXISTS tbl_campeonatosencurso (
	camid INT NOT NULL AUTO_INCREMENT,
	camnombre VARCHAR(45) NOT NULL,
    camcantidad int(45) NOT NULL,
	PRIMARY KEY (camid) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS tbl_campeonatoscerrados (
	campid INT NOT NULL AUTO_INCREMENT,
	camnpombre VARCHAR(45) NOT NULL,
    campcantidad int(45) NOT NULL,
	campganador VARCHAR(45) NOT NULL,
	PRIMARY KEY (campid) )
ENGINE = InnoDB CHARACTER SET = latin1;



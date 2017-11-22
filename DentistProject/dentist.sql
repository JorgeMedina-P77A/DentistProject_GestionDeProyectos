-- MySQL Workbench Forward Engineering
drop schema if exists dentist;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema dentist
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dentist
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dentist` DEFAULT CHARACTER SET utf8 ;
USE `dentist` ;
-- -----------------------------------------------------
-- Table `dentist`.`actividades`
-- -----------------------------------------------------
---------------------------------
-- Table `dentist`.`pacientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dentist`.`pacientes` (
  `idPaciente` INT(10) NOT NULL,
  `nombre` VARCHAR(35) NOT NULL,
  `ApellidoP` VARCHAR(35) NOT NULL,
  `ApellidoM` VARCHAR(35) NOT NULL,
  `edad` INT(3) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `sexo` ENUM('Femenino', 'Masculino') NOT NULL,
  `EstadoCivil` ENUM('Soltero(a)', 'Casado(a)', 'Viudo(a)', 'Divorciado(a)', 'Union Libre') NULL DEFAULT NULL,
  `diagnostico` VARCHAR(35) NOT NULL,
  `padecimiento` VARCHAR(35) NOT NULL,
  `tratamiento` TEXT NOT NULL,
  `actividades` TEXt NOT NULL,
  `dia` INT(11) NOT NULL,
  `mes` INT(11) NOT NULL,
  `year` INT(11) NOT NULL,
  `vigencia` boolean NOT NULL,
  PRIMARY KEY (`idPaciente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dentist`.`citas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dentist`.`citas` (
  `idCita` INT(10) NOT NULL,
  `NombrePaciente` varchar(50) NULL DEFAULT NULL,
  `descripcion` text NOT NULL,
  `fecha` varchar(12) NULL DEFAULT NULL,
  `hora` TIME NULL DEFAULT NULL,
  `tratamiento` varchar(50) NOT NULL,
  `tipo` varchar(40) not null,
  `costoTotal` DECIMAL(10,2) not null,
  `CantidadPagada` DECIMAL(10,2) not null,
  PRIMARY KEY (`idCita`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dentist`.`hclinica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dentist`.`hclinico` (
  `idHC` INT(10) NOT NULL,
  `idPaciente` INT(13) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `Tratamiento` boolean NOT NULL,
  `Tipo` VARCHAR(10) NOT NULL,
  `NombreDr` VARCHAR(45) NULL DEFAULT NULL,
  `TomaMedicamento` boolean NOT NULL,
  `CualMedicamento` VARCHAR(45) NOT NULL,
  `Hospitalizacion` boolean NOT NULL,
  `MotivoHospitalizacion` VARCHAR(45) NULL DEFAULT NULL,
  `Esmalte` boolean NOT NULL,
  `Dentina` boolean NOT NULL,
  `Raiz` boolean NOT NULL,
  `Huesos` boolean NOT NULL,
  `Encia` boolean NOT NULL,
  `InsercionEpitelial` boolean NOT NULL,
  `Lengua` boolean NOT NULL,
  `Pulpa` boolean NOT NULL,
  `Velo` boolean NOT NULL,
  `Carrillos` boolean NOT NULL,
  `SobreMordida` boolean NOT NULL,
  `MordidaAbierta` boolean NOT NULL,
  `DesgasteBruxismo` boolean NOT NULL,
  `Anoclusion` boolean NOT NULL,
  `ARespiratorio` boolean NOT NULL,
  `ACardiobascular` boolean NOT NULL,
  `ADigestivo` boolean NOT NULL,
  `SNervioso` boolean NOT NULL,
  `Goagulacion` boolean NOT NULL,
  `Vertigos` boolean NOT NULL,
  `Diabetes` boolean NOT NULL,
  `Tiroides` boolean NOT NULL,
  `Fiebre` boolean NOT NULL,
  `Hipertension` boolean NOT NULL,
  `Desmayos` boolean NOT NULL,
  `Embarazo` boolean NOT NULL,
  `Fuma` boolean NOT NULL,
  `Bebe` boolean NOT NULL,
  `ConsumeDrogas` boolean NOT NULL,
  `Alergias` boolean NOT NULL,
  `TipoAlergia` VARCHAR(50) NULL DEFAULT NULL,
  `HigienBucal` VARCHAR(10) NOT NULL,
  `HabitosAlimenticios` VARCHAR(10) NOT NULL,
  `TipoConsulta` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idHC`),
  INDEX `idPaciente` (`idPaciente` ASC),
  CONSTRAINT `hclinica_ibfk_1`
    FOREIGN KEY (`idPaciente`)
    REFERENCES `dentist`.`pacientes` (`idPaciente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dentist`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dentist`.`productos` (
  `idProducto` INT(10) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `descripcion` TEXT NULL DEFAULT NULL,
  `cantidad` INT(4) NULL DEFAULT NULL,
  `precioCompra` DECIMAL(9,2) NULL DEFAULT NULL,
  `precioVenta` DECIMAL(9,2) NULL DEFAULT NULL,
  PRIMARY KEY (`idProducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
-- -----------------------------------------------------
-- Table `dentist`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dentist`.`usuarios` (
  `IdUsuario` INT(10) NOT NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `password` INT(10) NOT NULL,
  PRIMARY KEY (`IdUsuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



create view Nombres as
select concat(nombre,' ',ApellidoP,' ',ApellidoM)as Nombre from Pacientes;

insert into pacientes values(4,'Daniel','Franco','Ortiz',20,'Av. Morelos','Masculino','Soltero(a)'
							,'No','No','No','Ninguno',7,6,1996,false);
insert into pacientes values (06,'Pedro Antonio', 'Chavez', 'Samano',21,  'Michoacan #7','Masculino', 
'Union Libre', 'Ninguno','Ninguno','Ninguno','Ninguno',15,10,1995,1);


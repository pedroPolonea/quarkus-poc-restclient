CREATE TABLE `seller`.`sellers` (
  `ID_SELLER` INT NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(100) NOT NULL,
  `DAT_CREATION` DATETIME NOT NULL,
  `ACTIVE` TINYINT(1) NOT NULL,
  PRIMARY KEY (`ID_SELLER`),
  UNIQUE INDEX `ID_SELLER_UNIQUE` (`ID_SELLER` ASC));


INSERT INTO `seller`.`sellers` (`ID_SELLER`, `NAME`, `DAT_CREATION`, `ACTIVE`) VALUES ('1', 'Jão','2019-11-25 00:05:24', '1');
INSERT INTO `seller`.`sellers` (`ID_SELLER`, `NAME`, `DAT_CREATION`,`ACTIVE`) VALUES ('2', 'Pé de fava', '2019-11-25 00:05:24','1');


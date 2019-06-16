SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for transacation
-- ----------------------------
DROP TABLE IF EXISTS `transacation`;
CREATE TABLE `transacation`
(
  `txhash`   char(64) NOT NULL,
  `time`     datetime,
  `size`     int,
  `weight`   double,
  `amount`    double,
  PRIMARY KEY (`txhash`),
  index `idx_txhash` (`txhash`),
  index `idx_time` (`time`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

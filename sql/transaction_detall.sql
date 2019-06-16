SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tx_detall
-- ----------------------------
DROP TABLE IF EXISTS `tx_detall`;
CREATE TABLE `tx_detall`
(
  `id` bigint NOT NULL auto_increment,
  `adress`  varchar(100),
  `amount`   double,
  `type`     int,
  `txhash`   char(64),
  PRIMARY KEY (`id`),
  index `idx_adress` (`adress`),
  index `idx_txhash` (`txhash`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

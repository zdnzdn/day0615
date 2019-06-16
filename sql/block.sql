SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for block
-- ----------------------------
DROP TABLE IF EXISTS `block`;
CREATE TABLE `block`
(
  `blockhash`  char(64) NOT NULL,
  `height`     int NOT NULL,
  `time`       datetime,
  `size`        int,
  `txSize`     smallint,
  `transactions`  double,
  `number_transaction`  int,
  `difficulty` double,
  `weight`     float,
  `output_total` char(64),
  `next_hash` char(64),
  `prev_hash` char(64),
  PRIMARY KEY (`blockhash`),
  index `idx_blockhash` (`blockhash`),
  index `idx_height` (`height`),
  index `idx_time` (`time`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

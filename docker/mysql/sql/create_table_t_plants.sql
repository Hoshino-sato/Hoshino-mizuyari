create table IF not exists `t_plants`
(
 `id`               INT(2) AUTO_INCREMENT,
 `name`             VARCHAR(20) NOT NULL,
 `place_id`         INT(2) NOT NULL,
 `frequency`        INT(3) NOT NULL,
 `created_at`       Datetime DEFAULT CURRENT_TIMESTAMP,
 `updated_at`       Datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`,`name`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
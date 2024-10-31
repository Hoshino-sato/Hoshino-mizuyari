create table IF not exists `places`
(
 `id`               INT(2) AUTO_INCREMENT,
 `place_name`       VARCHAR(20) NOT NULL,
 `description`      VARCHAR(255) NOT NULL,
 `created_at`       Datetime DEFAULT CURRENT_TIMESTAMP,
 `updated_at`       Datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
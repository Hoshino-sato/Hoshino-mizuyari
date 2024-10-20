create table IF not exists `gender_table`
(
 `id`               INT(2) AUTO_INCREMENT,
 `gender`           VARCHAR(3) NOT NULL,
 `created_at`       Datetime DEFAULT CURRENT_TIMESTAMP,
 `updated_at`       Datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
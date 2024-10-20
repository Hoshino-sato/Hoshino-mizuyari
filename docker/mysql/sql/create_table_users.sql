create table IF not exists `users_table`
(
 `id`               INT(20) AUTO_INCREMENT,
 `first_name`       VARCHAR(50) NOT NULL,
 `last_name`        VARCHAR(50) NOT NULL,
 `first_name_kana`  VARCHAR(50) NOT NULL,
 `last_name_kana`   VARCHAR(50) NOT NULL,
 `age`              INT(3) NOT NULL,
 `gender`           INT(2) NOT NULL,
 `created_at`       Datetime DEFAULT CURRENT_TIMESTAMP,
 `updated_at`       Datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
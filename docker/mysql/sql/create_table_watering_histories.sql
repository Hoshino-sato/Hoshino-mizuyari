create table IF not exists `watering_histories`
(
 `id`               BINARY(16) NOT NULL DEFAULT(UUID_TO_BIN(UUID(),1)),
 `plant_id`         BINARY(16) NOT NULL,
 `watering_date`    Datetime NOT NULL,
 `created_at`       Datetime DEFAULT CURRENT_TIMESTAMP,
 `updated_at`       Datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
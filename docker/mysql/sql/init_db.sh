#wait for the MySQL Server to come up
#sleep 90s

#run the setup script to create the DB and the schema in the DB
mysql -u root -prootpassword plant_watering < "/docker-entrypoint-initdb.d/create_table_places.sql"
mysql -u root -prootpassword plant_watering < "/docker-entrypoint-initdb.d/create_table_plants.sql"
mysql -u root -prootpassword plant_watering < "/docker-entrypoint-initdb.d/create_table_watering_histories.sql"
# mysql -u root -prootpassword plant_watering < "/docker-entrypoint-initdb.d/insert_table_users.sql"
# mysql -u root -prootpassword plant_watering < "/docker-entrypoint-initdb.d/insert_table_gender.sql"
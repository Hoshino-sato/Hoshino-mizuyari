#wait for the MySQL Server to come up
#sleep 90s

#run the setup script to create the DB and the schema in the DB
# mysql -u root -prootpassword python_practice_database < "/docker-entrypoint-initdb.d/create_table_users.sql"
# mysql -u root -prootpassword python_practice_database < "/docker-entrypoint-initdb.d/create_table_gender.sql"
# mysql -u root -prootpassword python_practice_database < "/docker-entrypoint-initdb.d/insert_table_users.sql"
# mysql -u root -prootpassword python_practice_database < "/docker-entrypoint-initdb.d/insert_table_gender.sql"
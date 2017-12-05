The main goal of this task is to loa data from hdfs to MySQl table using sqoop.

Requirements:
Folder with input data should be "/input_data/Lizaveta_Matsiushonak" 
Folder with output data should be "/output_data/Lizaveta_Matsiushonak"

To create database, tables, load data in it and run queries you need to run start.sh with the next way:
	start.sh [-r] [-d]
	-r - allows to drop existing database and create, fill it again.
	-d - allows to drop database;


Note:
The queries.sql contains two required queries : 
	1)SELECT COUNT(*) as num_of_records FROM weather (screenshot - result1.png).
 	2)SELECT * FROM weather ORDER BY stationId, date LIMIT 10; (screenshot - result2.png)

The createdb.sql contains the queries for creating database, table 'weather' and staging table 'weather_stage';

The number of mappers was chouesn as a default(4) bacause less can not be used because of the large dataset and more mappers will not optimaze the export; 
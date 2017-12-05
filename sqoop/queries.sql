USE weather_data;
SELECT COUNT(*) as num_of_records FROM weather;
SELECT * FROM weather ORDER BY stationId, date LIMIT 10; 
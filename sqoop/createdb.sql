DROP DATABASE IF EXISTS weather_data;
CREATE  DATABASE IF NOT EXISTS weather_data;
USE weather_data;
CREATE TABLE  IF NOT EXISTS weather (
   stationId VARCHAR(256),
   date DATE,
   tmin INT(3),
   tmax INT(3),
   snow INT(3),
   snwd INT(3),
   prcp INT(3));

CREATE TABLE IF NOT EXISTS weather_stage (
      stationId VARCHAR(256),
      date DATE,
      tmin INT(3),
      tmax INT(3),
      snow INT(3),
      snwd INT(3),
      prcp INT(3));
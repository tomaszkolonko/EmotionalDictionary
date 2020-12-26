CREATE TABLE IF NOT EXISTS USERS (
  userid INT PRIMARY KEY auto_increment,
  username VARCHAR(20),
  salt VARCHAR,
  password VARCHAR,
  firstname VARCHAR(20),
  lastname VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS EMOTIONS (
  emotionid INT PRIMARY KEY auto_increment,
  emotionword VARCHAR NOT NULL,
  description VARCHAR NOT NULL,
  localDateTime DATETIME,
  frequency ENUM('VERY_RARELY', 'RARELY', 'SOMETIMES', 'OFTEN', 'VERY_OFTEN')
);

-- needed else hibernate will start throwing as we are using in memory database
DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  id INT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  salary DOUBLE DEFAULT NULL
);

-- INSERT INTO billionaires (first_name, last_name, career) VALUES
--   ('Aliko', 'Dangote', 'Billionaire Industrialist'),
--   ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
--   ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');
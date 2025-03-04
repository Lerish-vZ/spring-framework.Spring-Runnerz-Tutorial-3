DROP TABLE IF EXISTS Run;

CREATE TABLE IF NOT EXISTS Run (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title varchar(250) NOT NULL,
    started_on timestamp NOT NULL,
    completed_on timestamp NOT NULL,
    miles INT NOT NULL,
    location varchar(10) NOT NULL,
    version INT
);
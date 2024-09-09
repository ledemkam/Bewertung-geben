CREATE DATABASE BEWERTUNG;

CREATE TABLE KUNDE(
                      ID  integer PRIMARY KEY not null AUTO_INCREMENT,
                      Email varchar(50) UNIQUE
);

CREATE TABLE GEFÜHL(
                       ID integer PRIMARY KEY not null AUTO_INCREMENT,
                       TEXT varchar(50),
                       TYPE varchar(50),
                       KUNDE_ID integer,
                       CONSTRAINT GEFÜHL_FK FOREIGN KEY (KUNDE_ID) REFERENCES KUNDE(ID)
);


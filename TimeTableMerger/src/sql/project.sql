drop table user;
drop table time;
drop table day;
drop table timetable;


CREATE TABLE User (
UserName varchar(255) NOT NULL,
Password varchar(255) NOT NULL,
FirstName varchar(255) NOT NULL,
LastName varchar(255) NOT NULL,
Email varchar(255) NOT NULL,

PRIMARY KEY (UserName),
);



CREATE TABLE Day (
UserName varchar(255) NOT NULL,
DayName varchar(20) NOT NULL,
eightAM varchar(5) NOT NULL,
nineAM varchar(5) NOT NULL,
tenAM varchar(5) NOT NULL,
elevenAM varchar(5) NOT NULL,
twelvePM varchar(5) NOT NULL,
onePM varchar(5) NOT NULL,
twoPM varchar(5) NOT NULL,
threePM varchar(5) NOT NULL,
fourPM varchar(5) NOT NULL,
fivePM varchar(5) NOT NULL,
sixPM varchar(5) NOT NULL,
sevenPM varchar(5) NOT NULL,
eightPM varchar(5) NOT NULL,
ninePM varchar(5) NOT NULL,

PRIMARY KEY (UserName, DayName),
FOREIGN KEY (UserName) REFERENCES User(UserName),
);

CREATE TABLE User (
UserName varchar(255) NOT NULL,
Password varchar(255) NOT NULL,
FirstName varchar(255) NOT NULL,
LastName varchar(255) NOT NULL,
Email varchar(255) NOT NULL,

PRIMARY KEY (UserName),
);



CREATE TABLE Time (
Hour varchar(10) NOT NULL,

PRIMARY KEY (Hour),
);



CREATE TABLE Day (
DayName varchar(20) NOT NULL,
Hour varchar(10) NOT NULL, 

PRIMARY KEY (DayName, Hour),
FOREIGN KEY (Hour) References Time(Hour),
);



CREATE TABLE Timetable (
UserName varchar(255) NOT NULL,
DayName varchar(20) NOT NULL,
Hour varchar(10) NOT NULL,
Available varchar(1),

PRIMARY KEY (UserName, DayName, Hour),
FOREIGN KEY (UserName) References User(UserName),
FOREIGN KEY (DayName, Hour) References Day(DayName, Hour),
);
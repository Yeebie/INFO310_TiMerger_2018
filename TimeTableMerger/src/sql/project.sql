/**
 * project.sql
 * The Timetable Merger's schema.
 * Author:  duecl801
 * Created: 13/04/2018
 */

drop all objects;

create table User (
	UserName varchar(255) NOT NULL,
	Password varchar(255) NOT NULL,
	FirstName varchar(255) NOT NULL,
	LastName varchar(255) NOT NULL,
	Email varchar(255) NOT NULL,
	primary key (UserName),
);

create table Day (
	UserName varchar(255) NOT NULL,
	DayName varchar(20) NOT NULL,
	eightAM boolean NOT NULL,
	nineAM boolean NOT NULL,
	tenAM boolean NOT NULL,
	elevenAM boolean NOT NULL,
	twelvePM boolean NOT NULL,
	onePM boolean NOT NULL,
	twoPM boolean NOT NULL,
	threePM boolean NOT NULL,
	fourPM boolean NOT NULL,
	fivePM boolean NOT NULL,
	sixPM boolean NOT NULL,
	sevenPM boolean NOT NULL,
	eightPM boolean NOT NULL,
	ninePM boolean NOT NULL,
	primary key (UserName, DayName),
	foreign key (UserName) references User(UserName),
);

/**
 * Notes:
 * False represents a free time slot
 * True represents a busy time slot
 * When re-entering the schema into H2, the schema will automatically
 * remove the old database
 * Inspect all data from database:
 * select * from user; select * from day;
 */
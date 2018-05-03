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

create table Contact (
	UserName varchar(255) NOT NULL,
	FirstName varchar(255), 
	LastName varchar(255), 
	ContactList varchar(255) NOT NULL,
	ContactFirstName varchar(255),
	ContactLastName varchar(255), 
	primary key (UserName, ContactList),
	foreign key (UserName, FirstName, LastName) references User (UserName, FirstName, LastName),
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
Do we want to save the MergedDay in the database? Is it necessary?

create table mergedDay (
	GroupName varchar(255) NOT NULL, -- Can we get a combination of userIDs? Will this be a custom groupname?
	DayName varchar(20) NOT NULL,
	eightAM boolean NOT NULL,
        eightAMDuration Integer NOT NULL,
	nineAM boolean NOT NULL,
        nineAMDuration Integer NOT NULL,
	tenAM boolean NOT NULL,
        tenAMDuration Integer NOT NULL,
	elevenAM boolean NOT NULL,
        elevenAMDuration Integer NOT NULL,
	twelvePM boolean NOT NULL,
        twelvePMDuration Integer NOT NULL,
	onePM boolean NOT NULL,
        onePMDuration Integer NOT NULL,
	twoPM boolean NOT NULL,
        twoPMDuration Integer NOT NULL,
	threePM boolean NOT NULL,
        threePMDuration Integer NOT NULL,
	fourPM boolean NOT NULL,
        fourPMDuration Integer NOT NULL,
	fivePM boolean NOT NULL,
        fivePMDuration Integer NOT NULL,
	sixPM boolean NOT NULL,
        sixPMDuration Integer NOT NULL,
	sevenPM boolean NOT NULL,
        sevenPMDuration Integer NOT NULL,
	eightPM boolean NOT NULL,
        eightPMDuration Integer NOT NULL,
	ninePM boolean NOT NULL,
        ninePMDuration Integer NOT NULL,
	primary key (UserName, DayName),
	foreign key (UserName) references User(UserName),
);*/

/**
 * Notes:
 * False represents a free time slot
 * True represents a busy time slot
 * When re-entering the schema into H2, the schema will automatically
 * remove the old database
 * Inspect all data from database:
 * select * from user; select * from day;
 */
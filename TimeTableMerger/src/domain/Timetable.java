/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Yeebo
 */
public class Timetable {

    /**
     * Had an idea on how to do the timetable, but now its 1:35AM and I'm just
     * lost, Wait, wouldn't this go into a DAO or something? I'm not even sure
     * anymore. I've used true for the values so comparisons return "true, this
     * time is free" instead of "false, this time is free, which will hopefully
     * simplify things"
     */
    /**
     * Just playing around with this, feel free to undo anything I've done - Claire
     */
    
    //Ive just added this below, but am unsure at the mo as well. Will think about it on Sunday night - Celine
    private String userName;
    private String day; 
    private String hour; 
    
    public Timetable(String userName, String day, String hour) {
        this.userName = userName; 
	this.day = day; 
	this.hour = hour;	  
    }
    
    //does this need to go in the dao???
    //private Collection<Day> week = new ArrayList<>();

    /*
    private Day monday = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day tuesday = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day wednesday = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day thursday = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day friday = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day saturday = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day sunday = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    //removed second week but can add later if we have time
    //private Day monday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    //private Day tuesday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    //private Day wednesday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    //private Day thursday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    //private Day friday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    //private Day saturday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    //private Day sunday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
**/
    /*
    public User getUser() {
        return user;
    }
    
    public void setUser(){
        this.user = user;
    }
    
        public Collection<Day> getWeek() {
        return week;
    }

    public void setWeek(Collection<Day> week) {
        this.week = week;
    }*/
    
    /*
    public Day getMonday() {
        return monday;
    }

    public void setMonday(Day monday) {
        this.monday = monday;
    }

    public Day getTuesday() {
        return tuesday;
    }

    public void setTuesday(Day tuesday) {
        this.tuesday = tuesday;
    }

    public Day getWednesday() {
        return wednesday;
    }

    public void setWednesday(Day wednesday) {
        this.wednesday = wednesday;
    }

    public Day getThursday() {
        return thursday;
    }

    public void setThursday(Day thursday) {
        this.thursday = thursday;
    }

    public Day getFriday() {
        return friday;
    }

    public void setFriday(Day friday) {
        this.friday = friday;
    }

    public Day getSaturday() {
        return saturday;
    }

    public void setSaturday(Day saturday) {
        this.saturday = saturday;
    }

    public Day getSunday() {
        return sunday;
    }

    public void setSunday(Day sunday) {
        this.sunday = sunday;
    }
/*
    public Day getMonday2() {
        return monday2;
    }

    public void setMonday2(Day monday2) {
        this.monday2 = monday2;
    }

    public Day getTuesday2() {
        return tuesday2;
    }

    public void setTuesday2(Day tuesday2) {
        this.tuesday2 = tuesday2;
    }

    public Day getWednesday2() {
        return wednesday2;
    }

    public void setWednesday2(Day wednesday2) {
        this.wednesday2 = wednesday2;
    }

    public Day getThursday2() {
        return thursday2;
    }

    public void setThursday2(Day thursday2) {
        this.thursday2 = thursday2;
    }

    public Day getFriday2() {
        return friday2;
    }

    public void setFriday2(Day friday2) {
        this.friday2 = friday2;
    }

    public Day getSaturday2() {
        return saturday2;
    }

    public void setSaturday2(Day saturday2) {
        this.saturday2 = saturday2;
    }

    public Day getSunday2() {
        return sunday2;
    }

    public void setSunday2(Day sunday2) {
        this.sunday2 = sunday2;
    }
**/

    public Object getUserName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

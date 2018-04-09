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
    private Day monday1 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day tuesday1 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day wednesday1 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day thursday1 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day friday1 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day saturday1 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day sunday1 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day monday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day tuesday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day wednesday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day thursday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day friday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day saturday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private Day sunday2 = new Day(true, true, true, true, true, true, true, true, true, true, true, true, true, true);

    public Day getMonday1() {
        return monday1;
    }

    public void setMonday1(Day monday1) {
        this.monday1 = monday1;
    }

    public Day getTuesday1() {
        return tuesday1;
    }

    public void setTuesday1(Day tuesday1) {
        this.tuesday1 = tuesday1;
    }

    public Day getWednesday1() {
        return wednesday1;
    }

    public void setWednesday1(Day wednesday1) {
        this.wednesday1 = wednesday1;
    }

    public Day getThursday1() {
        return thursday1;
    }

    public void setThursday1(Day thursday1) {
        this.thursday1 = thursday1;
    }

    public Day getFriday1() {
        return friday1;
    }

    public void setFriday1(Day friday1) {
        this.friday1 = friday1;
    }

    public Day getSaturday1() {
        return saturday1;
    }

    public void setSaturday1(Day saturday1) {
        this.saturday1 = saturday1;
    }

    public Day getSunday1() {
        return sunday1;
    }

    public void setSunday1(Day sunday1) {
        this.sunday1 = sunday1;
    }

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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Yeebo
 */
public class Day implements Comparable<Day> {

    private String userName;
    private String dayName;

    private Boolean eightAM;
    private Boolean nineAM;
    private Boolean tenAM;
    private Boolean elevenAM;
    private Boolean twelvePM;
    private Boolean onePM;
    private Boolean twoPM;
    private Boolean threePM;
    private Boolean fourPM;
    private Boolean fivePM;
    private Boolean sixPM;
    private Boolean sevenPM;
    private Boolean eightPM;
    private Boolean ninePM;

    public Day() {

    }

    public Day(String userName, String dayName) {
        this.userName = userName;
        this.dayName = dayName;
        this.eightAM = false;
        this.nineAM = false;
        this.tenAM = false;
        this.elevenAM = false;
        this.twelvePM = false;
        this.onePM = false;
        this.twoPM = false;
        this.threePM = false;
        this.fourPM = false;
        this.fivePM = false;
        this.sixPM = false;
        this.sevenPM = false;
        this.eightPM = false;
        this.ninePM = false;
    }

    private ArrayList<Boolean> dayTime = new ArrayList<Boolean>();

    public Day(String userName, String dayName, Boolean eightAM, Boolean nineAM, Boolean tenAM, Boolean elevenAM, Boolean twelvePM, Boolean onePM, Boolean twoPM, Boolean threePM, Boolean fourPM, Boolean fivePM, Boolean sixPM, Boolean sevenPM, Boolean eightPM, Boolean ninePM) {
        this.userName = userName;
        this.dayName = dayName;
        this.eightAM = eightAM;
        this.nineAM = nineAM;
        this.tenAM = tenAM;
        this.elevenAM = elevenAM;
        this.twelvePM = twelvePM;
        this.onePM = onePM;
        this.twoPM = twoPM;
        this.threePM = threePM;
        this.fourPM = fourPM;
        this.fivePM = fivePM;
        this.sixPM = sixPM;
        this.sevenPM = sevenPM;
        this.eightPM = eightPM;
        this.ninePM = ninePM;
    }

    public Day(String userName, String dayName, ArrayList<Boolean> dayArray) {
        this.userName = userName;
        this.dayName = dayName;
        this.dayTime = dayArray;
        this.eightAM = this.dayTime.get(0);
        this.nineAM = this.dayTime.get(1);
        this.tenAM = this.dayTime.get(2);
        this.elevenAM = this.dayTime.get(3);
        this.twelvePM = this.dayTime.get(4);
        this.onePM = this.dayTime.get(5);
        this.twoPM = this.dayTime.get(6);
        this.threePM = this.dayTime.get(7);
        this.fourPM = this.dayTime.get(8);
        this.fivePM = this.dayTime.get(9);
        this.sixPM = this.dayTime.get(10);
        this.sevenPM = this.dayTime.get(11);
        this.eightPM = this.dayTime.get(12);
        this.ninePM = this.dayTime.get(13);

    }

    public void SetArrayList(ArrayList<Boolean> dayArray) {
        this.dayTime = dayArray;
        this.eightAM = this.dayTime.get(0);
        this.nineAM = this.dayTime.get(1);
        this.tenAM = this.dayTime.get(2);
        this.elevenAM = this.dayTime.get(3);
        this.twelvePM = this.dayTime.get(4);
        this.onePM = this.dayTime.get(5);
        this.twoPM = this.dayTime.get(6);
        this.threePM = this.dayTime.get(7);
        this.fourPM = this.dayTime.get(8);
        this.fivePM = this.dayTime.get(9);
        this.sixPM = this.dayTime.get(10);
        this.sevenPM = this.dayTime.get(11);
        this.eightPM = this.dayTime.get(12);
        this.ninePM = this.dayTime.get(13);

    }

    public String getUserName() {
        return userName;
    }

    public void setUser(String userName) {
        this.userName = userName;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public Boolean getEightAM() {
        return eightAM;
    }

    public void setEightAM(Boolean eightAM) {
        this.eightAM = eightAM;
    }

    public Boolean getNineAM() {
        return nineAM;
    }

    public void setNineAM(Boolean nineAM) {
        this.nineAM = nineAM;
    }

    public Boolean getTenAM() {
        return tenAM;
    }

    public void setTenAM(Boolean tenAM) {
        this.tenAM = tenAM;
    }

    public Boolean getElevenAM() {
        return elevenAM;
    }

    public void setElevenAM(Boolean elevenAM) {
        this.elevenAM = elevenAM;
    }

    public Boolean getTwelvePM() {
        return twelvePM;
    }

    public void setTwelvePM(Boolean twelvePM) {
        this.twelvePM = twelvePM;
    }

    public Boolean getOnePM() {
        return onePM;
    }

    public void setOnePM(Boolean onePM) {
        this.onePM = onePM;
    }

    public Boolean getTwoPM() {
        return twoPM;
    }

    public void setTwoPM(Boolean twoPM) {
        this.twoPM = twoPM;
    }

    public Boolean getThreePM() {
        return threePM;
    }

    public void setThreePM(Boolean threePM) {
        this.threePM = threePM;
    }

    public Boolean getFourPM() {
        return fourPM;
    }

    public void setFourPM(Boolean fourPM) {
        this.fourPM = fourPM;
    }

    public Boolean getFivePM() {
        return fivePM;
    }

    public void setFivePM(Boolean fivePM) {
        this.fivePM = fivePM;
    }

    public Boolean getSixPM() {
        return sixPM;
    }

    public void setSixPM(Boolean sixPM) {
        this.sixPM = sixPM;
    }

    public Boolean getSevenPM() {
        return sevenPM;
    }

    public void setSevenPM(Boolean sevenPM) {
        this.sevenPM = sevenPM;
    }

    public Boolean getEightPM() {
        return eightPM;
    }

    public void setEightPM(Boolean eightPM) {
        this.eightPM = eightPM;
    }

    public Boolean getNinePM() {
        return ninePM;
    }

    public void setNinePM(Boolean ninePM) {
        this.ninePM = ninePM;
    }

    @Override
    public String toString() {
        return "Day{" + "userName=" + userName + ", dayName=" + dayName + ", eightAM=" + eightAM + ", nineAM=" + nineAM + ", tenAM=" + tenAM + ", elevenAM=" + elevenAM + ", twelvePM=" + twelvePM + ", onePM=" + onePM + ", twoPM=" + twoPM + ", threePM=" + threePM + ", fourPM=" + fourPM + ", fivePM=" + fivePM + ", sixPM=" + sixPM + ", sevenPM=" + sevenPM + ", eightPM=" + eightPM + ", ninePM=" + ninePM + '}';
    }
    public int compareTo(Day day) {
		String myday = this.getUserName();
		String theirday = day.getUserName();
		return myday.compareTo(theirday);
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.userName);
        hash = 17 * hash + Objects.hashCode(this.dayName);
        hash = 17 * hash + Objects.hashCode(this.eightAM);
        hash = 17 * hash + Objects.hashCode(this.nineAM);
        hash = 17 * hash + Objects.hashCode(this.tenAM);
        hash = 17 * hash + Objects.hashCode(this.elevenAM);
        hash = 17 * hash + Objects.hashCode(this.twelvePM);
        hash = 17 * hash + Objects.hashCode(this.onePM);
        hash = 17 * hash + Objects.hashCode(this.twoPM);
        hash = 17 * hash + Objects.hashCode(this.threePM);
        hash = 17 * hash + Objects.hashCode(this.fourPM);
        hash = 17 * hash + Objects.hashCode(this.fivePM);
        hash = 17 * hash + Objects.hashCode(this.sixPM);
        hash = 17 * hash + Objects.hashCode(this.sevenPM);
        hash = 17 * hash + Objects.hashCode(this.eightPM);
        hash = 17 * hash + Objects.hashCode(this.ninePM);
        hash = 17 * hash + Objects.hashCode(this.dayTime);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Day other = (Day) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.dayName, other.dayName)) {
            return false;
        }
        if (!Objects.equals(this.eightAM, other.eightAM)) {
            return false;
        }
        if (!Objects.equals(this.nineAM, other.nineAM)) {
            return false;
        }
        if (!Objects.equals(this.tenAM, other.tenAM)) {
            return false;
        }
        if (!Objects.equals(this.elevenAM, other.elevenAM)) {
            return false;
        }
        if (!Objects.equals(this.twelvePM, other.twelvePM)) {
            return false;
        }
        if (!Objects.equals(this.onePM, other.onePM)) {
            return false;
        }
        if (!Objects.equals(this.twoPM, other.twoPM)) {
            return false;
        }
        if (!Objects.equals(this.threePM, other.threePM)) {
            return false;
        }
        if (!Objects.equals(this.fourPM, other.fourPM)) {
            return false;
        }
        if (!Objects.equals(this.fivePM, other.fivePM)) {
            return false;
        }
        if (!Objects.equals(this.sixPM, other.sixPM)) {
            return false;
        }
        if (!Objects.equals(this.sevenPM, other.sevenPM)) {
            return false;
        }
        if (!Objects.equals(this.eightPM, other.eightPM)) {
            return false;
        }
        if (!Objects.equals(this.ninePM, other.ninePM)) {
            return false;
        }
        if (!Objects.equals(this.dayTime, other.dayTime)) {
            return false;
        }
        return true;
    }
    
}

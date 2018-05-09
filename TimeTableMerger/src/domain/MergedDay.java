/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 * Used to store the merged Timetable days
 *
 * @author Yeebo
 */
public class MergedDay extends Day {

    private String groupName;
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
    private Integer eightAMDuration;
    private Integer nineAMDuration;
    private Integer tenAMDuration;
    private Integer elevenAMDuration;
    private Integer twelvePMDuration;
    private Integer onePMDuration;
    private Integer twoPMDuration;
    private Integer threePMDuration;
    private Integer fourPMDuration;
    private Integer fivePMDuration;
    private Integer sixPMDuration;
    private Integer sevenPMDuration;
    private Integer eightPMDuration;
    private Integer ninePMDuration;

    public MergedDay() {

    }

    public MergedDay(String groupName, String dayName) {
        super(groupName, dayName);
        this.eightAMDuration = null;
        this.nineAMDuration = null;
        this.tenAMDuration = null;
        this.elevenAMDuration = null;
        this.twelvePMDuration = null;
        this.onePMDuration = null;
        this.twoPMDuration = null;
        this.threePMDuration = null;
        this.fourPMDuration = null;
        this.fivePMDuration = null;
        this.sixPMDuration = null;
        this.sevenPMDuration = null;
        this.eightPMDuration = null;
        this.ninePMDuration = null;
    }

    public MergedDay(String groupName, String dayName, Boolean eightAM, Boolean nineAM, Boolean tenAM, Boolean elevenAM, Boolean twelvePM, Boolean onePM, Boolean twoPM, Boolean threePM, Boolean fourPM, Boolean fivePM, Boolean sixPM, Boolean sevenPM, Boolean eightPM, Boolean ninePM) {
        super(groupName, dayName, eightAM, nineAM, tenAM, elevenAM, twelvePM, onePM, twoPM, threePM, fourPM, fivePM, sixPM, sevenPM, eightPM, ninePM);
        this.eightAMDuration = null;
        this.nineAMDuration = null;
        this.tenAMDuration = null;
        this.elevenAMDuration = null;
        this.twelvePMDuration = null;
        this.onePMDuration = null;
        this.twoPMDuration = null;
        this.threePMDuration = null;
        this.fourPMDuration = null;
        this.fivePMDuration = null;
        this.sixPMDuration = null;
        this.sevenPMDuration = null;
        this.eightPMDuration = null;
        this.ninePMDuration = null;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getEightAMDuration() {
        return eightAMDuration;
    }

    public Integer getNineAMDuration() {
        return nineAMDuration;
    }

    public Integer getTenAMDuration() {
        return tenAMDuration;
    }

    public Integer getElevenAMDuration() {
        return elevenAMDuration;
    }

    public Integer getTwelvePMDuration() {
        return twelvePMDuration;
    }

    public Integer getOnePMDuration() {
        return onePMDuration;
    }

    public Integer getTwoPMDuration() {
        return twoPMDuration;
    }

    public Integer getThreePMDuration() {
        return threePMDuration;
    }

    public Integer getFourPMDuration() {
        return fourPMDuration;
    }

    public Integer getFivePMDuration() {
        return fivePMDuration;
    }

    public Integer getSixPMDuration() {
        return sixPMDuration;
    }

    public Integer getSevenPMDuration() {
        return sevenPMDuration;
    }

    public Integer getEightPMDuration() {
        return eightPMDuration;
    }

    public Integer getNinePMDuration() {
        return ninePMDuration;
    }

    public void setEightAMDuration(Integer eightAMDuration) {
        this.eightAMDuration = eightAMDuration;
    }

    public void setNineAMDuration(Integer nineAMDuration) {
        this.nineAMDuration = nineAMDuration;
    }

    public void setTenAMDuration(Integer tenAMDuration) {
        this.tenAMDuration = tenAMDuration;
    }

    public void setElevenAMDuration(Integer elevenAMDuration) {
        this.elevenAMDuration = elevenAMDuration;
    }

    public void setTwelvePMDuration(Integer twelvePMDuration) {
        this.twelvePMDuration = twelvePMDuration;
    }

    public void setOnePMDuration(Integer onePMDuration) {
        this.onePMDuration = onePMDuration;
    }

    public void setTwoPMDuration(Integer twoPMDuration) {
        this.twoPMDuration = twoPMDuration;
    }

    public void setThreePMDuration(Integer threePMDuration) {
        this.threePMDuration = threePMDuration;
    }

    public void setFourPMDuration(Integer fourPMDuration) {
        this.fourPMDuration = fourPMDuration;
    }

    public void setFivePMDuration(Integer fivePMDuration) {
        this.fivePMDuration = fivePMDuration;
    }

    public void setSixPMDuration(Integer sixPMDuration) {
        this.sixPMDuration = sixPMDuration;
    }

    public void setSevenPMDuration(Integer sevenPMDuration) {
        this.sevenPMDuration = sevenPMDuration;
    }

    public void setEightPMDuration(Integer eightPMDuration) {
        this.eightPMDuration = eightPMDuration;
    }

    public void setNinePMDuration(Integer ninePMDuration) {
        this.ninePMDuration = ninePMDuration;
    }

    public void setDuration(Integer hour, Integer timeDuration) {
        hour = timeDuration;
    }

}

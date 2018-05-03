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
public class MergedDay {

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
		this.groupName = groupName;
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
		this.groupName = groupName;
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

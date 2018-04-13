/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Yeebo
 */
public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    
    private Timetable timetable;

    /**
     * This constructor probably won't be used, but I'm adding it in because the 
     * INFO202 Lecture 1 Interface example has one, this will probably be removed.
     */
    public User(String userName, String firstName, String lastName, String password, String email, Timetable timetable) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
	this.email = email;
        this.timetable = timetable;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	 
    public String getEmail(){
	return email;
	 }
	 
    public void setEmail(String email){
	this.email = email;
	 }
    
    public Timetable getTimetable(){
        return timetable;
    }
    
    public void setTimetable(){
        this.timetable = timetable;
    }
         
    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", email=" + email + '}';
    }

}

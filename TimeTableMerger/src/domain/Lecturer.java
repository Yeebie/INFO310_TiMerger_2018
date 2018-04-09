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
public class Lecturer extends User {

    public Lecturer(String userName, String firstName, String lastName, String password, String email) {
        super(userName, firstName, lastName, password, email);
    }
    
    /** Will have to figure out how the Lecturer can access all the timetables
      * Definitely related to the whole "Groups" thing, will we cut this feature out?
      */
    
}

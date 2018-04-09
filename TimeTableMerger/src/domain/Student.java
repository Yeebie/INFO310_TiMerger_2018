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
public class Student extends User {

    private String email;
//not sure if this class and the lecturer class are needed. I've added the email field into the user class and also 
//into the user table in the database	 
    public Student(String userName, String firstName, String lastName, String password, String email) {
        super(userName, firstName, lastName, password, email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "email=" + email + '}';
    }

}

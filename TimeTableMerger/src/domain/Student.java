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

    public Student(String userName, String firstName, String lastName, String password, String email) {
        super(userName, firstName, lastName, password);
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

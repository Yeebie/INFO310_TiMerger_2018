/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Collection;
import net.sf.oval.constraint.Email;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

/**
 *
 * @author Yeebo
 */
public class User {

	@NotNull(message = "User Name must be provided.")
	@NotBlank(message = "User Name must be provided.")
	@Length(min = 5, message = "User Name must contain at least 5 characters.")
	private String userName;
	@NotNull(message = "Name must be provided.")
	@NotBlank(message = "Name must be provided.")
	@Length(min = 2, message = "Name must contain at least 2 characters.")
	private String firstName;
	@NotNull(message = "Name must be provided.")
	@NotBlank(message = "Name must be provided.")
	@Length(min = 2, message = "Name must contain at least 2 characters.")
	private String lastName;
	@NotNull(message = "Password must be provided.")
	@NotBlank(message = "Password must be provided.")
	@Length(min = 2, message = "Password must contain at least 2 characters.")
	private String password;
	@NotNull(message = "Email address must be provided.")
	@NotBlank(message = "Email address must be provided.")
	@Email(message = "Please provide a valid email address.")
	private String email;

	//a user doesn't need to have a timetable, just an array of seven days - Claire
	private static Collection<Day> days = new ArrayList<>();

	/**
	 * This constructor probably won't be used, but I'm adding it in because the
	 * INFO202 Lecture 1 Interface example has one, this will probably be
	 * removed.
	 */
	public User(String userName, String firstName, String lastName, String password, String email) {
		this.setUserName(userName);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPassword(password);
		this.setEmail(email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" + "userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", email=" + email + '}';
	}

}

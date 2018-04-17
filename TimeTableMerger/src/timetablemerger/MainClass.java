/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemerger;

import dao.TimetableDAO;
import dao.UserDAO;
import gui.Login;

/**
 *
 * @author Celine
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the frame instance
        UserDAO userDAO = new UserDAO();
        TimetableDAO timetableDAO = new TimetableDAO();
        Login frame = new Login(userDAO, timetableDAO);

        // centre the frame on the screen
        frame.setLocationRelativeTo(null);

        // show the frame
        frame.setVisible(true);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lk.Ijse.Loundry.controller;

import Lk.Ijse.Loundry.Model.LoginModel;
import Lk.Ijse.Loundry.db.DBConnection;
import Lk.Ijse.Loundry.view.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamidi
 */
public class LoginController {

    private Login view;
    private LoginModel model;

    public LoginController(LoginView view){
        Login login = null;
        this.view = login;
        model = new LoginModel();
    }

   

    public void checklogin(String username, String password) throws ClassNotFoundException, SQLException{
        model.setUsername(username);
        model.getlogin();
        if(password.equals(model.getPassword())){
            view.setErrorMessage("you are successfully logined");
        }
        else{
            view.setErrorMessage("Invalid username or password" );
        }
    }

    public String getAllUsername() throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
            ResultSet rst=connection.prepareStatement("SELECT username(*) FROM login").executeQuery();
            
            if (rst.next()) {
            return rst.getString(null);
        }
            return toString();
    } 
    

    public String getAllPassword() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
            ResultSet rst=connection.prepareStatement("SELECT password(*) FROM login").executeQuery();
            
            if (rst.next()) {
            return rst.getString(null);
        }
            return toString();
    }
    }

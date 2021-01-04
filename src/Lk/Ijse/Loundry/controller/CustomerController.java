/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lk.Ijse.Loundry.controller;

import Lk.Ijse.Loundry.Model.Customer;
import Lk.Ijse.Loundry.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Chamidi
 */
public class CustomerController {

    public static boolean addCustomer(Customer customer) throws Exception {
        System.out.println("customer Object" + customer);
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?)");
        pstm.setObject(1, 0);
        pstm.setObject(2, customer.getNic());
        pstm.setObject(3, customer.getName());
        pstm.setObject(4, customer.getContact());
        pstm.setObject(5, customer.getAddress());
        return pstm.executeUpdate()>0;
    }

   
}

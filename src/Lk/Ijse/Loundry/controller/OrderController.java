/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lk.Ijse.Loundry.controller;

import Lk.Ijse.Loundry.Model.Order;
import Lk.Ijse.Loundry.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Chamidi
 */
public class OrderController {

   

    public static boolean addOrder(Order order) throws ClassNotFoundException, SQLException {
       System.out.println("Order object"+order);
       Connection connection=DBConnection.getInstance().getConnection();
       PreparedStatement pstm=connection.prepareStatement("INSERT INTO orders VALUES(?,?,?,?,?,?,?,?)");
       pstm.setObject(1,0);
       pstm.setObject(2, 0);
       pstm.setObject(3,order.getStartdate());
       pstm.setObject(4,order.getEnddate());
       pstm.setObject(5,order.getWeight());
       pstm.setObject(6,order.getQty());
       pstm.setObject(7,order.getStatus());
       pstm.setObject(8,order.getItemname());
       return pstm.executeUpdate()>0;
        
    }
    
}

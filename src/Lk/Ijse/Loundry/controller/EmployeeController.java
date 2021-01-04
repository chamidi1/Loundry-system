/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lk.Ijse.Loundry.controller;

import Lk.Ijse.Loundry.Model.Employee;
import Lk.Ijse.Loundry.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Chamidi
 */
public class EmployeeController {

    public static boolean addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
        System.out.println("Employee Object" + employee);
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=connection.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?,?)");
         pstm.setObject(1, 0);
         pstm.setObject(2,employee.getNic());
         pstm.setObject(3,employee.getName());
         pstm.setObject(4,employee.getContact());
         pstm.setObject(5,employee.getAddress());
          pstm.setObject(6,employee.getGender());
        return pstm.executeUpdate()>0;
    }
    
}

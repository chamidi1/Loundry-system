/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lk.Ijse.Loundry.Model;

/**
 *
 * @author Chamidi
 */
public class Employee {
   private String nic;
   private String name;
   private int contact;
   private String address;
   private String gender;

    /**
     * @return the nic
     */
   
   
   
    public Employee() {
    }

    public Employee(String nic, String name, int contact, String address, String gender) {
        this.nic = nic;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.gender = gender;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" + "nic=" + nic + ", name=" + name + ", contact=" + contact + ", address=" + address + ", gender=" + gender + '}';
    }

     
    
}

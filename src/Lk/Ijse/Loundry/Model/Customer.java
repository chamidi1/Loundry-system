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
public class Customer {
    private String name;
    private String nic;
    private String address;
    private int contact;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", nic=" + nic + ", address=" + address + ", contact=" + contact + '}';
    }

    public Customer(String name, String nic, String address, int contact) {
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.contact = contact;
    }

   
  

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}

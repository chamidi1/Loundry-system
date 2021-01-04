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
public class Order {
    private String startdate;
    private String enddate;
    private String weight;
    private int qty;
    private String status;
    private String itemname;

    /**
     * @return the startdate
     */

    public Order(){
        
    }

    @Override
    public String toString() {
        return "Order{" + "startdate=" + startdate + ",enddate=" + enddate + ", weight=" +  weight + ", qty=" + qty +",status"+status +",itemname"+itemname+'}';
    }
    
    
    public Order(String startdate, String enddate, String weight, int qty, String status, String itemname) {
        this.startdate = startdate;
        this.enddate = enddate;
        this.weight = weight;
        this.qty = qty;
        this.status = status;
        this.itemname = itemname;
    }

    public String getStartdate() {
        return startdate;
    }

    /**
     * @param startdate the startdate to set
     */
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    /**
     * @return the enddate
     */
    public String getEnddate() {
        return enddate;
    }

    /**
     * @param enddate the enddate to set
     */
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the itemname
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * @param itemname the itemname to set
     */
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxapp;

/**
 *
 * @author Irina
 */
public class Datorie implements InterfaceDatorie {
    private double amount;
    private String details;
    private String date;
    private String tip;

    public Datorie(double amount, String details, String date, String tip) {
        this.amount = amount;
        this.details = details;
        this.date = date;
        this.tip = tip;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getTip() {
        return tip;
    }
    
    

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public boolean hasThisType(String tip) {
        return this.tip.equals(tip);
    }
    
   
    
}

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
public class Tax implements InterfaceTax {
    private String date;
    private Double amount;
    private String tip;

    public Tax(String date, Double amount, String tip) {
        this.date = date;
        this.amount = amount;
        this.tip = tip;
    }
    @Override
    public String getDate() {
        return date;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getTip() {
        return tip;
    }
        
    
    
    @Override
    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void setTip(String tip) {
        this.tip = tip;
    }
    
    
    
}

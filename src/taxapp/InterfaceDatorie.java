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
public interface InterfaceDatorie {
    public String getDate();
    public String getDetails();
    public double getAmount();
    public String getTip();
    
    public void setDate (String date);
    public void setDetails (String details);
    public void setAmount (double amount);
    public void setTip (String tip);
    
    public boolean hasThisType(String tip);
    
}

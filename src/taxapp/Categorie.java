/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxapp;

import java.util.List;

/**
 *
 * @author Irina
 */
public class Categorie implements InterfaceCategorie {
    String tip;
    double total;

    public Categorie(String tip) {
        this.tip = tip;
        this.total = 0;
    }

    @Override
    public String getTip() {
        return tip;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void setTotal(double total) {
        this.total = total;
    }
    
    public void updateTotal(List <InterfaceDatorie> ilista) {
        for( InterfaceDatorie i : ilista ) {
            if (i.hasThisType(tip)) {
                total += i.getAmount();
            }
        }
              
                
                
    }
}

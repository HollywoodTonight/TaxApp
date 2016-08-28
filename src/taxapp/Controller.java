/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irina
 */
public class Controller {
    
    List <InterfaceTax> tudTaxList = new ArrayList<>();
    List <InterfaceTax> iuliaTaxList = new ArrayList<>();
    
    List <InterfaceCategorie> listaCategorii;
    List <InterfaceDatorie> listaDatorii;
    
    Person Tud;
    Person Iulia;
    
    MenuGUI meniu;
    DatoriiGUI datoriimeniu;
    
    public Controller (Person Tud, Person Iulia){
        this.Tud = Tud;
        this.Iulia = Iulia;
    }

    void showDatoriiGUI() {
       datoriimeniu.setComboBox(Tud, Iulia);
       setUser();
       //datoriimeniu.updateListaDatorii(listaDatorii);
       
       datoriimeniu.setVisible(true);
       meniu.setVisible(false);
    }

    public void setMeniu(MenuGUI meniu) {
        this.meniu = meniu;
    }

    public void setDatoriimeniu(DatoriiGUI datoriimeniu) {
        this.datoriimeniu = datoriimeniu;
    }
    
    public void setUser() {
        listaDatorii = datoriimeniu.getUser().getDatorieList();
    }

}

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
public class TaxApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person Iulia = new Person ("Iulia" ,null,null);
        Person Tud = new Person ("Tud",null,null);
        
        Controller controller = new Controller(Iulia, Tud);
        
        MenuGUI meniuGUI = new MenuGUI(controller);
        DatoriiGUI datoriiGUI = new DatoriiGUI(controller);
        
        controller.setDatoriimeniu(datoriiGUI);
        controller.setMeniu(meniuGUI);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                meniuGUI.setVisible(true);
            }
        });
    }
    
}

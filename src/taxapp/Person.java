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
public class Person {
	
	List<InterfaceTax> taxList = new ArrayList<>();
        List<InterfaceDatorie> datorieList = new ArrayList<>();
        String nume;

    public Person(String nume,List<InterfaceDatorie> datorieList, List<InterfaceTax> taxList) {
        this.taxList = taxList;
        this.datorieList = datorieList;
        this.nume = nume;
    }
	
	public void addTax(InterfaceTax d){
		taxList.add(d);
	}
        
        public void addDatorie(InterfaceDatorie d){
            datorieList.add(d);
        }
        
        public void removeDatorie(InterfaceDatorie d){
            datorieList.remove(d);
        }
	
	public void removeTax(InterfaceTax d){
		taxList.remove(d);
	}

    public void setTaxList(List<InterfaceTax> taxList) {
        this.taxList = taxList;
    }

    public void setDatorieList(List<InterfaceDatorie> datorieList) {
        this.datorieList = datorieList;
    }

    public List<InterfaceTax> getTaxList() {
        return taxList;
    }

    public List<InterfaceDatorie> getDatorieList() {
        return datorieList;
    }

    @Override
    public String toString() {
        return nume;
    }

}

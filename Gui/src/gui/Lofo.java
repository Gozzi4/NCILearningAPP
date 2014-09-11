/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;

/**
 *
 * @author Ian
 */
public class Lofo implements Serializable{
      //data members
      protected  String Number;
      protected  String Name;
      
    // Constuctor
    public Lofo(String Name, String Number) {
        this.Name = Name;
        this.Number = Number;
    }
   
      
    
     //Get  methods
    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }
   
    
    
    //Set methods
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    
     public String getDetails(){
        return "Employee Name: "+Name+"\nEmployee Id:"+Number;
    }
    
}
    


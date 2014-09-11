/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x12112348
 */
public class QResults implements Serializable {
     //Creating the ArrayList
    ArrayList<QResults> QList;
    
    //Data Members
    private String Answer1, Answer2, Answer3, Answer4;
    int QCount;
    
    
    public QResults(){
    
 
    
    }
    
    
    

    public String getAnswer1() {
        return Answer1;
    }

    public void setAnswer1(String Answer1) {
        this.Answer1 = Answer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(String Answer2) {
        this.Answer2 = Answer2;
    }

    public String getAnswer3() {
        return Answer3;
    }

    public void setAnswer3(String Answer3) {
        this.Answer3 = Answer3;
    }

    public String getAnswer4() {
        return Answer4;
    }

    public void setAnswer4(String Answer4) {
        this.Answer4 = Answer4;
    }
    
}

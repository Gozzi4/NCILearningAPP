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
public class Contac extends Lofo implements Serializable {

    public Contac(String Comment, String Subject, String Name, String Number) {
        super(Name, Number);
        this.Comment = Comment;
        this.Subject = Subject;
    }

  
  
       String Comment,Subject,Name,Number;
      
      
    
    public void setComments(String Comments) {
        this.Comment = Comments;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getComments() {
        return Comment;
    }

    public String getSubject() {
        return Subject;
    }

    
}

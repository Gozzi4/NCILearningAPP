/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;

/**
 *
 * @author x12317886
 */
public class Details extends Lofo implements Serializable{
    String StudentMail;
    String StaffMail;
    String Comment;

    public Details(String StudentMail, String StaffMail, String Comment, String Name, String Number) {
        super(Name, Number);
        this.StudentMail = StudentMail;
        this.StaffMail = StaffMail;
        this.Comment = Comment;
    }

    
    
    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    


    public String getStaffMail() {
        return StaffMail;
    }

    public void setStaffMail(String StaffMail) {
        this.StaffMail = StaffMail;
    }

    public String getStudentMail() {
        return StudentMail;
    }

    public void setStudentMail(String StudentMail) {
        this.StudentMail = StudentMail;
    }
}

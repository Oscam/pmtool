/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Mugusca
 */
public class user implements Serializable{
    
    private String fname ;
    private String surname;
    private String staffId;
   // private int age;
    //private Timestamp dob;
    private String usertype;
    private String status;
    private String gender;
    private Date dob;
    private int user_id;
    private String email;
    
    public user(){
        
    }
    
    public user(int user_id,String fname,String surname,Date dob,String staffId,String email,String gender,String usertype,String status){
        this.fname = fname;
        this.surname = surname;
        this.dob =dob;
        this.staffId=staffId;
        this.email = email;
        this.usertype =usertype;
        this.status=status;
        this.gender=gender;
        this.user_id=user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSurname() {
        return surname;
    }

   

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

  
    

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    
}

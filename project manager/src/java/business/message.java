/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.sql.Timestamp;

/**
 *
 * @author Mugusca
 */
public class message {

    private String meso;
    private int pid;
    private int messageId;
    private String staffId;//added this so as to try and query the chats table to get the correct view using css
    private String fname;
   // private String messageby;
    private Timestamp messageTime;
    

    public message(int messageId, int pid,String meso,String staffId ) {
        this.meso = meso;
        this.pid = pid;
        this.messageId = messageId;
        this.staffId=staffId;
        //this.messageTime=messageTime;
        
    }

    

    public message() {
    }

    public String getMeso() {
        return meso;
    }

    public void setMeso(String meso) {
        this.meso = meso;
    }

    
    public int getMessageId() {
        return messageId;
    }

    
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Timestamp getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Timestamp messageTime) {
        this.messageTime = messageTime;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

}

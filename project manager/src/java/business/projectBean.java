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
public class projectBean implements Serializable {
    private String projectName;
    private Date startDate;
    private Date endDate;
    private String staffId;
    private int projectId;
    private String fname;
    //private String costs;
    //private String projectBudget;

    public projectBean(String projectName, Date startDate, Date endDate, String staffId, int projectId, String fname) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.staffId = staffId;
        this.projectId = projectId;
        this.fname = fname;
    }

    public projectBean() {
    }
    
    
    

    public projectBean(int projectId,String projectName, Date startDate, Date endDate, String staffId) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.staffId = staffId;
      //  this.costs = costs;
        //this.projectBudget = projectBudget;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setstaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
   
}

package com.employee;
// Generated Sep 26, 2016 7:15:10 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SecondaryInformation generated by hbm2java
 */
public class SecondaryInformation  implements java.io.Serializable {


     private int id;
     private PrimaryInformation primaryInformation;
     private String ljtitle;
     private String cname;
     private Date startdate;
     private Date enddate;
     private String district;
     private String country;

    public SecondaryInformation() {
    }

	
    public SecondaryInformation(int id) {
        this.id = id;
    }
    public SecondaryInformation(int id, PrimaryInformation primaryInformation, String ljtitle, String cname, Date startdate, Date enddate, String district, String country) {
       this.id = id;
       this.primaryInformation = primaryInformation;
       this.ljtitle = ljtitle;
       this.cname = cname;
       this.startdate = startdate;
       this.enddate = enddate;
       this.district = district;
       this.country = country;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public PrimaryInformation getPrimaryInformation() {
        return this.primaryInformation;
    }
    
    public void setPrimaryInformation(PrimaryInformation primaryInformation) {
        this.primaryInformation = primaryInformation;
    }
    public String getLjtitle() {
        return this.ljtitle;
    }
    
    public void setLjtitle(String ljtitle) {
        this.ljtitle = ljtitle;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    public Date getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }




}



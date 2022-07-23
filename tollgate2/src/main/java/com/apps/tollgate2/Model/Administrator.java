package com.apps.tollgate2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ADMINISTRATOR")
public class administrator {

    @Id
    @Column(name = "ADMINISTRATOR_ID")
    private Long administratorId;
    @Column(name = "ADMINISTRATOR_NAME")
    private String administratorName;
    @Column(name = "PASS_WORD")
    private String passWord;


    public administrator(Long administratorId, String administratorName, String passWord) {
        this.administratorId = administratorId;
        this.administratorName = administratorName;
        this.passWord = passWord;
    }


    public void Administrator(){


    }

    public Long getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Long administratorId) {
        this.administratorId = administratorId;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "administrator{" +
                "administratorId=" + administratorId +
                ", administratorName='" + administratorName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}




package com.apps.tollgate2.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Toll Attendant")
public class Tollattendant {
         @Id
         @Column(name = "ATTENDANT_ID")
         private Long attendantId;
         @ManyToOne
         @JoinColumn(name = "ATTENDANT_NAME")
         private String attendantName;
         @Column(name = "TOLL_NAME")
         private String tollName;
         @Column(name = "PASS_WORD")
         private String passWord;

    public Tollattendant(Long attendantId, String attendantName, String tollName, String passWord) {
        this.attendantId = attendantId;
        this.attendantName = attendantName;
        this.tollName = tollName;
        this.passWord = passWord;
    }

    public Tollattendant(){

    }

    public Long getAttendantId() {
        return attendantId;
    }

    public void setAttendantId(Long attendantId) {
        this.attendantId = attendantId;
    }

    public String getAttendantName() {
        return attendantName;
    }

    public void setAttendantName(String attendantName) {
        this.attendantName = attendantName;
    }

    public String getTollName() {
        return tollName;
    }

    public void setTollName(String tollName) {
        this.tollName = tollName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Tollattendant{" +
                "attendantId=" + attendantId +
                ", attendantName='" + attendantName + '\'' +
                ", tollName='" + tollName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

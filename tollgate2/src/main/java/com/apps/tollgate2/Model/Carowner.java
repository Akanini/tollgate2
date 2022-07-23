package com.apps.tollgate2.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Car Owner")
public class Carowner {


    @Id
    @Column (name ="NAME")
    private  String name;
    @Column (name = OWNER_ID)
    private Long ownerId;
    @ManyToOne
    @JoinColumn(name = "ADMINISTRATOR_ID")
    private Administrator administrator;
    @Column (name ="CAR_ID")
    private Integer carId;
    @Column (name ="BALANCE")
    private Integer balance;
    @Column (name ="PHONE_NUMBER")
    private Integer phoneNumber;
    @Column (name ="CARD_NUMBER")
    private Integer cardNumber;





    public Carowner(String name, Long ownerId, Administrator administrator, Integer carId, Integer balance, Integer phoneNumber, Integer cardNumber) {
        this.name = name;
        this.ownerId = ownerId;
        this.administrator = administrator;
        this.carId = carId;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
    }

    public Carowner() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Carowner{" +
                "name='" + name + '\'' +
                ", ownerId=" + ownerId +
                ", administrator=" + administrator +
                ", carId=" + carId +
                ", balance=" + balance +
                ", phoneNumber=" + phoneNumber +
                ", cardNumber=" + cardNumber +
                '}';
    }
}

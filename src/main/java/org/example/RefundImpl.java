package org.example;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RefundImpl {

    @Id
    private int tc_No;
    private int amount;
    private String reason;
    private String description;
    private String status;
    //boolean status;

    public RefundImpl() {
    }

    public RefundImpl(int amount, String reason, String description, String status) {
        this.amount = amount;
        this.reason = reason;
        this.description = description;
        this.status = status;

    }

    public void setTc_No(int tc_No) {
        this.tc_No = tc_No;
    }

    public int getTc_No() {
        return tc_No;
    }

    public int getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Transaction ==> |" +
                "Ticket No = " + tc_No + '\'' +
                "| |amount = '" + amount + '\'' +
                "| |description = '" + description + '\'' +
                "| |reason = '" + reason + '\'' +
                "| |status=" + status + '\'' +
                '|' ;
    }
}
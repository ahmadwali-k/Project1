package org.example;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RefundImpl implements Serializable {

    @Id
    private int tc_No;
    private int amount;
    private String reason;
    private String description;
    private String status;



    public RefundImpl() {
    }


    public RefundImpl(int tc_No, int amount, String reason, String description, String status) {
        this.tc_No = tc_No;
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
        return (

                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title> Show Transaction </title>\n" +
                        "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\"\n" +
                        "          integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">\n" +
                        "\n" +
                "</head>\n" +
                "<body style=\"background-color:LightBlue;\">\n" +
                //"<h1> Search/View Request </h1>\n" +
                "<table border='1'>\n" +
                "    <tr>\n" +
                "        <th> Ticket No </th>\n" +
                "        <th> Amount </th>\n" +
                "        <th> Reason </th>\n" +
                "        <th> Description </th>\n" +
                "        <th> Status </th>\n" +
                "        </tr>\n" +
                "    <tr>\n" +
                "        <th>\"" + tc_No + "\"</th>\n" +
                "        <th>\"" + amount + "\"</th>\n" +
                "        <th>\"" + reason + "\"</th>\n" +
                "        <th> \"" + description + "\" </th>\n" +
                "        <th>\"" + status + "\"</th>\n" +
                "    </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");


    }
}
package org.example;

import javax.persistence.*;

@Entity
//@Table(name= "Employee")
//@SecondaryTable(name = "Refund")
public class Employee {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(updatable = false, nullable = false)
    private int id;
    private String fname;
    private String lname;
    private int phone;
    private String role;
    private String addr;
    private String password;

    // amount
    //invoice

    public Employee() {}

    public Employee(int id, String fname, String lname, int phone, String role, String addr, String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.role = role;
        this.addr = addr;
        this.password = password;


    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public String getAddr() {
        return addr;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
        //return id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return (
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "    <title> Employee </title>\n" +
                        " <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\"\n" +
                        "          integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">\n" +
                        "</head>\n" +
                        "<body style= background-color:LightBlue;>\n" +
                        //"<h1> Employ </h1>\n" +
                        "<table border='1'>\n" +
                        "    <tr>\n" +
                        "        <th> ID </th>\n" +
                        "        <th> First Name </th>\n" +
                        "        <th> Last Name </th>\n" +
                        "        <th> Phone Number </th>\n" +
                        "        <th> Role </th>\n" +
                        "        <th> Address (city) </th>\n" +
                        "        <th> Password </th>\n" +
                        "        </tr>\n" +
                        "    <tr>\n" +
                        "        <th>\"" + id + "\"</th>\n" +
                        "        <th>\"" + fname + "\"</th>\n" +
                        "        <th> \"" + lname + "\" </th>\n" +
                        "        <th> \"" + phone + "\" </th>\n" +
                        "        <th> \"" + role + "\" </th>\n" +
                        "        <th> \"" + addr + "\" </th>\n" +
                        "        <th> \"" + password + "\" </th>\n" +
                        "    </tr>\n" +
                        "</table>\n" +
                        "</body>\n" +
                        "</html>");


    }
}


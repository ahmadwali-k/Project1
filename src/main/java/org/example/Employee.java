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
        return "Employee{" +
                "id=" + id +
                ",\n\t password='" + password + '\'' +
                ",\n\t firstName='" + fname + '\'' +
                ",\n\t lastName='" + lname + '\'' +
                ",\n\t role=" + role + '\'' +
                ",\n\t phone=" + phone + '\'' +
                ",\n\t address=" + addr + '\'' +
                "\n}";
    }
}


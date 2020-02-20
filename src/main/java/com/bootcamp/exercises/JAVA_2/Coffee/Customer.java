package com.bootcamp.exercises.JAVA_2.Coffee;

public class Customer {
    private String cname;
    private double cphone;
    private int ctnum;

    Customer(String cname, double cphone) {
        this.cname = cname;
        this.cphone = cphone;
    }

    public String getName() {
        return cname;
    }

    public void setName(String cname) {
        this.cname = cname;
    }

    public double getPhone() {
        return cphone;
    }

    public void setPhone(double cphone) {
        this.cphone = cphone;
    }

    public int getTokeno() {
        return ctnum;
    }

    public void setTokeno(int ctnum) {
        this.ctnum = ctnum;
    }

    public void Order() {
//we will place order on the basis of name and phone number
    }

    public void OrderStatus(int tokeno) {
// we will checkorderstatus on the basis of tokenno given to the customer
    }


}
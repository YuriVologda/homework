package com.company.Bank;

public class Account {
    private long id;
    private Client client;
    private double balance;
    boolean money;

    public Account(long id, double balance, Client client) {
        this.id = id;
        this.balance = balance;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void addMoney(double amount) {
        balance = balance + amount;
        //balance = newBalance;

    }

    /*public void setMoney(){

    }*/

    public void withdrawMoney(double amount) {
        if (money) {
            balance = balance - amount;
        } else {
            money = false;
            System.out.println("Недостаточно средств");
        }
        // balance = newBalance;
    }

    public String returnTheName() {
        String name = client.getName();
        return name;
    }

    public int passportDataClient() {
        int passportDataClient = client.getPassportData();
        return passportDataClient;
    }

}

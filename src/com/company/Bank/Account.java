package com.company.Bank;

public class Account {
    private long id;
    private Client client;
    private double balance;

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

    public Account(long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void AddMoney(double addMoney) {
        double newBalance = balance + addMoney;
        balance = newBalance;

    }

    public void WithdrawMoney(double withdrawMoney) {
        double newBalance = balance - withdrawMoney;
        balance = newBalance;
    }

    public Client returnTheName() {
        String name = client.getName();
        return client;
    }

    public Client passportDataClient() {
        int passportDataClient = client.getPassportData();
        return client;
    }

}

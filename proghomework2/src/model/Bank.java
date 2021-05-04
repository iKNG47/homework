package model;

import java.util.ArrayList;

public class Bank {
    private ArrayList customer = new ArrayList();
   private double balance;

    public ArrayList getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void AddToCustomer(Klient klient, double balance){
        customer.add(klient);
        this.balance=balance;
    }
    public void ShowCustomer(int index){
        System.out.println(customer.get(index));

    }

    @Override
    public String toString() {
        return "Bank{" +
                "customer=" + customer +
                '}';
    }
}

package com.example.demo;

public class Klient {
    public int ID;
    public int saldo;


    public void saldo(int saldo) {
        this.saldo = saldo ;
    }
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    public Klient(int Id) {
        this.ID = ID;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

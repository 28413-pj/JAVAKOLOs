package com.example.demo;

import java.util.List;

public class Zlecenia {
    public int id;

    public Zlecenia(int id, int klient, Status status) {
        this.id = id;
        this.klient = klient;
        this.status = status;
    }

    public int klient;
    public Status status;

    public Zlecenia(int id, int saldo, ch.qos.logback.core.status.Status status) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKlient() {
        return klient;
    }

    public void setKlient(int klient) {
        this.klient = klient;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

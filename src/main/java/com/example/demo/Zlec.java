package com.example.demo;

import ch.qos.logback.core.status.Status;

import java.util.ArrayList;
import java.util.List;

public class Zlec{
    public List<Zlecenia> zlecenias;

    public Zlec(int id, int saldo, Status status) {
    }

    public void zlecenia(){
        this.zlecenias = new ArrayList<>();
    }
    public void nowezlecenia(Zlec zlecenia){
        zlecenias.add(zlecenia);
    }
}
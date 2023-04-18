package com.company;

public class Rand {
    private int id;
    private String name;
    private String adress;

    public Rand(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void Print(){
        System.out.println(getName());
    }

    public void printRecord(){
        System.out.println("this is a random person");
    }
    public boolean canSign(){
        return false;
    }
}

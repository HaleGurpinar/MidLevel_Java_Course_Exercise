package com.company;

public class Personal implements IPerson{
    public void printRecord(){
        System.out.println("this is a personal");
    }
    public boolean canSign(){
        return true;
    }
}

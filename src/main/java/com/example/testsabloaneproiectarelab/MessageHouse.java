package com.example.testsabloaneproiectarelab;

public class MessageHouse implements Element{
    private String house;
    private FormatStrat format;
    public MessageHouse(String house){
        this.house = house;
        this.format = (FormatStrat) new FormatHouse();
    }
    public void print(){
        format.render(this.house);
    }
}

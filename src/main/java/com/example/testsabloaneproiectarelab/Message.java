package com.example.testsabloaneproiectarelab;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Message implements Element{
    @JsonProperty("date")
    private Date date;
    @JsonProperty("message")
    private String message;
    @JsonProperty("house")
    private String house;

    public Message(Date date, String message, String house){
        this.date = date;
        this.message = message;
        this.house = house;
    }
    public void print(){
        MessageDate d = new MessageDate(date);
        MessageHouse h = new MessageHouse(house);
        h.print();
        d.print();
        System.out.println(message);
    }
}

package com.example.testsabloaneproiectarelab;

import java.util.ArrayList;
import java.util.Date;

public class MessageProxy implements Element{
    private Date date;
    private String message;
    private String house;
    private Message realMessage;

    public MessageProxy(Date date, String message, String house){
        this.date = date;
        this.message = message;
        this.house = house;
        this.realMessage = null;
    }
    public Message loadMessage(){
        if(realMessage == null){
            realMessage = new Message(date, message, house);
        }
        return realMessage;
    }

    public void print(){
        MessageDate d = new MessageDate(date);
        MessageHouse h = new MessageHouse(house);
        h.print();
        d.print();
        System.out.println(message);
    }
}

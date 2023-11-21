package com.example.testsabloaneproiectarelab;

import java.util.Date;

public class MessageDate implements Element{
    private Date date;
    private FormatStrat format;
    public MessageDate(Date date){
        this.date = date;
        this.format = (FormatStrat) new FormatDate();
    }
    public void print(){
        format.render(String.valueOf(this.date));
    }
}

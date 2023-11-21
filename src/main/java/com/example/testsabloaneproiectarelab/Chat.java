package com.example.testsabloaneproiectarelab;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Message> messages;
    public Chat() throws IOException{
        messages  = new ObjectMapper().readValue(new URL("file:src/messages.json"), new TypeReference<List<Message>>(){});
    }
    public void loadMessages(String url) {
        System.out.print(messages);
    }
}

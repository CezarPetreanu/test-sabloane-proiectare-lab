package com.example.testsabloaneproiectarelab;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class TestSabloaneProiectareLabApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(TestSabloaneProiectareLabApplication.class, args);
        Chat chat = new Chat();
    }

}

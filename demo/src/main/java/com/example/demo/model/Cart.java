package com.example.demo.model;


import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Data
public class Cart {
    private ArrayList<Item> items;

}

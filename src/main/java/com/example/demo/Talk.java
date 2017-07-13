package com.example.demo;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


/**
 * Created by plangwerski on 05.07.17.
 */
@Entity
public class Talk {

    @Id
    @GeneratedValue
    private String id;
    private String topic;

    public String getId(){
        return id;
    }

    public String getTopic(){
        return topic;
    }

}

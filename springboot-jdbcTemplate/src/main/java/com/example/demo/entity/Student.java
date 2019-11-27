package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {


    private static final long serialVersionUID = -5845646380992789943L;
    private String sno;
    private String name;
    private String sex;
}

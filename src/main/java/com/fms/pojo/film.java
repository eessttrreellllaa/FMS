package com.fms.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class film implements Serializable {
    private Integer id;
    private String name;
    private String director;
    private String actor;
    private String type;
    private String country;
    private String language;
    private Double score;
    private String src;
    private String href;
    private String description;
}

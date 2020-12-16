package com.hang.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * teacher
 * @author 
 */
@Data
public class Teacher implements Serializable {
    private Integer id;

    private String name;

    private List<Course> courses;

    private static final long serialVersionUID = 1L;
}
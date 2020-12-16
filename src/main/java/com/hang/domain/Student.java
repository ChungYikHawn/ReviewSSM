package com.hang.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * student
 * @author 
 */
@Data
public class Student implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    private Integer classId;

    private Classes classes;

    private static final long serialVersionUID = 1L;
}
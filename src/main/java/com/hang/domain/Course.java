package com.hang.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * course
 * @author 
 */
@Data
public class Course implements Serializable {
    private Integer id;

    private String name;

    private Integer teacherId;

    private static final long serialVersionUID = 1L;
}
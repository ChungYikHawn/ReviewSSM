package com.hang.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * score
 * @author 
 */
@Data
public class Score implements Serializable {
    private Integer id;

    private Integer studentId;

    private Integer courseId;

    private Integer mark;

    private static final long serialVersionUID = 1L;
}
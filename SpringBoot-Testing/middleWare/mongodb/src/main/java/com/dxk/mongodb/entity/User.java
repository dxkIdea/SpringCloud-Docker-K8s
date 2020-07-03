package com.dxk.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/3
 * Time: 11:42
 * Description: 用户
 */
@Data
@Document(collation = "user")
public class User implements Serializable {
    @Id
    private int id;

    private String name;

    private Integer age;
}

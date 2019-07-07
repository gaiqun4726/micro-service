package com.gaiqun.cloud.microservice.pojo;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author gaiqun
 */
@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}

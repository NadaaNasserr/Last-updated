package com.example.rentingcars.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDTO {


    private Integer admin_id;

    @NotEmpty(message = "teacher name must not be empty")
    @Pattern(regexp = "[^0-9]*" , message = "name must not contain numbers")
    private String name;

    @NotNull(message = "username must be not null")

    private String username;

    @Pattern(regexp =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$" , message = "password must contain at least one number and one uppercase, lowercase letter and special character, and at least 8 or more characters")
    private String password;



    @Positive(message = "age must be number")
    @NotNull(message = "age must not be null")
    private Integer age;


    private Integer countOfCarsInspected;
    //@AssertFalse
    private Boolean isApproved;


    @NotEmpty(message = "qualification  must not be empty")
    private String qualification;


    private double bonus;
    private Integer totalCars;


    @Pattern(regexp = "^(beginner|advanced|expert)$")
    @NotEmpty(message = "level must not be empty")
    private String level;

    private Integer car_id;
}

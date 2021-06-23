package com.delivery.dto;


 import org.hibernate.validator.constraints.Length;
 import org.hibernate.validator.constraints.Range;
 import org.hibernate.validator.constraints.UniqueElements;

 import javax.validation.constraints.Email;
 import javax.validation.constraints.NotNull;
 import javax.validation.constraints.Null;


public class ClientDto {


    @Null
    private Long id;

    @Length(min = 3, max = 30)
    private String firstName;

    @Length(min = 3, max = 30)
    private String lastName;

    @UniqueElements
    @Email
    @NotNull
    private String email;

    @NotNull
    private String address;

    @Length(min = 6, max = 30)
    private Integer phone;


}

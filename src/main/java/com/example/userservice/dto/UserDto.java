package com.example.userservice.dto;


import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private  String email;
    private  String name;
    private  String pwd;

    private  String userId;
    private  String createdAt;
    private  String encryptedPwd;

    private List<ResponseOrder> orders;

}

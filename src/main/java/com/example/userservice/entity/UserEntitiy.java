package com.example.userservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DBì ìì auto_increment
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, unique = true)
    private String encryptedPwd;
}

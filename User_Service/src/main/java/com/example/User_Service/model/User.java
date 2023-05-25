package com.example.User_Service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("user")
public class User {
    @Id
    private String id;
    private String userName;
    private String userAddress;
}

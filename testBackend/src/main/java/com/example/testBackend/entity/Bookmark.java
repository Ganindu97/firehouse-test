package com.example.testBackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Bookmark {
    @Id
    private int id;
    private String name;
    private String url;
    private String description;
    private int status;
    private String expiry_date;
    private int featured;
    private int user_id;
    private String image;
    private String created_at;


}

package com.example.FitRec.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String password;
    private String gender;
    private String occasion;

    @Column(name = "style_preferences")
    private String stylePreferences;

    @Column(name = "body_type")
    private String bodyType;

    @Column(unique = true)
    private String email;
}
package com.omaryusufonalan.pgrrndsimulatorbackend.entity;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}

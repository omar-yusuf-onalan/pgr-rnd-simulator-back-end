package com.omaryusufonalan.pgrrndsimulatorbackend.entity.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin {
}

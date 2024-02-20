package com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ConstructType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Construct extends Supply {
    private String model;

    private String element;

    private boolean onEvent;

    @Enumerated(EnumType.STRING)
    private ConstructType constructType;
}

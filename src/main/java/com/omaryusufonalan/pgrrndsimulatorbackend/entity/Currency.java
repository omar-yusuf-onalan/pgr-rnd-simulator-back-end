package com.omaryusufonalan.pgrrndsimulatorbackend.entity;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Currency {
    @Id
    @GeneratedValue
    private Long id;

    private int amount;

    @Enumerated(EnumType.STRING)
    private CurrencyType type;

    @ManyToOne
    private User user;
}

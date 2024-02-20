package com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ItemType;
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
public class Item extends Supply {
    @Enumerated(EnumType.STRING)
    private ItemType itemType;
}

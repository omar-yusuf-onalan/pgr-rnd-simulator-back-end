package com.omaryusufonalan.pgrrndsimulatorbackend.entity.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("PLAYER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player extends User {
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "player", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Currency> currencies;

    public Player initializePlayerCurrencies() {
        CurrencyType[] currencyTypes = CurrencyType.values();
        Set<Currency> playerCurrencies = new HashSet<>();

        for (CurrencyType currencyType : currencyTypes) {
            playerCurrencies.add(new Currency(
                    null,
                    0,
                    currencyType,
                    this
            ));
        }

        this.setCurrencies(playerCurrencies);

        return this;
    }
}

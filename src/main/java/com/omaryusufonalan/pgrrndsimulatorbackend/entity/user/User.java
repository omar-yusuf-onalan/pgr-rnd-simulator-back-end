package com.omaryusufonalan.pgrrndsimulatorbackend.entity.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User implements UserDetails {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;
    
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Currency> currencies;

    public User initializeUserCurrencies() {
        CurrencyType[] currencyTypes = CurrencyType.values();
        Set<Currency> userCurrencies = new HashSet<>();

        for (CurrencyType currencyType : currencyTypes) {
            userCurrencies.add(new Currency(
                    null,
                    0,
                    currencyType,
                    this
            ));
        }

        this.setCurrencies(userCurrencies);

        return this;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

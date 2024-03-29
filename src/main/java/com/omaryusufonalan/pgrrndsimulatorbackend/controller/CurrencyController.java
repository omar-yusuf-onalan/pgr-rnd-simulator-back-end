package com.omaryusufonalan.pgrrndsimulatorbackend.controller;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.service.currency.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.pgrrndsimulatorbackend.config.ApplicationConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "currency")
@RequiredArgsConstructor
public class CurrencyController {
    private final CurrencyService currencyService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(currencyService.getResponseById(id), HttpStatus.OK);
    }

    @GetMapping("/only-currency/{id}")
    public ResponseEntity<?> getWithoutUserResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(currencyService.getWithoutUserResponseById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CurrencySaveRequest currencySaveRequest) {
        return new ResponseEntity<>(currencyService.create(currencySaveRequest), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody CurrencyUpdateRequest currencyUpdateRequest) {
        return new ResponseEntity<>(currencyService.update(currencyUpdateRequest.getId(), currencyUpdateRequest), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        currencyService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

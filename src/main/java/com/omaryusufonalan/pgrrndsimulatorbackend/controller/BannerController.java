package com.omaryusufonalan.pgrrndsimulatorbackend.controller;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.service.banner.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.pgrrndsimulatorbackend.config.ApplicationConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "banner")
@RequiredArgsConstructor
public class BannerController {
    private final BannerService bannerService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(bannerService.getResponseById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BannerSaveRequest bannerSaveRequest) {
        return new ResponseEntity<>(bannerService.create(bannerSaveRequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody BannerSaveRequest bannerSaveRequest) {
        return new ResponseEntity<>(bannerService.update(id, bannerSaveRequest), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        bannerService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

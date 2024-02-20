package com.omaryusufonalan.pgrrndsimulatorbackend.controller;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.service.dropdetail.DropDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.pgrrndsimulatorbackend.config.ApplicationConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "drop-detail")
@RequiredArgsConstructor
public class DropDetailController {
    private final DropDetailService dropDetailService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(dropDetailService.getResponseById(id), HttpStatus.OK);
    }

    @GetMapping("/only-drop-detail/{id}")
    public ResponseEntity<?> getWithoutBannerResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(dropDetailService.getWithoutBannerResponseById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody DropDetailRequest dropDetailRequest) {
        return new ResponseEntity<>(dropDetailService.create(dropDetailRequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody DropDetailRequest dropDetailRequest) {
        return new ResponseEntity<>(dropDetailService.update(id, dropDetailRequest), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        dropDetailService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

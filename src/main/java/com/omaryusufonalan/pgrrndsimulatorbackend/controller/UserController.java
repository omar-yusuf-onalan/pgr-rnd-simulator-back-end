package com.omaryusufonalan.pgrrndsimulatorbackend.controller;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.pgrrndsimulatorbackend.config.ApplicationConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getResponseById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody UserSaveRequest userSaveRequest) {
        return new ResponseEntity<>(userService.update(id, userSaveRequest), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

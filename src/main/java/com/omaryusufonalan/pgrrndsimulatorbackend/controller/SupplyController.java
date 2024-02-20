package com.omaryusufonalan.pgrrndsimulatorbackend.controller;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.service.supply.SupplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.pgrrndsimulatorbackend.config.ApplicationConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "supply")
@RequiredArgsConstructor
public class SupplyController {
    private final SupplyService supplyService;
    
    @GetMapping("/construct/{id}")
    public ResponseEntity<?> getConstructResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(supplyService.getConstructResponseById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        supplyService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/construct")
    public ResponseEntity<?> create(@RequestBody ConstructRequest constructRequest) {
        return new ResponseEntity<>(supplyService.create(constructRequest), HttpStatus.CREATED);
    }

    @PutMapping("/construct/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody ConstructRequest constructRequest) {
        return new ResponseEntity<>(supplyService.update(id, constructRequest), HttpStatus.ACCEPTED);
    }

    @GetMapping("/memory/{id}")
    public ResponseEntity<?> getMemoryResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(supplyService.getMemoryResponseById(id), HttpStatus.OK);
    }

    @PostMapping("/memory")
    public ResponseEntity<?> create(@RequestBody MemoryRequest memoryRequest) {
        return new ResponseEntity<>(supplyService.create(memoryRequest), HttpStatus.CREATED);
    }

    @PutMapping("/memory/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody MemoryRequest memoryRequest) {
        return new ResponseEntity<>(supplyService.update(id, memoryRequest), HttpStatus.ACCEPTED);
    }

}

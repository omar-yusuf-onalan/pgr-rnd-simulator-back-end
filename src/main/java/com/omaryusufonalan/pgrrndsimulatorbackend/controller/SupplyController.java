package com.omaryusufonalan.pgrrndsimulatorbackend.controller;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemorySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryUpdateRequest;
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
    public ResponseEntity<?> create(@RequestBody ConstructSaveRequest constructRequest) {
        return new ResponseEntity<>(supplyService.create(constructRequest), HttpStatus.CREATED);
    }

    @PutMapping("/construct")
    public ResponseEntity<?> update(@RequestBody ConstructUpdateRequest constructUpdateRequest) {
        return new ResponseEntity<>(supplyService.update(constructUpdateRequest.getId(), constructUpdateRequest), HttpStatus.ACCEPTED);
    }

    @GetMapping("/memory/{id}")
    public ResponseEntity<?> getMemoryResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(supplyService.getMemoryResponseById(id), HttpStatus.OK);
    }

    @PostMapping("/memory")
    public ResponseEntity<?> create(@RequestBody MemorySaveRequest memoryRequest) {
        return new ResponseEntity<>(supplyService.create(memoryRequest), HttpStatus.CREATED);
    }

    @PutMapping("/memory")
    public ResponseEntity<?> update(@RequestBody MemoryUpdateRequest memoryUpdateRequest) {
        return new ResponseEntity<>(supplyService.update(memoryUpdateRequest.getId(), memoryUpdateRequest), HttpStatus.ACCEPTED);
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<?> getItemResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(supplyService.getItemResponseById(id), HttpStatus.OK);
    }

    @PostMapping("/item")
    public ResponseEntity<?> create(@RequestBody ItemSaveRequest itemRequest) {
        return new ResponseEntity<>(supplyService.create(itemRequest), HttpStatus.CREATED);
    }

    @PutMapping("/item")
    public ResponseEntity<?> update(@RequestBody ItemUpdateRequest itemUpdateRequest) {
        return new ResponseEntity<>(supplyService.update(itemUpdateRequest.getId(), itemUpdateRequest), HttpStatus.ACCEPTED);
    }
}

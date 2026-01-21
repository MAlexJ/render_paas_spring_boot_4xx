package com.malex.api;

import com.malex.api.dto.EventRequest;
import com.malex.api.dto.EventResponse;
import com.malex.api.dto.EventsResponse;
import jakarta.validation.Valid;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

  private static final Map<String, EventResponse> EVENTS = new ConcurrentHashMap<>();

  @PostMapping
  public ResponseEntity<EventResponse> create(@RequestBody @Valid EventRequest eventRequest) {
    String id = UUID.randomUUID().toString();
    var response = new EventResponse(id, eventRequest.text(), LocalDateTime.now());
    EVENTS.put(id, response);
    return ResponseEntity.ok(response);
  }

  @GetMapping
  public ResponseEntity<EventsResponse> findAll() {
    var response = EVENTS.values().stream().toList();
    return ResponseEntity.ok(new EventsResponse(response));
  }
}

package com.malex.api.dto;

import java.util.List;

public record EventsResponse(List<EventResponse> events, int total) {

  public EventsResponse(List<EventResponse> events) {
    this(events, events.size());
  }
}

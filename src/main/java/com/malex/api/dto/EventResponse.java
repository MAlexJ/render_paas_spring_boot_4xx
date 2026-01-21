package com.malex.api.dto;

import java.time.LocalDateTime;

public record EventResponse(String id, String text, LocalDateTime dateTime) {}

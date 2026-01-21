package com.malex.api.dto;

import jakarta.validation.constraints.NotBlank;

public record EventRequest(@NotBlank String text) {}

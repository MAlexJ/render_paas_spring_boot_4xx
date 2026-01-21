package com.malex.api.configuration;

import com.malex.api.EventController;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApiVersionConfiguration implements WebMvcConfigurer {

  @Override
  public void configureApiVersioning(ApiVersionConfigurer configurer) {
    configurer //
        .addSupportedVersions("v1", "v2")
        .setDefaultVersion("v1")
        // Example: /api/v1/users for 1 path segment
        .usePathSegment(0);
  }

  @Override
  public void configurePathMatch(PathMatchConfigurer configurer) {
    configurer.addPathPrefix("/{version}", EventController.class::isAssignableFrom);
  }
}

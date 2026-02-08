package com.malex;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class RunApplication {

  private final BuildProperties buildProperties;

  public static void main(String[] args) {
    SpringApplication.run(RunApplication.class, args);
  }

  @PostConstruct
  public void printVersion() {
    log.info(
        "Application version: {} (built at {})",
        buildProperties.getVersion(),
        buildProperties.getTime());
  }
}

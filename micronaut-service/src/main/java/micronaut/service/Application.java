package micronaut.service;

import io.micronaut.runtime.Micronaut;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

  public static void main(String[] args) {
    Micronaut.run(Application.class);
    log.info("The application is using {} mb", (Runtime.getRuntime().totalMemory() / 1024 / 1024));
  }

}
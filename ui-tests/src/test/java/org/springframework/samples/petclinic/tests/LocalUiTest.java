package org.springframework.samples.petclinic.tests;

import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;

public abstract class LocalUiTest extends TestDataSource {
  @BeforeAll
  public static void setUpClass() {
    Configuration.holdBrowserOpen = true;
    Configuration.baseUrl = "http://localhost:3000";
  }

  @Override
  protected String jdbcHost() {
    return "127.0.0.1";
  }

  @Override
  protected int jdbcPort() {
    return 5432;
  }

  protected String homePath() {
    return "http://localhost:3000";
  }

  protected String apiLoginPath() {
    return "http://localhost:8080/login";
  }
}

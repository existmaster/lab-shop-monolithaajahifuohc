package labshopmonolith.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopmonolith.BoundedContext933Application;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext933Application.class })
public class CucumberSpingConfiguration {}

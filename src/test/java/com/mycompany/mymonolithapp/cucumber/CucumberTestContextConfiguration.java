package com.mycompany.mymonolithapp.cucumber;

import com.mycompany.mymonolithapp.JhipsterSampleMonolithApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterSampleMonolithApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

package com.example.test.demo.integration;

import com.example.test.demo.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

@SpringBootTest
@WebAppConfiguration
@AutoConfigureMockMvc
@Transactional
@Sql(scripts = {"/your-script-here.sql"})
public class IntegrationTest {

    @Autowired
    UserController userController;

    // Test the entire flow of the application based on the test data supplied from your script mentioned on line 16
}

package com.example.helloworld.it;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponseTests {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void helloStringMatches() {
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains("Hello World");
    }

    @Test
    public void goodbyeStringMatches() {
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/goodbye",
                String.class)).contains("Goodbye World");
    }

}

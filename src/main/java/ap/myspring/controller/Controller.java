/**
 * Dana.id
 * Copyright (c) 2017‐2022 All Rights Reserved.
 */
package ap.myspring.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ap.myspring.model.Greeting;
import ap.myspring.model.Quote;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: Controller.java, v 0.1 2022‐02‐10 12.15 Achmad Yogi Prakoso Exp $$
 */
@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/quote")
    public Quote quote() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Quote> response = restTemplate.getForEntity("https://quoters.apps.pcfone.io/api/random", Quote.class);
        Assert.isTrue(response.getStatusCode() == HttpStatus.OK, "Failed request!");
        return response.getBody();
    }
}
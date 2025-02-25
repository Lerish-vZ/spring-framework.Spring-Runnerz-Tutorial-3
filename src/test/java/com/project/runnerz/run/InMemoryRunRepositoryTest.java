package com.project.runnerz.run;

import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRunRepositoryTest {
    InMemoryRunRepository repository;

    @BeforeEach
    void setUp() {
        repository = new InMemoryRunRepository();
        repository.create(new Run ( 1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.INDOOR, null));

        repository.create(new Run ( 2,
                "Wednesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                6,
                Location.INDOOR, null));
    }


}
package com.project.runnerz.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class RunJsonDataLoader implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(RunJsonDataLoader.class);
    private final RunRepository runRepository;

    public RunJsonDataLoader(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

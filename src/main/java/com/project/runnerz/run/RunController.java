package com.project.runnerz.run;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final JdbcClientRunRepository jdbcClientRunRepository;

    public RunController(JdbcClientRunRepository jdbcClientRunRepository) {
        this.jdbcClientRunRepository = jdbcClientRunRepository;
    }

    @GetMapping("")
    List<Run> findAll(){
        return jdbcClientRunRepository.findAll();
    }

    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id) {
        Optional<Run> run = jdbcClientRunRepository.findById(id);

        if(run.isEmpty()){
            throw new RunNotFoundException();
        }
        return run.get();
    }

    //POST
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@Valid @RequestBody Run run) {
        jdbcClientRunRepository.create(run);
    }

    //PUT
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@Valid @RequestBody Run run, @PathVariable Integer id) {
        jdbcClientRunRepository.update(run, id);
    }

    //DELETE
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        jdbcClientRunRepository.delete(id);
    }
}

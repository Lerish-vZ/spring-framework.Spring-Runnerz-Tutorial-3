package com.project.runnerz.run;

import java.time.LocalDateTime;

public class Run {
    private Integer id;
    private String title;
    private LocalDateTime startedOn;
    private LocalDateTime completedOn;
    private Integer miles;
    private Location location;

    public Run(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer miles){
        this.id = id;
        this.title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.miles = miles;
        this.location = Location();

        if(!completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("Completed On Must Be After Started On");
        }
    }

    public Duration gerDuration(){
        return Duration.between(startedOn, completedOn);
    }
}


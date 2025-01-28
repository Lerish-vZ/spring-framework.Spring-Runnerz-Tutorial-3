package com.project.runnerz.run;

import java.time.LocalDateTime;
import java.util.Objects;

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

    public Integer getAvgPace(){
        return Math.toIntExact(gerDuration().toMinutes()/miles);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(LocalDateTime startedOn) {
        this.startedOn = startedOn;
    }

    public LocalDateTime getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(LocalDateTime completedOn) {
        this.completedOn = completedOn;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Run run = (Run) o;
        return Objects.equals(id, run.id) && Objects.equals(title, run.title) && Objects.equals(startedOn, run.startedOn) && Objects.equals(completedOn, run.completedOn) && Objects.equals(miles, run.miles) && Objects.equals(location, run.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startedOn, completedOn, miles, location);
    }

    
}


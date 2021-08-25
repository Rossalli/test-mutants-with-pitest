package br.com.rossalli.tdc.transformation.mutants.delorean;


import java.time.LocalDateTime;

public class TimeCircuit {
    private LocalDateTime destinationTime;
    private LocalDateTime presentTime;
    private LocalDateTime lastTimeDeparted;

    public TimeCircuit(LocalDateTime destinationTime, LocalDateTime presentTime, LocalDateTime lastTimeDeparted) {
        this.destinationTime = destinationTime;
        this.presentTime = presentTime;
        this.lastTimeDeparted = lastTimeDeparted;
    }

    public LocalDateTime getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(LocalDateTime destinationTime) {
        this.destinationTime = destinationTime;
    }

    public LocalDateTime getPresentTime() {
        return presentTime;
    }

    public void setPresentTime(LocalDateTime presentTime) {
        this.presentTime = presentTime;
    }

    public LocalDateTime getLastTimeDeparted() {
        return lastTimeDeparted;
    }

    public void setLastTimeDeparted(LocalDateTime lastTimeDeparted) {
        this.lastTimeDeparted = lastTimeDeparted;
    }
}

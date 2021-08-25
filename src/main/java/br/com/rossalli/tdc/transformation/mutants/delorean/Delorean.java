package br.com.rossalli.tdc.transformation.mutants.delorean;

public class Delorean {

    private FluxCapacitor fluxCapacitor;
    private TimeCircuit timeCircuit;

    public Delorean(FluxCapacitor fluxCapacitor, TimeCircuit timeCircuit) {
        this.fluxCapacitor = fluxCapacitor;
        this.timeCircuit = timeCircuit;
    }

    public FluxCapacitor getFluxCapacitor() {
        return fluxCapacitor;
    }

    public void setFluxCapacitor(FluxCapacitor fluxCapacitor) {
        this.fluxCapacitor = fluxCapacitor;
    }

    public TimeCircuit getTimeCircuit() {
        return timeCircuit;
    }

    public void setTimeCircuit(TimeCircuit timeCircuit) {
        this.timeCircuit = timeCircuit;
    }
}

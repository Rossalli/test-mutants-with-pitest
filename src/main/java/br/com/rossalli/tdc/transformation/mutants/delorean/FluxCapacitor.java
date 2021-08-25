package br.com.rossalli.tdc.transformation.mutants.delorean;

public class FluxCapacitor {

    private double mrFusionEnergy;
    private int deloreanVelocity;

    public FluxCapacitor(Double mrFusionEnergy, Integer deloreanVelocity) {
        this.mrFusionEnergy = mrFusionEnergy;
        this.deloreanVelocity = deloreanVelocity;
    }

    public double getMrFusionEnergy() {
        return mrFusionEnergy;
    }

    public void setMrFusionEnergy(double mrFusionEnergy) {
        this.mrFusionEnergy = mrFusionEnergy;
    }

    public int getDeloreanVelocity() {
        return deloreanVelocity;
    }

    public void setDeloreanVelocity(int deloreanVelocity) {
        this.deloreanVelocity = deloreanVelocity;
    }
}

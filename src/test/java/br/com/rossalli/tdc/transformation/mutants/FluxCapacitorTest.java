package br.com.rossalli.tdc.transformation.mutants;

import br.com.rossalli.tdc.transformation.mutants.delorean.FluxCapacitor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FluxCapacitorTest {

    @DisplayName("Building flux capacitor")
    @Test
    public void fluxCapacitorBuild() {
        FluxCapacitor fluxCapacitor =  new FluxCapacitor(0.0, 0);
        fluxCapacitor.setMrFusionEnergy(1.21);
        assertEquals(fluxCapacitor.getMrFusionEnergy(), 1.21);
        fluxCapacitor.setDeloreanVelocity(88);
        assertEquals(fluxCapacitor.getDeloreanVelocity(), 88);
    }
}

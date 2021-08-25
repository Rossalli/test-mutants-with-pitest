package br.com.rossalli.tdc.transformation.mutants.delorean;

public class TimeTravelService {

    private final Double FLUX_CAPACITOR_JIGOWATTS_REQUIREMENT = 1.21;
    private final Integer DELOREAN_VELOCITY_MILES_BY_HOUR_REQUIREMENT= 88;
    private final Integer MINIMUM_YEAR_TO_TRAVEL = 1955;

    public String iniciarViagemNoTempo(Delorean delorean) {
        if(valorDoMrFusionEnergyAlcancado(delorean) && velocidadeDoDeloreanAlcancada(delorean) && dentroDoAnoMinimoParaViajarNoTempo(delorean)) {
            return "VIAJANDO PARA " + delorean.getTimeCircuit().getDestinationTime().getYear();
        }
        return "ERRO AO VIAJAR NO TEMPO";
    }

    private boolean valorDoMrFusionEnergyAlcancado(Delorean delorean) {
        return delorean.getFluxCapacitor().getMrFusionEnergy() == (FLUX_CAPACITOR_JIGOWATTS_REQUIREMENT);
    }

    private boolean velocidadeDoDeloreanAlcancada(Delorean delorean) {
        return delorean.getFluxCapacitor().getDeloreanVelocity() == (DELOREAN_VELOCITY_MILES_BY_HOUR_REQUIREMENT);
    }

    private boolean dentroDoAnoMinimoParaViajarNoTempo(Delorean delorean) {
        return delorean.getTimeCircuit().getDestinationTime().getYear() >= MINIMUM_YEAR_TO_TRAVEL;
    }
}

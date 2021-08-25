package br.com.rossalli.tdc.transformation.mutants;

import br.com.rossalli.tdc.transformation.mutants.delorean.Delorean;
import br.com.rossalli.tdc.transformation.mutants.delorean.FluxCapacitor;
import br.com.rossalli.tdc.transformation.mutants.delorean.TimeCircuit;
import br.com.rossalli.tdc.transformation.mutants.delorean.TimeTravelService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTravelServiceTest {

    //sucesso
    @Test
    @DisplayName("Viajando no tempo com sucesso")
    public void viajandoComSucessoNoTempo() {

        FluxCapacitor capacitor = new FluxCapacitor(1.21, 88);

        LocalDateTime dataDestino = LocalDateTime.of(1985, 11, 05, 06, 28);
        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataUltimaViagem = LocalDateTime.of(1955, 11, 05, 06, 28);
        TimeCircuit timeCircuit = new TimeCircuit(dataDestino, dataAtual, dataUltimaViagem);

        Delorean delorean = new Delorean(capacitor, timeCircuit);

        TimeTravelService service = new TimeTravelService();
        String resultado = service.iniciarViagemNoTempo(delorean);
        assertEquals(resultado, "VIAJANDO PARA 1985");

    }


    //erro
    @Test
    @DisplayName("Viajando no tempo com erro, ou seja, não viajei ;)")
    public void viajandoComErroNoTempo() {

        FluxCapacitor capacitor = new FluxCapacitor(1.20, 88);

        LocalDateTime dataDestino = LocalDateTime.of(1985, 11, 05, 06, 28);
        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataUltimaViagem = LocalDateTime.of(1955, 11, 05, 06, 28);
        TimeCircuit timeCircuit = new TimeCircuit(dataDestino, dataAtual, dataUltimaViagem);

        Delorean delorean = new Delorean(capacitor, timeCircuit);

        TimeTravelService service = new TimeTravelService();
        String resultado = service.iniciarViagemNoTempo(delorean);
        assertEquals(resultado, "ERRO AO VIAJAR NO TEMPO");

    }


    @Test
    @DisplayName("Viajando no tempo com sucesso no ano minimo (1955)")
    public void viajandoComSucessoNoAnoMinimoNoTempo() {

        FluxCapacitor capacitor = new FluxCapacitor(1.21, 88);

        LocalDateTime dataDestino = LocalDateTime.of(1955, 11, 05, 06, 28);
        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataUltimaViagem = LocalDateTime.of(1955, 11, 05, 06, 28);
        TimeCircuit timeCircuit = new TimeCircuit(dataDestino, dataAtual, dataUltimaViagem);

        Delorean delorean = new Delorean(capacitor, timeCircuit);

        TimeTravelService service = new TimeTravelService();
        String resultado = service.iniciarViagemNoTempo(delorean);
        assertEquals(resultado, "VIAJANDO PARA 1955");

    }

}

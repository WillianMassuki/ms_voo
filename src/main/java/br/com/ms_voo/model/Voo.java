package br.com.ms_voo.model;

import br.com.ms_voo.enuns.StatusVoo;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Voo {

    @Id
    private UUID codigo;

    private String numeroVoo;

    private String LocalOrigem;

    private String LocalDestino;

    @Enumerated(EnumType.STRING)
    private StatusVoo status;

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public StatusVoo getStatus() {
        return status;
    }

    public void setStatus(StatusVoo status) {
        this.status = status;
    }

    @Column(nullable = false)
    private LocalDateTime dataHoraPrevistaSaida;

    @Column(nullable = false)
    private LocalDateTime dataHoraPrevistaChegada;

    private LocalDateTime horarioRealDecolagem;

    private LocalDateTime horarioRealPouso;

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getLocalOrigem() {
        return LocalOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        LocalOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return LocalDestino;
    }

    public void setLocalDestino(String localDestino) {
        LocalDestino = localDestino;
    }


    public LocalDateTime getDataHoraPrevistaSaida() {
        return dataHoraPrevistaSaida;
    }

    public void setDataHoraPrevistaSaida(LocalDateTime dataHoraPrevistaSaida) {
        this.dataHoraPrevistaSaida = dataHoraPrevistaSaida;
    }

    public LocalDateTime getDataHoraPrevistaChegada() {
        return dataHoraPrevistaChegada;
    }

    public void setDataHoraPrevistaChegada(LocalDateTime dataHoraPrevistaChegada) {
        this.dataHoraPrevistaChegada = dataHoraPrevistaChegada;
    }

    public LocalDateTime getHorarioRealDecolagem() {
        return horarioRealDecolagem;
    }

    public void setHorarioRealDecolagem(LocalDateTime horarioRealDecolagem) {
        this.horarioRealDecolagem = horarioRealDecolagem;
    }

    public LocalDateTime getHorarioRealPouso() {
        return horarioRealPouso;
    }

    public void setHorarioRealPouso(LocalDateTime horarioRealPouso) {
        this.horarioRealPouso = horarioRealPouso;
    }
}
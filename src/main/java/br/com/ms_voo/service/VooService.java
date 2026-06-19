package br.com.ms_voo.service;

import br.com.ms_voo.model.Voo;
import br.com.ms_voo.repository.VooRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VooService {

    private final VooRepository vooRepository;

    public VooService(VooRepository vooRepository) {
        this.vooRepository = vooRepository;
    }

    public List<Voo> listarTudo() {
        return vooRepository.findAll();
    }

    public Optional<Voo> buscarPorUUID(UUID id) {
        return vooRepository.findById(id);
    }

    public Voo salvar(Voo voo) {
        return vooRepository.save(voo);
    }

    public Voo atualizar(UUID id, Voo vooAtualizado) {

        Voo voo = vooRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Voo não encontrado"));

        voo.setNumeroVoo(vooAtualizado.getNumeroVoo());
        voo.setLocalOrigem(vooAtualizado.getLocalOrigem());
        voo.setStatus(vooAtualizado.getStatus());
        voo.setDataHoraPrevistaSaida(vooAtualizado.getDataHoraPrevistaSaida());
        voo.setDataHoraPrevistaChegada(vooAtualizado.getDataHoraPrevistaChegada());
        voo.setHorarioRealDecolagem(vooAtualizado.getHorarioRealDecolagem());
        voo.setDataHoraPrevistaChegada(vooAtualizado.getDataHoraPrevistaChegada());

        return vooRepository.save(voo);
    }

    public void deletar(UUID id) {

        if (!vooRepository.existsById(id)) {
            throw new RuntimeException("Voo não encontrado");
        }

        vooRepository.deleteById(id);
    }

}

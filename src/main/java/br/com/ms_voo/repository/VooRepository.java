package br.com.ms_voo.repository;

import br.com.ms_voo.model.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VooRepository extends JpaRepository<Voo, UUID> {
}

package br.eti.mts.garage.repositories;

import java.util.List;
import br.eti.mts.garage.entities.Veiculo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CompetidorSENAI
 */
public interface VeiculoRepository extends JpaRepository <Veiculo , Long> {
    Veiculo findById(long id);
}

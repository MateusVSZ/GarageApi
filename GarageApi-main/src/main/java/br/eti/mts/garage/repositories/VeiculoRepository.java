package br.eti.mts.garage.repositories;

import br.eti.mts.garage.DTO.VeiculosMinDTO;
import br.eti.mts.garage.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CompetidorSENAI
 */
public interface VeiculoRepository extends JpaRepository <Veiculo , Long> {
    Veiculo findById(long id);
    
     List<Veiculo>findByCorIgnoreCase(String cor);
     List<Veiculo>findByAno(int ano);
    
    
}

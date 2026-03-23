package br.eti.mts.garage.service;

import br.eti.mts.garage.DTO.VeiculosMinDTO;
import br.eti.mts.garage.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.mts.garage.repositories.VeiculoRepository;
import jakarta.persistence.Id;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author CompetidorSENAI
 */
@Service//@Service indica que uma classe contém lógica de negócios.
public class VeiculoService {

    /**
     * @Autowired injeta automaticamente, neste caso, a interface
     * GarageRepository. Seria uma abreviação de “GarageRepository
     * garageRepository = new GarageRepository();”. Ele injeta a dependência
     * dentro da classe.
     *
     */
    //Aqui pega tudo da minha classe Veiculo @Entity List<Veiculo>, minha classe objeto onde tem todos os atributos e getters and setters  
    /* public List<Veiculo> findAll() { 
        List<Veiculo> result = garageRepository.findAll();
        return result; */
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll() {

        List<Veiculo> result = veiculoRepository.findAll();
        return result;

    }


    public VeiculosMinDTO findById(long id) {
        Veiculo result = veiculoRepository.findById(id);
        VeiculosMinDTO resultDTO = new VeiculosMinDTO(result);
        return resultDTO;
    

}


}
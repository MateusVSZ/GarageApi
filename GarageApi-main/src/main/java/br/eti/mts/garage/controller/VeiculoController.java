package br.eti.mts.garage.controller;

import br.eti.mts.garage.DTO.VeiculosMinDTO;
import br.eti.mts.garage.entities.Veiculo;
import br.eti.mts.garage.service.VeiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.eti.mts.garage.repositories.VeiculoRepository;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author CompetidorSENAI
 */
//@RestController
/**
 * Notação controladora da API Rest, marca a classe que vai receber requisições
 * web, e retorna dados em JSON Dentro dela existe o Get, Post, Put, Delete .
 * Basicamente recebe pedidos e ele decide pra onde vai . Exemplo simples:
 * Cliente faz o pedido → Controller Garçom leva para cozinha → service Cozinha
 * prepara → Banco de dados Garçom traz de volta → Resposta da API
 *
 */
@RestController
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService; //ele precisa pegar da base de dados entao ele usa o GarageRepository

    @CrossOrigin
    @GetMapping("/forsale")
    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoService.findAll();
        return result;

    }

    @GetMapping("/forsale/{idNum}")
    public ResponseEntity<VeiculosMinDTO> findById(@PathVariable long idNum) {
        VeiculosMinDTO result = veiculoService.findById(idNum);

        if (result == null) {
            //ops...garage vazia
            //notFound 404
            return ResponseEntity.notFound().build();

        } else {
            //eba tem dados!
            //ok devolve 200
            return ResponseEntity.ok(result);

        }
    }

}
package io.github.sandes.arquiteturaspring.montadora.api;

import io.github.sandes.arquiteturaspring.montadora.CarroStatus;
import io.github.sandes.arquiteturaspring.montadora.Chave;
import io.github.sandes.arquiteturaspring.montadora.HondaHRV;
import io.github.sandes.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Qualifier("motorTurbo") //injetando tipos específicos de beans defiinidos na classe de configuração (montadoraConfiguration)
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);

        return carro.darIginicao(chave);
    }
}

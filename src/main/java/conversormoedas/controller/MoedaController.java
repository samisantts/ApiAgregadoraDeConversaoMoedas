package conversormoedas.controller;

import conversormoedas.model.Moeda;
import conversormoedas.service.ConversaoMoedas;
import conversormoedas.service.GerenciadorMoedas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoedaController {

    private final GerenciadorMoedas gerenciadorMoedas;
    private final ConversaoMoedas conversaoMoedas;

    public MoedaController(GerenciadorMoedas gerenciadorMoedas, ConversaoMoedas conversaoMoedas) {
            this.gerenciadorMoedas = gerenciadorMoedas;
        this.conversaoMoedas = conversaoMoedas;
    }

        @GetMapping("/moedas/{sigla}")
        public Moeda buscarMoeda(@PathVariable String sigla) {
            return gerenciadorMoedas.buscarMoeda(sigla);
        }
    }


package conversormoedas;

import conversormoedas.model.Moeda;
import conversormoedas.service.GerenciadorMoedas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoedaController {

        private final GerenciadorMoedas gerenciadorMoedas;

        public MoedaController(GerenciadorMoedas gerenciadorMoedas) {
            this.gerenciadorMoedas = gerenciadorMoedas;
        }

        @GetMapping("/moedas/{sigla}")
        public Moeda buscarMoeda(@PathVariable String sigla) {
            return gerenciadorMoedas.buscarMoeda(sigla);
        }
    }


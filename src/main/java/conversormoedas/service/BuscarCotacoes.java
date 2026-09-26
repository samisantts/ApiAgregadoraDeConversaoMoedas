package conversormoedas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class BuscarCotacoes {

    private final RestClient restClient;

    public BuscarCotacoes(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://api.frankfurter.dev")
                .build();
    }
}
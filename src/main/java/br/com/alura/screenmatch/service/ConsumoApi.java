package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Sempre bom pensarmos em deixar a classe que consome 
//as APIs criadas, assim, não ficamos dependentes de 
//fazer isso toda vez que um código que precise consumir 
//uma API;

public class ConsumoApi {
    public String obterDados(String endereco) { // json que vem retornado no formato de uma String (de onde vem as info da API(de um endereço))
        HttpClient client = HttpClient.newHttpClient(); // Client que manda a requisição
        HttpRequest request = HttpRequest.newBuilder() 
                .uri(URI.create(endereco)) // URI para sabermos para qual endereço faremos a requisição
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString()); // Aqui tentamos receber uma resposta
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e); 
        }

        String json = response.body(); // corpo da resposta
        return json;
    }
}
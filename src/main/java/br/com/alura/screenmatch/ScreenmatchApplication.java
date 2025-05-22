package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConvertDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Recaptulando: temos um consumoApi
		// Vou no consumoApi e obtemos os dados do link atribuindo para variável Json
		// Vimos se os dados vieram "ok" no sout
		// Depois instanciamos o conversor e mandamos ele transformar para DadosSerie

		var consumoApi = new ConsumoApi(); // Para utilizarmos a classe ConsumoAPi, instanciamos uma nova variável e e ela no inicializador do Java
		var json = consumoApi.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=5fd7c371"); // Meu Json quando chamado vai no ConsumoApi e chama o método ObterDados(com endereço da API que queremos buscar)
		System.out.println(json);
		ConvertDados conversor = new ConvertDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}

}

package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//Mandamos ele não converter aquilo que não mapeamos do Json
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                        @JsonAlias("totalSeasons") Integer totalTemporada,
                        @JsonAlias("imdbRating") String avaliacao ) { //Mapeamento do JSON para minha classe
    
        
    
}

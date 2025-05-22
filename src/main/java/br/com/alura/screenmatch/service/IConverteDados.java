package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //IConverteDados vai receber um Json que é uma string, vai receber uma classe 
    //e la no ConvertDados vamos transformar esse Json na classe que foi indicada
    
    <T> T obterDados(String json, Class<T> classe); // Usamos o <T> T (É conhecido como Generics, quando não sabemos qual entidade devolvida)

}

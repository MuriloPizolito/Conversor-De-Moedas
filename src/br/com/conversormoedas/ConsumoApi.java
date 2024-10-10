package br.com.conversormoedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public void apiService(String moeda1, String moeda2, double valor) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/3efd577cbfe183763364e032/pair/" + moeda1 + "/" + moeda2 + "/" + valor))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
            String json = response.body();
            Gson gson = new Gson();
            Moeda moeda = gson.fromJson(json, Moeda.class);
            System.out.println("Conversão de ["+ moeda1 +"] para ["+ moeda2+"]");
            System.out.println("Valor a ser convertido: "+valor);
            System.out.println("Resultado da conversão: "+moeda.conversion_result());
//            System.out.println(moeda);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}

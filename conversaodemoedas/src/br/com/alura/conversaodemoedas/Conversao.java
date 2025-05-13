package br.com.alura.conversaodemoedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Conversao {
   public Moeda conversao(String moedaOrigem, String moedasDestinos, double valor) throws IOException, InterruptedException  {
      String apikey = "1c33f637ff55445e935102dc";
    URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apikey + "/latest/" + moedaOrigem);

     HttpRequest request = HttpRequest.newBuilder()
        .uri(url)
        .build();
     
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
      JsonObject json = gson.fromJson(response.body(), JsonObject.class);

      if (!json.get("result").getAsString().equals("success")) {
         throw new RuntimeException("Erro na resposta da API: " + json);
     }
     

      JsonObject rates = json.getAsJsonObject("conversion_rates");
      double taxa = rates.get(moedasDestinos).getAsDouble();
      double valorConvertido = valor * taxa;
      
      return new Moeda(moedasDestinos, valorConvertido, moedaOrigem, valor);

   }
}

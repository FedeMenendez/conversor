package Modelos;


import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Currency;


public class ConsultaApi {
    public Moneda cambioMoneda(String s, double montoDinero) {
        String direccion = "https://v6.exchangerate-api.com/v6/1a30db0ff2f61756b0dd5f5d/pair/" + s + montoDinero ;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        //System.out.println(direccion);
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No es posible realizar la conversion");
        }
    }
}

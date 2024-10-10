

import br.com.conversormoedas.ConsumoApi;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

//        ConsumindoApi consumindoApi = new ConsumindoApi();
//
//        System.out.println("Digite a moeda para buscar: ");
//        String busca = scanner.nextLine();
//
//
//        try {
//            Moeda moeda = consumindoApi.buscaConversao(busca);
//            System.out.println("teste "+moeda);
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//            System.out.println("Finalizado");
//        }

        System.out.println("""
                -------------------------------------------------
                1) Real Brasileiro [BRL] --> Peso Argentino [ARS]
                2) Peso Argentino [ARS] --> Real Brasileiro [BRL]
                3) Real Brasileiro [BRL] --> Dólar [USD]
                4) Dólar [USD] --> Real Brasileiro [BRL]
                5) Real Brasileiro [BRL] --> Peso Colombiano [COP]
                6) Peso Colombiano [COP] --> Real Brasileiro [BRL]
                7) Sair
                -------------------------------------------------
                """);
        System.out.println("Escolha uma opção: ");
        int escolha = scanner.nextInt();

        System.out.println("Digite o valor para conversão: ");
        double valor = scanner.nextDouble();

//        String moeda1 = "BRL";
//        String moeda2 = "USD";
//        String valor = "100";
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://v6.exchangerate-api.com/v6/3efd577cbfe183763364e032/pair/" + moeda1 + "/" + moeda2 + "/" + valor))
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
//
//        String json = response.body();
//
//        Gson gson = new Gson();
//        Moeda moeda = gson.fromJson(json, Moeda.class);
//        System.out.println(moeda);

        ConsumoApi consumoApi = new ConsumoApi();

        switch (escolha) {
            case 1:
                consumoApi.apiService("BRL", "ARS", valor);
                break;
            case 2:
                consumoApi.apiService("ARS", "BRL", valor);
                break;
            case 3:
                consumoApi.apiService("BRL", "USD", valor);
                break;
            case 4:
                consumoApi.apiService("USD", "BRL", valor);
                break;
            case 5:
                consumoApi.apiService("BRL", "COP", valor);
                break;
            case 6:
                consumoApi.apiService("COP", "BRL", valor);
                break;
            case 7:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }




    }
}

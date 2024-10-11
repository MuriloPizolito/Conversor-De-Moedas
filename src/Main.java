

import br.com.conversormoedas.ConsumoApi;
import br.com.conversormoedas.MenuOperacoes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        double valor = 0;
        ConsumoApi consumoApi = new ConsumoApi();
        MenuOperacoes menuOperacoes = new MenuOperacoes();

        while (escolha != 7) {
            menuOperacoes.menu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    menuOperacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumoApi.apiService("BRL", "ARS", valor);
                    break;
                case 2:
                    menuOperacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumoApi.apiService("ARS", "BRL", valor);
                    break;
                case 3:
                    menuOperacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumoApi.apiService("BRL", "USD", valor);
                    break;
                case 4:
                    menuOperacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumoApi.apiService("USD", "BRL", valor);
                    break;
                case 5:
                    menuOperacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumoApi.apiService("BRL", "COP", valor);
                    break;
                case 6:
                    menuOperacoes.mensagem();
                    valor = scanner.nextDouble();
                    consumoApi.apiService("COP", "BRL", valor);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }

        }

    }
}

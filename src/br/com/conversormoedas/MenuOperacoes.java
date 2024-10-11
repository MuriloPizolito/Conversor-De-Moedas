package br.com.conversormoedas;

public class MenuOperacoes {

    public void menu () {
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
    }

    public void mensagem() {
        System.out.println("Digite o valor para conversão: ");
    }

}

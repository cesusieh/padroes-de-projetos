// Para resolver esse problema foi adotado o padrão Strategy
// Ele permite encapsular a lógica de cada estrategia, facilitando a manutenção e delegando responsabilidade

// Permite a alteração do modelo em runtime, ao passar uma nova estrategia para o RiskAnalyzer, tudo continua funcionando, sem a necessidade de editar ou recompilar o código.

// Facilita a extensão, para criar uma nova estratégia é necessário apenas que ela implemente RiskCalculationStrategy e tudo funcionara bem

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Maria Souza");
        RiskAnalyzer analyzer = new RiskAnalyzer();

        System.out.println("Dynamic analysis of risk profile:");

        analyzer.setRiskCalculationStrategy(new ConservativeModel());
        analyzer.analyze(client);

        analyzer.setRiskCalculationStrategy(new ModerateModel());
        analyzer.analyze(client);

        analyzer.setRiskCalculationStrategy(new AggressiveModel());
        analyzer.analyze(client);
    }
}
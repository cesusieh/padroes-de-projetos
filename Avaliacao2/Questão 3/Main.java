// Main.java

// O padrão state foi escolhido para resolver esse problema
// Seu principio de encapsular o que varia é otimo para a simulação de uma usina

// Lógica 
// Permite quebrar uma lógica complexa em pequenos pedaços, divididos nos diferentes AlertStates
// Isola as responsabilidades, cada state é responsável por decidir as ações
// Evita a duplicidade de código
// Facilita a extensão, para criar um novo estado é necessário apenas que essa classe implemente a interface PlantState, sem modificar as classes já existentes

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NuclearPlant plant = new NuclearPlant();
        System.out.println("--- Simulação de Operação da Usina Nuclear ---");
        plant.reportCurrentStatus();

        System.out.println("\n1. Ligando a usina...");
        plant.startup();
        plant.reportCurrentStatus();

        System.out.println("\n2. Aumentando a temperatura gradualmente...");
        plant.setTemperature(250);
        plant.reportCurrentStatus();
        plant.setTemperature(350); 
        plant.reportCurrentStatus();

        System.out.println("\n3. Temperatura sobe ainda mais, disparando o contador...");
        plant.setTemperature(410); 
        plant.setTemperature(420); 
        plant.setTemperature(430); 
        plant.setTemperature(440); 
        plant.reportCurrentStatus();

        System.out.println("\n4. Simulando falha no sistema de resfriamento...");
        plant.setCoolingSystemStatus(false); 
        plant.reportCurrentStatus();

        System.out.println("\n--- Fim da Simulação de Crise ---");

        System.out.println("\n\n--- Demonstração do Modo de Manutenção ---");
        NuclearPlant plant2 = new NuclearPlant();
        plant2.startup();
        plant2.reportCurrentStatus();
        System.out.println("\nEntrando em modo de manutenção...");
        plant2.enterMaintenanceMode();
        plant2.reportCurrentStatus();
        System.out.println("Tentando aumentar a temperatura durante a manutenção...");
        plant2.setTemperature(500); 
        plant2.reportCurrentStatus();
        System.out.println("\nSaindo do modo de manutenção...");
        plant2.exitMaintenanceMode();
        plant2.reportCurrentStatus();
    }
}
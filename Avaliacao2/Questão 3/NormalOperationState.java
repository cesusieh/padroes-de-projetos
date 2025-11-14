// NormalOperationState.java

public class NormalOperationState implements PlantState {
    @Override
    public void checkConditions(NuclearPlant plant) {
        if (plant.getTemperature() > 300) {
            System.out.println("TRANSIÇÃO: Temperatura > 300°C. Mudando para ALERTA AMARELO.");
            plant.setState(new YellowAlertState());
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Status: OPERAÇÃO NORMAL. Condições estáveis.");
    }
}
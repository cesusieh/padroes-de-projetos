// YellowAlertState.java

public class YellowAlertState implements PlantState {
    private int timeAtHighTemp = 0;

    @Override
    public void checkConditions(NuclearPlant plant) {
        if (plant.getTemperature() > 400) {
            timeAtHighTemp += 10;
            System.out.println("AVISO: Temperatura > 400°C. Tempo acumulado: " + timeAtHighTemp + "s.");
            if (timeAtHighTemp > 30) {
                System.out.println("TRANSIÇÃO: Temp > 400°C por mais de 30s. Mudando para ALERTA VERMELHO.");
                plant.setState(new RedAlertState());
            }
        } else if (plant.getTemperature() <= 300) {
            System.out.println("TRANSIÇÃO: Temperatura normalizada. Retornando para OPERAÇÃO NORMAL.");
            plant.setState(new NormalOperationState());
        } else {
            this.timeAtHighTemp = 0;
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Status: ALERTA AMARELO. Monitorando temperatura de perto.");
    }
}
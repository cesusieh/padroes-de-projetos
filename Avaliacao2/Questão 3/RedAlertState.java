// RedAlertState.java

public class RedAlertState implements PlantState {
    @Override
    public void checkConditions(NuclearPlant plant) {
        if (!plant.isCoolingSystemOk()) {
            System.out.println("TRANSIÇÃO: FALHA CRÍTICA NO SISTEMA DE RESFRIAMENTO! Mudando para EMERGÊNCIA.");
            plant.setState(new EmergencyState());
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Status: ALERTA VERMELHO. Risco iminente. Aguardando estabilização ou ação manual.");
    }
}
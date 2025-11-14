// EmergencyState.java

public class EmergencyState implements PlantState {
    @Override
    public void checkConditions(NuclearPlant plant) {
    }

    @Override
    public void reportStatus() {
        System.out.println("Status: EMERGÊNCIA! EVACUAR IMEDIATAMENTE!");
    }
}
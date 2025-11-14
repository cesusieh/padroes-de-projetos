// OffState.java

public class OffState implements PlantState {
    @Override
    public void checkConditions(NuclearPlant plant) {
    }

    @Override
    public void reportStatus() {
        System.out.println("Status: USINA DESLIGADA.");
    }
}
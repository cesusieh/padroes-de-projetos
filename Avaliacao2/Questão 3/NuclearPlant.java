// NuclearPlant.java

public class NuclearPlant {

    private PlantState currentState;
    private double temperature;
    private boolean coolingSystemOk;
    private boolean inMaintenanceMode = false;

    public NuclearPlant() {
        this.currentState = new OffState();
        this.temperature = 25.0;
        this.coolingSystemOk = true;
    }

    public void setState(PlantState state) {
        this.currentState = state;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("[SENSOR] Temperatura ajustada para: " + temperature + "°C");
        this.checkSystemStatus(); 
    }

    public void setCoolingSystemStatus(boolean isOk) {
        this.coolingSystemOk = isOk;
        System.out.println("[SENSOR] Status do sistema de resfriamento: " + (isOk ? "OK" : "FALHA"));
        this.checkSystemStatus();
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isCoolingSystemOk() {
        return coolingSystemOk;
    }

    private void checkSystemStatus() {
        if (inMaintenanceMode) {
            System.out.println("AVISO: Usina em modo de manutenção. Verificações de estado suspensas.");
            return;
        }
        this.currentState.checkConditions(this);
    }

    public void reportCurrentStatus() {
        if (inMaintenanceMode) {
            System.out.println("Status: MODO DE MANUTENÇÃO.");
            return;
        }
        this.currentState.reportStatus();
    }

    public void startup() {
        if (currentState instanceof OffState) {
            System.out.println("Iniciando sequência de partida da usina...");
            setState(new NormalOperationState());
        } else {
            System.out.println("A usina já está em operação.");
        }
    }

    public void shutdown() {
        System.out.println("Iniciando sequência de desligamento...");
        setState(new OffState());
    }

    public void enterMaintenanceMode() {
        this.inMaintenanceMode = true;
        System.out.println("Usina entrou em MODO DE MANUTENÇÃO.");
    }

    public void exitMaintenanceMode() {
        this.inMaintenanceMode = false;
        System.out.println("Usina saiu do MODO DE MANUTENÇÃO. Retomando operações.");
        this.checkSystemStatus(); 
    }
}
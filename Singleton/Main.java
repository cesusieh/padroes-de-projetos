public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = AccountManager.getInstance();

        Client c1 = new Client(1, "Marcos");
        Client c2 = new Client(2, "Junior");
        Client c3 = new Client(3, "Felipe");

        Account cc1 = new Account(500, c1);
        Account cc2 = new Account(500, c2);
        Account cc3 = new Account(500, c3);
    
        Account[] contas = {cc1, cc2, cc3};

        accountManager.setAccounts(contas);

        accountManager.depositar(c1, 150.50);
        accountManager.sacar(c2, 300);
        
        accountManager.verContas();
    }
}

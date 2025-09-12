public class AccountManager {

    private static AccountManager instance;
    private Account[] accounts;

    private AccountManager() {}

    public static AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void depositar(Client client, double valor) {
        for (Account c : accounts) {
            if (c.getClient() == client) {
                c.setSaldo(c.getSaldo() + valor);
            }
        }
    }

    public void sacar(Client client, double valor) {
        for (Account c : accounts) {
            if (c.getClient() == client) {
                c.setSaldo(c.getSaldo() - valor);
            }
        }
    }

    public void verSaldo(Client client) {
        for (Account c : accounts) {
            if (c.getClient() == client) {
                System.out.println(c.getSaldo());
            }
        }
    }

    public void verContas(){
        for (Account c : accounts){
            System.out.println(c.toString() + "\n");
        }
    }
}


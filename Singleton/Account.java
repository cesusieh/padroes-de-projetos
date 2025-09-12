public class Account {
        private Client client;
        private double saldo;

        public Account(double balance, Client client) {
            this.client = client;
            this.saldo = balance;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double balance) {
            this.saldo = balance;
        }

        public Client getClient() {
            return client;
        }

        @Override
        public String toString() {
        return "ID: "+client.getIdClient()+"\nCliente: "+client.getNameClient()+"\nSaldo: "+saldo;
        }
    }

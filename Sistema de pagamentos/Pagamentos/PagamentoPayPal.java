package Pagamentos;
public class PagamentoPayPal implements IPagamento {
    private String contaUsuario;
    private String emailUsuario;

    public PagamentoPayPal(String contaUsuario, String emailUsuario) {
        this.contaUsuario = contaUsuario;
        this.emailUsuario = emailUsuario;
    }

    private boolean validarContaPayPal() {
        return contaUsuario.equals(emailUsuario);
    }

    @Override
    public String processarPagamento(double valor) {
        return validarContaPayPal() ? "Pagamento de " + valor + " aprovado" : "Pagamento de " + valor + " negado";
    }
}
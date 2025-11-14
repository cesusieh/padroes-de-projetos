public class DatabaseValidator extends AbstractValidator {
    public DatabaseValidator() { super(1500); }

    @Override
    protected boolean performValidation(ValidationContext context) {
        System.out.println("4. Validando Duplicidade no Banco de Dados...");
        if (context.getDocument().getDocumentNumber() != 12345) {
            System.out.println("   -> Sucesso: Nota não duplicada. 'Inserindo' no DB.");
            context.getDocument().setWasPersistedInDb(true);
            return true;
        } else {
            context.addError("Número de nota fiscal já existe no banco de dados.");
            System.out.println("   -> Falha: Nota duplicada.");
            return false;
        }
    }

    @Override
    public void rollback(ValidationContext context) {
        System.out.println("--- ROLLBACK: Removendo inserção do DB para a nota " + context.getDocument().getDocumentNumber() + " ---");
        context.getDocument().setWasPersistedInDb(false);
    }
}
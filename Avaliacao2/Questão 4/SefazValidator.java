public class SefazValidator extends AbstractValidator {
    public SefazValidator() { super(3000); }

    @Override
    protected boolean performValidation(ValidationContext context) {
        System.out.println("5. Validando com o serviço da SEFAZ...");
        if (context.getDocument().getDocumentNumber() == 99999) {
            context.addError("SEFAZ rejeitou a nota: Erro de comunicação.");
            System.out.println("   -> Falha: SEFAZ rejeitou a nota.");
            context.setChainHalted(true);
            return false;
        } else {
            System.out.println("   -> Sucesso: Nota autorizada pela SEFAZ.");
            return true;
        }
    }
}
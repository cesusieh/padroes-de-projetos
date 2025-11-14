public class FiscalRulesValidator extends AbstractValidator {
    public FiscalRulesValidator() { super(800); }

    @Override
    protected boolean performValidation(ValidationContext context) {
        System.out.println("3. Validando Regras Fiscais (Impostos)...");
        if (context.getDocument().getTaxValue() > 0) {
            System.out.println("   -> Sucesso: Cálculo de impostos parece correto.");
            return true;
        } else {
            context.addError("Cálculo de impostos inválido.");
            System.out.println("   -> Falha: Cálculo de impostos inválido.");
            return false;
        }
    }
}
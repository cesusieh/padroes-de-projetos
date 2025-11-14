public class SchemaValidator extends AbstractValidator {
    public SchemaValidator() { super(500); }

    @Override
    protected boolean performValidation(ValidationContext context) {
        System.out.println("1. Validando Schema XML...");
        if (context.getDocument().getXmlContent().contains("<schemaValido>")) {
            System.out.println("   -> Sucesso: Schema XML é válido.");
            return true;
        } else {
            context.addError("Schema XML inválido.");
            System.out.println("   -> Falha: Schema XML inválido.");
            context.setChainHalted(true);
            return false;
        }
    }
}
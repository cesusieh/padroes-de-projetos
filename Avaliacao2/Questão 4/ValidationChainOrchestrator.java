public class ValidationChainOrchestrator {
    private Validator chainHead;

    public ValidationChainOrchestrator() {
        buildChain();
    }

    private void buildChain() {
        Validator schema = new SchemaValidator();
        Validator cert = new CertificateValidator();
        Validator fiscal = new FiscalRulesValidator();
        Validator db = new DatabaseValidator();
        Validator sefaz = new SefazValidator();

        chainHead = schema;
        schema.setNext(cert);
        cert.setNext(fiscal);
        fiscal.setNext(db);
        db.setNext(sefaz);
    }

    public ValidationContext execute(FiscalDocument document) {
        ValidationContext context = new ValidationContext(document);
        System.out.println("--- Iniciando validação para a nota " + document.getDocumentNumber() + " ---");

        chainHead.validate(context);

        if (!context.isValid()) {
            System.out.println("\n--- Validação falhou. Iniciando processo de rollback... ---");
            while (!context.getRollbackStack().isEmpty()) {
                Validator validator = context.getRollbackStack().pop();
                validator.rollback(context);
            }
        }

        System.out.println("--- Fim da validação ---");
        return context;
    }
}
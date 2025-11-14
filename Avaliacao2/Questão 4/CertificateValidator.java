public class CertificateValidator extends AbstractValidator {
    public CertificateValidator() { super(1000); }

    @Override
    protected boolean performValidation(ValidationContext context) {
        System.out.println("2. Validando Certificado Digital...");
        if (context.getDocument().getCertificate().equals("VALIDO")) {
            System.out.println("   -> Sucesso: Certificado é válido.");
            return true;
        } else {
            context.addError("Certificado digital expirado ou revogado.");
            System.out.println("   -> Falha: Certificado digital inválido.");
            context.setChainHalted(true);
            return false;
        }
    }
}
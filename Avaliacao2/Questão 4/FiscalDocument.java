public class FiscalDocument {
    private String xmlContent;
    private String certificate;
    private double taxValue;
    private long documentNumber;
    private boolean wasPersistedInDb = false;

    public FiscalDocument(String xmlContent, String certificate, double taxValue, long documentNumber) {
        this.xmlContent = xmlContent;
        this.certificate = certificate;
        this.taxValue = taxValue;
        this.documentNumber = documentNumber;
    }

    public String getXmlContent() { return xmlContent; }
    public String getCertificate() { return certificate; }
    public double getTaxValue() { return taxValue; }
    public long getDocumentNumber() { return documentNumber; }
    public boolean wasPersistedInDb() { return wasPersistedInDb; }

    public void setWasPersistedInDb(boolean wasPersistedInDb) {
        this.wasPersistedInDb = wasPersistedInDb;
    }
}
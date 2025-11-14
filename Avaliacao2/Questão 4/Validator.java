public interface Validator {
    void setNext(Validator next);
    void validate(ValidationContext context);
    void rollback(ValidationContext context);
}
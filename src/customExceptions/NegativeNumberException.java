package customExceptions;

public class NegativeNumberException extends Exception {
  public NegativeNumberException() {
    super("Negative numbers cannot be used");
  }

  public NegativeNumberException(String message) {
    super(message);
  }
}
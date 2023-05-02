package customExceptions;

public class InvalidOperationException extends Exception {
  public InvalidOperationException() {
    super("Invalid operation");
  }

  public InvalidOperationException(String message) {
    super(message);
  }
}
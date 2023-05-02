package customExceptions;

public class InvalidNameException extends Exception {
  public InvalidNameException() {
    super("Invalid name");
  }

  public InvalidNameException(String message) {
    super(message);
  }
}
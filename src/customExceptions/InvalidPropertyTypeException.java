package customExceptions;

public class InvalidPropertyTypeException extends Exception {
  public InvalidPropertyTypeException() {
    super("Property type should be either Commercial, Agricultural or Residential");
  }

  public InvalidPropertyTypeException(String message) {
    super(message);
  }
}
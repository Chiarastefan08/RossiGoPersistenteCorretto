package Eccezioni;

public class CodiceFiscaleNonValidoException extends RuntimeException {
  public CodiceFiscaleNonValidoException(String message) {
    super(message);
  }
}

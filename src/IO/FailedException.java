package IO;

/**
 * Если копирование файла завершилось неудачей будет выброшено данное исключение
 * 
 * @author nedis
 * @version 1.0
 */
public class FailedException extends Exception {
	private static final long serialVersionUID = 1433646159143681180L;

	public FailedException(String message) {
		super(message);
	}

	public FailedException(String message, Throwable cause) {
		super(message, cause);
	}

}

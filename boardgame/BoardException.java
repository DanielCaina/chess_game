package boardgame;

public class BoardException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		//Método que recebe uma string de um erro e repassa a mensagem para o construtor da superclasse que é a RuntimeException.
		super(msg);
	}
}
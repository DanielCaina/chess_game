package boardgame;

public class Piece {
	//classe que atriui uma posi��o a uma pe�a e coloca ela em um tabuleiro
	protected Position position; //o "#" na UML significa protected
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	

}

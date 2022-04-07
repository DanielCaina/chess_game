package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	//classe que define a cor de uma peça de xadrez
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}

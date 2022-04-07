package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {
	//peça Rei
	
	public Knight(Board board, Color color) {
		//método que informa o tabuleiro e a cor da peça
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "N";
	}
}

package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
	//peça Torre
	
	public Rook(Board board, Color color) {
		//método que informa o tabuleiro e a cor da peça
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
}

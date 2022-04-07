package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {
	//pe�a Rei
	
	public Bishop(Board board, Color color) {
		//m�todo que informa o tabuleiro e a cor da pe�a
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "B";
	}
}

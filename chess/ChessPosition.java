package chess;

import boardgame.Position;

public class ChessPosition {
	//Classe para converter as coordenadas informadas pelo usu�rio.
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		//M�todo construtor da classe
		
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {throw new ChessException("Error instantiating chess position. Valid values are from a1 to h8.");}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		//M�todo que converte a posi��o informada pelo usu�rio para uma posi��o da matriz.
		
		return new Position(8 - row, column - 'a');	
	}
	
	protected static ChessPosition fromPosition(Position position) {
		//M�todo que converte uma posi��o da matriz para uma posi��o do xadrez. O sublinhado na UML indica um m�todo static.
		
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return""+column+row; //a string vazia no inicio serve para o compilador entender que � uma concatena��o de strings.
	}
}

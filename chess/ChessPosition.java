package chess;

import boardgame.Position;

public class ChessPosition {
	//Classe para converter as coordenadas informadas pelo usuário.
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		//Método construtor da classe
		
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
		//Método que converte a posição informada pelo usuário para uma posição da matriz.
		
		return new Position(8 - row, column - 'a');	
	}
	
	protected static ChessPosition fromPosition(Position position) {
		//Método que converte uma posição da matriz para uma posição do xadrez. O sublinhado na UML indica um método static.
		
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return""+column+row; //a string vazia no inicio serve para o compilador entender que é uma concatenação de strings.
	}
}

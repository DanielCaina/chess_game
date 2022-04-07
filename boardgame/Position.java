package boardgame;

public class Position {
	//Classe que define uma posi��o em uma matriz
	private int row;
	private int column;
	
	public Position() {}

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		//M�todo que define os valores das linhas e colunas
		this.row = row;
		this.column = column;
	}
	@Override
	public String toString() {
		//m�todo para imprimir a posi��o
		return row+", "+column;
	}
}

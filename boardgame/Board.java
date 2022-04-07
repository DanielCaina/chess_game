package boardgame;

public class Board {
	//classe que cria um tabuleiro com linhas e colunas e onde s�o colocadas as pe�as
	
	private int rows;
	private int columns;
	private Piece [][] pieces; //esta � uma matriz de pe�as
	
	public Board(int rows, int columns) {
		//M�todo construtor da classe
		
		if (rows < 1 || columns < 1) {throw new BoardException("Error creating board: there must be least 1 row and 1 column");}
		
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		//m�todo para definir a posi��o de uma pe�a
		
		if (! positionExists(row, column)) {throw new BoardException("Position doesn't exists");}
		
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		//sobrecarga do metodo anterior
		
		if (! positionExists(position)) {throw new BoardException("Position doesn't exists");}
		
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		//m�todo para colocor uma pe�a no tabuleiro. Ele vai atribuir a pe�a desejada � posi��o informada
		
		if (thereIsAPiece(position)) {throw new BoardException("There's already a piece on position: "+position);}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; //o position � acessivel porque � protected
	}
	
	private boolean positionExists(int row, int column) {
		//M�todo auxiliar para o m�todo positionExists, e verifica se uma posi��o (row, column) existe.
		
		return row >= 0 && row <= rows && column >= 0 && column <= columns;
	}
	
	public boolean positionExists(Position position) {
		//M�todo para verificar se a posi��o existe. Ele recebe uma position e retorna um valor booleano
		
		return positionExists(position.getRow(), position.getColumn()); //aqui reaproveitei o m�todo de anterior.
	}
	
	public boolean thereIsAPiece(Position position) {
		//M�todo para veificar se tem uma pe�a na posi��o informada.
		
		if (! positionExists(position)) {throw new BoardException("Position doesn't exists");}
		return piece(position) != null;
	}
}

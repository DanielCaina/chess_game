package boardgame;

public class Board {
	//classe que cria um tabuleiro com linhas e colunas e onde são colocadas as peças
	
	private int rows;
	private int columns;
	private Piece [][] pieces; //esta é uma matriz de peças
	
	public Board(int rows, int columns) {
		//Método construtor da classe
		
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
		//método para definir a posição de uma peça
		
		if (! positionExists(row, column)) {throw new BoardException("Position doesn't exists");}
		
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		//sobrecarga do metodo anterior
		
		if (! positionExists(position)) {throw new BoardException("Position doesn't exists");}
		
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		//método para colocor uma peça no tabuleiro. Ele vai atribuir a peça desejada à posição informada
		
		if (thereIsAPiece(position)) {throw new BoardException("There's already a piece on position: "+position);}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; //o position é acessivel porque é protected
	}
	
	private boolean positionExists(int row, int column) {
		//Método auxiliar para o método positionExists, e verifica se uma posição (row, column) existe.
		
		return row >= 0 && row <= rows && column >= 0 && column <= columns;
	}
	
	public boolean positionExists(Position position) {
		//Método para verificar se a posição existe. Ele recebe uma position e retorna um valor booleano
		
		return positionExists(position.getRow(), position.getColumn()); //aqui reaproveitei o método de anterior.
	}
	
	public boolean thereIsAPiece(Position position) {
		//Método para veificar se tem uma peça na posição informada.
		
		if (! positionExists(position)) {throw new BoardException("Position doesn't exists");}
		return piece(position) != null;
	}
}

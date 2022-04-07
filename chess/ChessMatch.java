package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {
	//classe partida de xadrez
	private Board board;
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	
	public ChessMatch() {
		//método que cria a partida
		board = new Board(8, 8); //define o tamanho do tabuleiro
		initialSetup(); //coloca as peças nas posições inciais
	}
	
	public ChessPiece[][] getPieces() {
		//Método para fazer downcasting (transformar) de Piece para ChessPiece, porque não quero que o mainPorgram acesse a Piece.
		ChessPiece[][] pieceMat = new ChessPiece[board.getRows()] [board.getColumns()];
		for (int l=0; l<board.getRows(); l++) {
			for (int c=0; c<board.getColumns(); c++) {
				pieceMat[l][c] = (ChessPiece) board.piece(l, c);
			}
		}
		return pieceMat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		//Método para posicionar as peças no início do jogo
		
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('h', 1, new Rook(board, Color.WHITE));
		placeNewPiece('b', 1, new Knight(board, Color.WHITE));
		placeNewPiece('g', 1, new Knight(board, Color.WHITE));
		placeNewPiece('c', 1, new Bishop(board, Color.WHITE));
		placeNewPiece('f', 1, new Bishop(board, Color.WHITE));
		placeNewPiece('d', 1, new Queen(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		
		for (int i=0; i<board.getColumns(); i++) {
			board.placePiece(new Pawn(board, Color.WHITE), new Position(6, i));
		}
		
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 0));
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 7));
		board.placePiece(new Knight(board, Color.BLACK), new Position(0, 1));
		board.placePiece(new Knight(board, Color.BLACK), new Position(0, 6));
		board.placePiece(new Bishop(board, Color.BLACK), new Position(0, 2));
		board.placePiece(new Bishop(board, Color.BLACK), new Position(0, 5));
		board.placePiece(new Queen(board, Color.BLACK), new Position(0, 3));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		
		for (int i=0; i<board.getColumns(); i++) {
			board.placePiece(new Pawn(board, Color.BLACK), new Position(1, i));
		}
	}
}

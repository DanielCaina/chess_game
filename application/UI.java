package application;

import chess.ChessPiece;

public class UI {
	//classe Interface de Usuário
	
	public static void printBoard(ChessPiece[][] pieces) {
		//Método que imprime o tabuleiro de xadrez
		for (int l=0; l<pieces.length; l++) {
			System.out.print((8-l)+" ");
			for (int c=0; c<pieces.length; c++) {
				printPiece(pieces[l][c]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		//método para imprimir uma peça
		if (piece == null) {System.out.print("-");}
		else {System.out.print(piece);}
		System.out.print(" ");
	}
	
}

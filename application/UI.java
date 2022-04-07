package application;

import chess.ChessPiece;
import chess.Color;

public class UI {
	//classe Interface de Usuário
	
	//Para mostrar as peças coloridas no terminal
	//Essas são as cores do texto:
	public static final String ANSI_RESET = "\u001B[0m"; //resetar cores
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	//Essas são as cores do fundo:
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	public static void printBoard(ChessPiece[][] pieces) {
		//Método que imprime o tabuleiro de xadrez
		for (int l=0; l<pieces.length; l++) {
			System.out.print(ANSI_YELLOW + (8-l) + ANSI_RESET + " ");
			for (int c=0; c<pieces.length; c++) {
				printPiece(pieces[l][c]);
			}
			System.out.println();
		}
		System.out.println(ANSI_YELLOW + "  a b c d e f g h" + ANSI_RESET);
	}
	
	private static void printPiece(ChessPiece piece) {
		//método para imprimir uma peça
		if (piece == null) {System.out.print(ANSI_YELLOW + "-" + ANSI_RESET);}
		else {
			if (piece.getColor() == Color.WHITE) {System.out.print(ANSI_WHITE + piece + ANSI_RESET);} //Imprime a peça na cor informada e reset reseta a cor.
			else {System.out.print(ANSI_RED + piece + ANSI_RESET);}
		}
		System.out.print(" ");
	}
	
}

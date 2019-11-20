package com.phonechess;

import java.util.Scanner;

import com.phonechess.factory.PieceFactory;
import com.phonechess.service.ChessPiece;
import com.phonechess.utils.PhoneChessUtils;


public class PhoneChess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        System.out.println("please Enter start number between 0-9 \n");
		String startNumber = sc.nextLine();
		System.out.println("please Enter chess Piece [queen, knight, king,rook, bishop,pawn] \n");
		String pieceName=sc.nextLine();
		PhoneChessUtils.checkValidChessPiece(pieceName);
		PhoneChessUtils.checkValidStartNumber(startNumber);
		ChessPiece piece = PieceFactory.getPiece(pieceName);
		int parseInt = Integer.parseInt(startNumber.trim());
		piece.CalculateNumberOfPossibleCombinations(parseInt);
		}

}

package com.phonechess.utils;

import java.util.Arrays;

import com.phonechess.constant.PhoneChessConstant;

public class PhoneChessUtils {

	public static  void checkValidStartNumber(String startNumber) 
	{
		if(!startNumber.matches("[0-9]")&&startNumber.isEmpty()&& PhoneChessConstant.validStartNumbers.contains(Integer.parseInt(startNumber.trim())))
		{	
			throw new IllegalArgumentException("please insert valid Number between 0-9 ");
		}
	}
	
	public static void checkValidChessPiece(String pieceName)
	{
		if(!PhoneChessConstant.validString.contains(pieceName.toLowerCase()))
		{
			throw new IllegalArgumentException("Invalid chess piece please select one of the pice [queen, knight, king,rook, bishop,pawn] ");
		}
	}
	
	public static void CalculateNumberOfPossibleCombinations(int startNumber, int[][] moves) {
		int[][] result = new int[2][10];
		int old = 0;
		int now = 0;
		Arrays.fill(result[now], 1);

		for (int i = 0; i < startNumber; ++i) {
			old = now;
			now = 1 - now;
			Arrays.fill(result[now], 0);
			for (int j = 0; j <= 9; ++j) {
				for (int k : moves[j]) {
					result[now][k] = (result[now][k] + result[old][j]);
				}
			}
		}
		int sum = 0;
		for (int i = 0; i <= 9; ++i) {
			sum = (sum + result[now][i]);
		}
		System.out.println("Possible 10 digit Number count is  :::: "+sum);
	}
}

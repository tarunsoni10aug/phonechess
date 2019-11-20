package com.phonechess.service;

import com.phonechess.constant.PhoneChessConstant;
import com.phonechess.utils.PhoneChessUtils;

public class Rook extends ChessPiece {

	public void CalculateNumberOfPossibleCombinations(int startNumber)
	{
	
		PhoneChessUtils.CalculateNumberOfPossibleCombinations(startNumber, PhoneChessConstant.ROOK_MOVES);
	}

}

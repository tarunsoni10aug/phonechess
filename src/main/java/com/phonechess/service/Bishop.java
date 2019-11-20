package com.phonechess.service;

import com.phonechess.constant.PhoneChessConstant;
import com.phonechess.utils.PhoneChessUtils;

public class Bishop extends ChessPiece {
	public void CalculateNumberOfPossibleCombinations(int startNumber)
	{
		PhoneChessUtils.CalculateNumberOfPossibleCombinations(startNumber, PhoneChessConstant.BISHOP_MOVES);
	}


}

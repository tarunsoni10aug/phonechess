package com.phonechess.service;

import com.phonechess.constant.PhoneChessConstant;
import com.phonechess.utils.PhoneChessUtils;

public class Queen extends  ChessPiece{
	
	public void CalculateNumberOfPossibleCombinations(int startNumber)
	{
		PhoneChessUtils.CalculateNumberOfPossibleCombinations(startNumber, PhoneChessConstant.QUEEN_MOVES);
	}

}

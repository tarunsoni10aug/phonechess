package com.phonechess.service;

import com.phonechess.constant.PhoneChessConstant;
import com.phonechess.utils.PhoneChessUtils;

public class Knight extends ChessPiece  {
	
	public void CalculateNumberOfPossibleCombinations(int startNumber)
	{
		if(startNumber==5)
		{
			throw new IllegalArgumentException("plese insert any other starting point  there is no possible moves from 5");
		}
		PhoneChessUtils.CalculateNumberOfPossibleCombinations(startNumber, PhoneChessConstant.KINGHT_MOVES);
	}

}

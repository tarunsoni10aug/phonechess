package com.phonechess.service;

import java.util.Arrays;
import java.util.List;

import com.phonechess.constant.PhoneChessConstant;
import com.phonechess.utils.PhoneChessUtils;

public class Pawn extends ChessPiece{

	public void CalculateNumberOfPossibleCombinations(int startNumber)
	{
		List<Integer> asList = Arrays.asList(7,8,9,0);
		if(!asList.contains(startNumber))
		{
			throw new IllegalArgumentException("possible start point for pawn is 0,8,9,7");
		}
		PhoneChessUtils.CalculateNumberOfPossibleCombinations(startNumber, PhoneChessConstant.PAWN_MOVES);
	}

}

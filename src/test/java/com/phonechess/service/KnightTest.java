package com.phonechess.service;

import org.junit.Test;

public class KnightTest {
	Knight knight= new Knight();
	@Test(expected = IllegalArgumentException.class)
	public void CalculateNumberOfPossibleCombinationsException()
	{
		knight.CalculateNumberOfPossibleCombinations(5);
	}
	@Test
	public void CalculateNumberOfPossibleCombinationsSucess()
	{
		knight.CalculateNumberOfPossibleCombinations(6);
	}
}

package com.phonechess.factory;

import java.util.HashMap;
import java.util.Map;

import com.phonechess.service.Bishop;
import com.phonechess.service.ChessPiece;
import com.phonechess.service.King;
import com.phonechess.service.Knight;
import com.phonechess.service.Pawn;
import com.phonechess.service.Queen;
import com.phonechess.service.Rook;

public class PieceFactory {
	public static ChessPiece getPiece(String piece) {
		Map<String, ChessPiece>map = new HashMap<String, ChessPiece>();
		map.put("knight", new Knight());
		map.put("king", new King());
		map.put("queen", new Queen());
		map.put("pawn", new Pawn());
		map.put("rook", new Rook());
		map.put("bishop", new Bishop());
		return map.get(piece.toLowerCase());
	}

}

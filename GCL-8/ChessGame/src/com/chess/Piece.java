package com.chess;

public abstract class Piece {
	boolean killed = false;
	boolean white = false;
	
	public boolean isKilled() {
		return killed;
	}
	public void setKilled(boolean killed) {
		this.killed = killed;
	}
	public boolean isWhite() {
		return white;
	}
	public void setWhite(boolean white) {
		this.white = white;
	}
	public abstract boolean canMove(Board board,Spot start, Spot end);
}
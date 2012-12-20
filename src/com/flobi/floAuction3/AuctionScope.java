package com.flobi.floAuction3;

public interface AuctionScope {
	
	public boolean isInScope(String playerName);
	public boolean isParticipant(String playerName);
	public boolean reclaimParticipant(String playerName);
	public void dispose();
	
	
}

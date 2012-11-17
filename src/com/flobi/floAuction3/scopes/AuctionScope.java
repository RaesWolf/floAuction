package com.flobi.floAuction3.scopes;

public interface AuctionScope {
	
	public boolean isInScope(String playerName);
	public void dispose();
	
	
}

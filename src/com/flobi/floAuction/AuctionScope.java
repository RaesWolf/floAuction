package com.flobi.floAuction;

import java.util.ArrayList;

import org.bukkit.configuration.file.FileConfiguration;

public class AuctionScope {
	public Auction activeAuction = null;
	public static ArrayList<Auction> auctionQueue = new ArrayList<Auction>();

	public static FileConfiguration config = null;
	
}

package com.flobi.floAuction3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import com.flobi.floAuction3.scopes.AuctionScope;

public class CentralProcessing implements Listener, CommandExecutor, Runnable {

	private static List<AuctionScope> scopes = new ArrayList<AuctionScope>();
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		// TODO: Make sure player has all the items they won.
	}

	@EventHandler
	public void onPlayerChangedWorld(PlayerChangedWorldEvent event){
		
	}
	@EventHandler
	public void onPlayerChangedWorld(PlayerGameModeChangeEvent event){
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO:
		

		return false;
	}

	@Override
	public void run() {
		// TODO: Force return to scope if necessary.
		// TODO: Run every certain number of tics.
	}
	
	
	public AuctionScope getPlayerScope(String playerName) {
		for (AuctionScope scope: scopes) {
			if (scope.isInScope(playerName)) return scope;
		}
		return null;
	}
	

}

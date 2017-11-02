package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private HashMap<UUID,Player> PlayersInTable = new HashMap<UUID,Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		PlayersInTable.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		PlayersInTable.remove(p.getPlayerID());		
	}
	
	public Player GetPlayerFromTable(Player p)
	{	
		return PlayersInTable.get(p.getPlayerID());
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public HashMap<UUID, Player> getPlayersInTable() {
		return PlayersInTable;
	}

	public void setPlayersInTable(HashMap<UUID, Player> playersInTable) {
		PlayersInTable = playersInTable;
	}
	
}

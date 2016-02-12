package labtest01;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
//this class is now a singleton
public class Corporation
{
	
	private Corporation(){};
	private final Corporation INSTANCE = new Corporation();
	
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
	/**
	 * 
	 * @return the unique instance of the class
	 */
	public Corporation getInstance(){
		return INSTANCE;
	}
}

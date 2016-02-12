package labtest01;

/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item  implements Cloneable
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pId, int pPrice)
	{
		aName = pName;
		aId = pId;
		aPrice = pPrice;
		// this is not fucking working
	}
	
	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	
	/**
	 * 
	 * @return a comparator for Item
	 * -1 if the second is bigger than the 1st arguments, 0 is equal, 1 otherwise
	 */
	public static Comparator<Item> getPriceComparator(){
		return new Comparator<Item>(){
			

			@Override
			public int compare(Item o1, Item o2) {
				if(o1.aPrice>o2.aPrice){
					return 1;
			}
				else if(o1.aPrice==o2.aPrice){
					return 0;
				}
				else return -1;
			}
		};
	}
	
	/**
	 * no need to deep copy any other arguments because strings and int will be deep copies
	 * @return the Item cloned
	 */
	public Item clone(){
		try {
			return ((Item) super.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}

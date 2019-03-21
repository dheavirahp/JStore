/**
 * @author Dheavira Hadina Putri
 *@version 1
*@since 28/01/2018
**/
    // instance variables - replace the example below with your own

    public class JStore
{
    
    
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        //put code in here
    }

    
    public static void main(String args[])
    {
        // put your code here
        Location lokasiku = new Location("Depok", "Jawa Barat", "Mekarsari");
        Supplier supplierku = new Supplier(1, "Dhea", "dhea@ui.ac.id", "0085712345678", lokasiku);
        Item item = new Item(1, "Handphone", 500,10000, ItemStatus.New,  ItemCategory.Electronics, supplierku);
        DatabaseItem.addItem(item);
        Transaction.orderNewItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item);
        
    }
}
/**
* @author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
**/
public class JStore
{
    public static void main(String[] args)
    {
       Location location1= new Location("Depok", "Jawa Barat", "Mekarsari");
       Supplier supplier1= new Supplier(1, "Dhea    ", "dhea@gmail.com", "085712345678",location1);
       Item item1= new Item(2, "laptop", 2, ItemStatus.New, 2000000, supplier1, ItemCategory.Electronics);
       DatabaseItem.addItem(item1);
       Transaction.orderNewItem(DatabaseItem.getItem());
       Transaction.sellItemPaid(DatabaseItem.getItem());
       Transaction.sellItemUnpaid(DatabaseItem.getItem());
       Transaction.sellItemInstallment(DatabaseItem.getItem());
       // location1.printData();
       //System.out.println("\n");
       //supplier1.printData();
       
      // Transaction transaction1 = new Transaction();
      // System.out.println("\n==========Order New Item==========\n");
      // transaction1.orderNewItem(supplier1);
       
      // System.out.println("\n==========Order Second Item==========\n");
      // transaction1.orderSecondItem(supplier1);
       
      // System.out.println("\n==========Order Refurbished Item==========\n");
       //transaction1.orderRefurbishedItem(supplier1);
       
      // System.out.println("\n==========Sell Item Paid==========\n");
      // transaction1.sellItemPaid(DatabaseItem.itemDB);
       
      // System.out.println("\n==========Sell Item Unpaid==========\n");
       //transaction1.sellItemUnpaid(DatabaseItem.itemDB);
       
      // System.out.println("\n==========Sell Item Installment==========\n");
      // transaction1.sellItemInstallment(DatabaseItem.itemDB);
       
       // Location location1= new Location("Palembang", "South Sumatera", "Beautiful Place");
       // Supplier supplier1= new Supplier(1, "Jamal", "jamalunta@gmail.com", "081996234525",location1);
       // Item item1= new Item(2, "Cardigan", 5, 50000, "Baju", supplier1);
       // Invoice invoice1= new Invoice(3, item1, "02/05/2019", 100000);
       // System.out.println(supplier1.getName());
       // supplier1.setName("Gifari");
       //System.out.println(supplier1.getName());
       // item1.printData();
       // DatabaseSupplier.addSupplier(supplier1);
    }
    
    
}
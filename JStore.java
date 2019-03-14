import java.util.*;
/**
 * 
 *
 *@author Dheavira Hadina Putri
 *@version 1
 *@since 28/01/2018
 */
public class JStore {
    public JStore(){
        
    }
  public static void main(String[] args){
      Location lokasiku = new Location("Depok", "Jawa Barat", "Mekarsari");
      Supplier supplierku = new Supplier(1, "Dhea", "dhea@gmail.com", "085712345678", lokasiku);
      
      lokasiku.printData();
      supplierku.printData();
      
      Transaction bayarku = new Transaction();
      bayarku.orderNewItem(supplierku);
      bayarku.orderSecondItem(supplierku);
      bayarku.orderRefurbishedItem(supplierku);
      bayarku.sellItemPaid(DatabaseItem.getItem());
      bayarku.sellItemUnpaid(DatabaseItem.getItem());
      bayarku.sellItemInstallment(DatabaseItem.getItem());
  }
}

/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    public void orderNewItem (Supplier supplier){
        System.out.println ("=====Order New Item=====");
        Item itemku = new Item(1,"Handphone", 2 , 5000 , ItemStatus.New, ItemCategory.Furniture ,supplier);
        Invoice bonku = new Invoice(2, itemku, InvoiceStatus.Paid ,"16-3-2019", 5000 ,1 );
        DatabaseItem.addItem(itemku);
        itemku.setStatus(ItemStatus.New);
        bonku.setInvoiceStatus(InvoiceStatus.Paid);
     
        itemku.printData();
        bonku.printData();
    }
    
    public void orderSecondItem (Supplier supplier){
        System.out.println ("=====Order Second Item=====");
        Item itemku = new Item(1,"Dhea", 2 , 5000 , ItemStatus.Second, ItemCategory.Furniture ,supplier);
        Invoice bonku = new Invoice(2, itemku, InvoiceStatus.Paid ,"16-3-2019", 5000 ,1 );
        DatabaseItem.addItem(itemku);
        itemku.setStatus(ItemStatus.Second);
        bonku.setInvoiceStatus(InvoiceStatus.Paid);
        itemku.printData();
        bonku.printData();
        
    }
    
    public void orderRefurbishedItem (Supplier supplier){
        System.out.println ("=====Order Refurbished Item=====");
        Item itemku = new Item(1,"Dhea", 2 , 5000 , ItemStatus.Refurbished, ItemCategory.Furniture ,supplier);
        Invoice bonku = new Invoice(2, itemku, InvoiceStatus.Paid ,"16-3-2019", 5000 ,1 );
        DatabaseItem.addItem(itemku);
        itemku.setStatus(ItemStatus.Refurbished);
        bonku.setInvoiceStatus(InvoiceStatus.Paid);
        itemku.printData();
        bonku.printData();
    }
    
    public void sellItemPaid (Item item){
        System.out.println ("=====Sell Item Paid=====");
        Invoice bonku = new Invoice(2, item, InvoiceStatus.Paid ,"16-3-2019", item.getPrice() ,1 );  
        bonku.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        bonku.printData();
    }
    public void sellItemUnpaid (Item item){
        System.out.println ("=====Sell Item Unpaid=====");
        Invoice bonku = new Invoice(2, item, InvoiceStatus.Unpaid ,"16-3-2019", item.getPrice() ,1 );  
        bonku.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        bonku.printData();
    }
    public void sellItemInstallment (Item item){
        System.out.println ("=====Sell Item Installment=====");
        Invoice bonku = new Invoice(2, item, InvoiceStatus.Installment ,"16-3-2019", item.getPrice() ,1 );  
        bonku.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        bonku.printData();
    }
}

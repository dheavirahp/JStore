
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    public static void orderNewItem(Item item)
    {
        Invoice bonku = new Buy_Paid(1, item, "21-03-2019", 3, item.getPrice());
        
        if (bonku instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
        
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice bonku = new Buy_Paid(1, item, "21-03-2019", 3, item.getPrice());
        
        if (bonku instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        Invoice bonku = new Buy_Paid(1, item, "21-03-2019", 3, item.getPrice());
        
        if (bonku instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    
     public static void sellItemPaid(Item item)
    {
        Invoice bonku4 = new Sell_Paid(4, item, "21-03-2019", 4, item.getPrice());
        InvoiceStatus invoicestatus4 = InvoiceStatus.Paid;
        ItemStatus itemstatus4 = ItemStatus.Sold;

        bonku4.setInvoiceStatus(invoicestatus4);
        item.setStatus(itemstatus4);
        
        item.printData();
        bonku4.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item)
    {
        Invoice bonku5 = new Sell_Unpaid(5, item, "21-03-2019", 5, item.getPrice(), 3, "25-03-2019");
        InvoiceStatus invoicestatus5 = InvoiceStatus.Unpaid;
        ItemStatus itemstatus5 = ItemStatus.Sold;

        item.setStatus(itemstatus5);

        item.printData();
        bonku5.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item)
    {
        Invoice bonku6 = new Sell_Installment(6, item, "21-03-2019", 6, item.getPrice(), 3);
        InvoiceStatus invoicestatus6 = InvoiceStatus.Installment;
        ItemStatus itemstatus6 = ItemStatus.Sold;

        item.setStatus(itemstatus6);

        item.printData();
        bonku6.printData();
    }
    
}

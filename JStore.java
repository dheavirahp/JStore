 

/**
* @author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
**/
import java.util.ArrayList;
import java.util.*;
public class JStore
{
    public static void main(String[] args){
            Location bekasi = new Location("Bekasi", "Jawa Barat", "Rumah");

            try
            {
                DatabaseSupplier.addSupplier(new Supplier("Irsyad", "irsyad@yahoo.com",
                        "081294447597", bekasi));
            }
            catch (SupplierAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }
            try
            {
                DatabaseSupplier.addSupplier(new Supplier("Gema", "gema@yahoo.com",
                        "081294447598", bekasi));
            }
            catch (SupplierAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }
            try
            {
                DatabaseSupplier.addSupplier(new Supplier("Upi", "upi@yahoo.com",
                        "081294447599", bekasi));
            }
            catch (SupplierAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }

            for(Supplier data : DatabaseSupplier.getSupplierDatabase())
            {
                data.toString();
            }

            try
            {
                DatabaseCustomer.addCustomer(new Customer("aldy", "aldy@yahoo.com",
                        "aldy", "ald1gAn", 1998, 4, 10));
            }
            catch (CustomerAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }
            try
            {
                DatabaseCustomer.addCustomer(new Customer("jati", "jati@yahoo.com",
                        "jati", "jAt1gAn", 1998, 8, 15));
            }
            catch (CustomerAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }
            try
            {
                DatabaseCustomer.addCustomer(new Customer("tina", "tina@yahoo.com",
                        "tina", "t1nAgAn", 1998, 4, 10));
            }
            catch (CustomerAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }

            for(Customer data : DatabaseCustomer.getCustomerDatabase())
            {
                data.toString();
            }

            try
            {
                DatabaseItem.addItem(new Item("Asus", ItemStatus.New, 100000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            }
            catch (ItemAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }
            try
            {
                DatabaseItem.addItem(new Item("Meja", ItemStatus.New, 1000000,DatabaseSupplier.getSupplier(1), ItemCategory.Furniture));
            }
            catch (ItemAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }
            try
            {
                DatabaseItem.addItem(new Item("buku", ItemStatus.New, 1000,DatabaseSupplier.getSupplier(1), ItemCategory.Stationery));
            }
            catch (ItemAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }

            for(Item data : DatabaseItem.getItemDatabase())
            {
                data.toString();
            }

            ArrayList<Integer> item = new ArrayList<Integer>();
            item.add(DatabaseItem.getItemFromID(1).getId());
            item.add(DatabaseItem.getItemFromID(2).getId());
            try
            {
                DatabaseInvoice.addInvoice(new Sell_Installment(item,
                        5, DatabaseCustomer.getCustomer(1)));
            }
            catch (InvoiceAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }

            ArrayList<Integer> item2 = new ArrayList<Integer>();
            item2.add(DatabaseItem.getItemFromID(1).getId());
            item2.add(DatabaseItem.getItemFromID(3).getId());
            try
            {
                DatabaseInvoice.addInvoice(new Sell_Unpaid(item2,
                        DatabaseCustomer.getCustomer(2)));
            }
            catch (InvoiceAlreadyExistsException a)
            {
                System.out.println(a.getExMessage());
            }
        }
}
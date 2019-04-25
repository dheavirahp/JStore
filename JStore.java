/**
 * @author Dheavira Hadina Putri
 *@version 1
 *@since 28/01/2018
 **/
// instance variables - replace the example below with your own

package jstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
//import java.util.ArrayList;

public class JStore
{
    public static void main(String[] args)
    {

        SpringApplication.run(JStore.class, args);

        Location location1 = new Location("Depok", "Jawa Barat", "KMekarsari");

        try {
            DatabaseSupplier.addSupplier(new Supplier(1,"Dhea","dhea@mail.com", "+6285712345", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier(1,"Vira","Vira@mail.com", "+6281212345", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier(1,"Putri","Putri@mail.com", "+6281312345", location1));
        } catch (SupplierAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item(1, "Calculator", ItemStatus.New, 1300000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item(1, "Smartphone", ItemStatus.New, 200000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item(1, "TV", ItemStatus.New, 150000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item(1, "Mouse", ItemStatus.New, 250000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
    }


    public void JStore()
    {
        //
    }

}
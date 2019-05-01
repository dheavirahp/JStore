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



        Location location1 = new Location("Depok", "Jawa Barat", "KMekarsari");

        try {
            DatabaseSupplier.addSupplier(new Supplier("Dhea","dhea@mail.com", "+6285712345", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Vira","Vira@mail.com", "+6281212345", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Putri","Putri@mail.com", "+6281312345", location1));
        } catch (SupplierAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("Calculator",1300000,  ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Smartphone", 15000,  ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("TV",150000,  ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        } catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Mouse", 250000,  ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
        } catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
        SpringApplication.run(JStore.class, args);
    }


}
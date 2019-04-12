/**
 *Class DatabaseSupplier digunakan sebagai pengolahan data yang sudah masuk
 *dari Class Supplier dan kita bisa menambahkan dan menghapus data dari
 *Class Supplier jika terjadi kesalahan dalam pemasukan informasi.
 * 
 *@author Dheavira Hadina Putri
 *@version 1
 *@since 28/01/2018
 */
import java.util.*;

public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
    }

    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean addCustomer(Customer customer)
    {
        boolean found = false;
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getName() == customer.getName() && temp.getEmail() 
            == customer.getEmail())
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static Customer getCustomer(int id)
    {
        for(Customer temp : CUSTOMER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean removeCustomer(int id)
    {
        for(Customer temp : CUSTOMER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                CUSTOMER_DATABASE.remove(temp);
                return true;
            }
        }
        return false;
    }
}

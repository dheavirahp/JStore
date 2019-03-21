import java.util.Scanner;
/**
 *Class DatabaseItem digunakan sebagai pengolahan data yang sudah masuk
 *dari Class Item dan kita bisa menambahkan dan menghapus data dari Class Item
 *Jika terjadi kesalahan dalam pemasukan informasi.
 *
 *@author Dheavira Hadina Putri
 *@version 1
 *@since 28/01/2018
 */
public class DatabaseItem{
    private String[] listItem;

    public static Item itemDB;

    private static Item item;


/**
 *
 *Meruapakan Constructor dari Object class DatabaseItem
 */
    public DatabaseItem(){
    }
/**
* Method untuk menambahkan data item kedalam list item
*
* @return    false
*/

    public static boolean addItem (Item item){
       itemDB = item;
       return false;
    }
    public boolean addItem (){
        return false;
    }
/**
* Method untuk menghapus data item dari list item
*
* @return    false
*/

    public static boolean removeItem(Item itemDB){
        return false;
    }
/**
* Method untuk mendapatkan data item dari list item
*
* @return item
*/    

    public static Item getItem(){
        return itemDB;
    }

/**
* Method untuk mengambil data item dari list item
*
* @return listItem
*/
    public String[] getItemDatabase(){
    return listItem;
}
}
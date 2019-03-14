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
<<<<<<< HEAD
    public static Item itemDB;
=======
    private static Item item;
>>>>>>> 5f05b4865031be5d9d5fb4b66bb80cd77a25f60c

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
<<<<<<< HEAD
    public static boolean addItem (Item item){
       itemDB = item;
       return false;
=======
    public boolean addItem (){
        return false;
>>>>>>> 5f05b4865031be5d9d5fb4b66bb80cd77a25f60c
    }
/**
* Method untuk menghapus data item dari list item
*
* @return    false
*/
<<<<<<< HEAD
    public static boolean removeItem(Item itemDB){
=======
    public boolean removeItem(){
>>>>>>> 5f05b4865031be5d9d5fb4b66bb80cd77a25f60c
        return false;
    }
/**
* Method untuk mendapatkan data item dari list item
*
* @return item
*/    
<<<<<<< HEAD
    public static Item getItem(){
        return itemDB;
=======
    public Item getItem (){
        return item;
>>>>>>> 5f05b4865031be5d9d5fb4b66bb80cd77a25f60c
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
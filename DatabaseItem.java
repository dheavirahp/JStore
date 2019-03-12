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
    private static Item item;


    public DatabaseItem(){
    }

    public boolean addItem (){
        return true;
    }

    public boolean removeItem(){
        return true;
    }
    
    public Item getItem (){
        return item;
    }

    public String[] getItemDatabase(){
    return listItem;
}
}


import java.util.Scanner;
/**
 *Class DatabaseSupplier digunakan sebagai pengolahan data yang sudah masuk
 *dari Class Supplier dan kita bisa menambahkan dan menghapus data dari
 *Class Supplier jika terjadi kesalahan dalam pemasukan informasi.
 * 
 *@author Dheavira Hadina Putri
 *@version 1
 *@since 28/01/2018
 */
public class DatabaseSupplier{
    private String[] listSupplier;
    private static Supplier supplier;

/**
* Meruapakan Constructor dari Object class Invoice
*/
    public DatabaseSupplier(){
    }
    /**
     * Method untuk menambahkan data supplier kedalam list
     *
     * @return    untuk memberi nilai false
     */
    public static boolean addSupplier (Supplier supplier){
        return false;
    }
/**
* Method untuk menghapus data supplier dari list
*/
    public void removeSupplier(Supplier supplier){
     
    }
/**
* Method untuk mengembalikan data supplier
*
* @return objek supplier dan mengembalikan nilai supplier
*/
    public Supplier getSupplier (){
        return supplier;
    }
/**
* Method untuk mengembalikan data supplier ke list supplier
* 
* @return list dari data supplier
*/    
    public String[] getListSupplier(){
    return listSupplier;
}
    
}
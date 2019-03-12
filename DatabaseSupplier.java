

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

    public DatabaseSupplier(){
    }

    public static boolean addSupplier (Supplier supplier){
        return true;
    }

    public boolean removeSupplier(Supplier supplier){
        return true;
    }

    public Supplier getSupplier (){
        return supplier;
    }
    
    public String[] getListSupplier(){
    return listSupplier;
}
    
}
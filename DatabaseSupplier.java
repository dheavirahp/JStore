/**
*Description of Class DatabaseSupplier here
*
*@author (Dheavira Hadina Putri)
*@version(28/01/2018)
*/

import java.util.Scanner;
public class DatabaseSupplier{
    private String[] listSupplier;
    private static Supplier supplier;

    public DatabaseSupplier(){
    }

    public static boolean addSupplier (Supplier supplier){
        return true;
    }

    public void removeSupplier(Supplier supplier){
    
    }

    public Supplier getSupplier (){
        return supplier;
    }
    
    public String[] getListSupplier(){
    return listSupplier;
}
    
}
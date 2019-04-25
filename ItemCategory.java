package jstore;
/**
* @author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
**/

public enum ItemCategory
{
    Electronics("Electronics"), Furniture("Furniture"), Stationery("Stationary");
    
    private String description;
    
    private ItemCategory(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}

package jstore;
/**
* @author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
**/

public enum ItemStatus
{
    New("New"), Second("Second"), Refurbished("Refurbished"), Sold("Sold");
    
    private String description;
    
    private ItemStatus(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}


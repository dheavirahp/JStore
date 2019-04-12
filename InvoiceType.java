/**
* @author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
**/
public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
    
    private String description;
    
    private InvoiceType(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}
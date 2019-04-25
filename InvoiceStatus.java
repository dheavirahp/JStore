package jstore;
/**
* @author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
**/

public enum InvoiceStatus
{
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");
    
    private String description;
    
    private InvoiceStatus(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}

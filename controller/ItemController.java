package jstore.controller;
import java.util.ArrayList;

import jstore.DatabaseItem;
import jstore.Item;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public class ItemController {

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ArrayList<Item> itemsList() {
        ArrayList<Item> tempDatabaseItem = DatabaseItem.getItemDatabase();
        return tempDatabaseItem;
    }

    @RequestMapping(value = "/items/{id_item}", method = RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id) {
        Item tempItem = DatabaseItem.getItemFromID(id);
        return tempItem;
    }

}

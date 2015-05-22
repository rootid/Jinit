package com.interfaceDP.factory;

import com.interfaceDP.Book;
import com.interfaceDP.CD;
import com.interfaceDP.Cosmetics;
import com.interfaceDP.Item;
import com.interfaceDP.ItemException;


/***
* GoodsFactory responsible for creating Item objects like CD, Book, and Cosmetics etc 
***/
public class GoodsFactory extends ItemFactory {

    //protected so that only ItemFactorySelector within this package can 
    //instantiate it to provide a single point of access
    protected GoodsFactory() { 
    
    } 

   //(i.e. singleton).
   //Factory method, which decides how to create Items.
   //Benefits are: -- loosely-couples the client (i.e. ShoppingBasketBuilder class) from Items such
   //as CD, Book, and Cosmetics etc. In future if we need to create a Book item, which is imported,
   //we can easily incorporate this by adding a new item.TYPE_BOOK_IMPORTED and subsequently 
   //dding  following piece of code as shown:
   // else if(itemType == TYPE_BOOK_IMPORTED){
   //     item = new Book(description, qty,price);
   //     item.setIsImported(true);
    public Item getItem(int itemType, String description
    		, int qty, double price) throws ItemException
    {
        Item item = null; //code to interface 
        if (itemType == Item.TYPE_BOOK) {
            item = new Book(description, qty, price);
       } else if (itemType == Item.TYPE_CD) {
            item = new CD(description, qty, price);
       } else if (itemType == Item.TYPE_CD_IMPORTED) {
            item = new CD(description, qty, price);
            item.setImported(true);
       } else if (itemType == Item.TYPE_COSMETICS) {
            item = new Cosmetics(description, qty, price);
       } else {
            throw new ItemException("Invalid ItemType=" + itemType);
      }
        return item; //returned object is referred by its interface instead of by its implementation 
    }
}

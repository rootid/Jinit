package com.interfaceDP.factory;

import com.interfaceDP.Item;
import com.interfaceDP.ItemException;

/* ItemFactory is responsible for creating Item objects like CD, Book, and Cosmetics etc */
public abstract class ItemFactory {
    
    public abstract Item getItem(int itemType, String description
            , int qty, double price) throws  ItemException;

}

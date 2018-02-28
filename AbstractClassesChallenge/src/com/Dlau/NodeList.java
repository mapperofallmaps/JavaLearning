package com.Dlau;

/**
 * Created by Daniel on 6/09/2017.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}

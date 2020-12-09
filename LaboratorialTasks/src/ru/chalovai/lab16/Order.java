package ru.chalovai.lab16;

public interface Order {
    public boolean add(MenuItem item);
    public String[] itemsNames();
    public int itemQuantity();
    public int itemQuantity(String itemName);
    public int itemQuantity(MenuItem menuItem);
    public MenuItem[] getItems();
    public boolean remove(String itemName);
    public boolean removeAll(MenuItem item);
    public MenuItem[] sortedItemsByCostDesc();
    public int priceTotal();

}

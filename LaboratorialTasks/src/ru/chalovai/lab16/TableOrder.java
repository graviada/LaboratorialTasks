package ru.chalovai.lab16;

public class TableOrder implements Order {
    private int size;
    private final  int size_mas = 10;
    private int position;
    private MenuItem mials[];

    public TableOrder(){
        this.mials=new MenuItem[size_mas];
        position =0;
    }

    public boolean add(MenuItem item) {
        mials[position] = item;
        position++;
        return true;
    }

    public boolean checkName(String name,String[] names){

        for(String item:names){
            if(item!=null)
                if(item.equals(name)) return  false;
        }
        return  true;
    }
    public String[] itemsNames() {
        String[] name= new String[size];
        int pozition=0;

        for(MenuItem item :mials) {
            if (item != null) {
                if (this.checkName(item.getName(),name) && item.getName()!=null) {
                    name[pozition] = item.getName();
                    pozition++;
                }
            }
        }
        return name;
    }

    public int itemQuantity() {
        int kol=0;
        for (MenuItem mial : mials) {
            if (mial != null) kol++;
        }
        return kol;
    }

    public int itemQuantity(String itemName) {
        int kol=0;
        for(MenuItem item: mials) {

            if (item!= null) {
                if (item.getName().equals(itemName)) kol++;
            }
        }
        return kol;
    }

    public int itemQuantity(MenuItem menuItem) {
        return 0;
    }

    public MenuItem[] getItems() {
        return mials;
    }

    public boolean remove(String itemName) {
        int kol=0;
        for(int i=0;i< mials.length;i++){
            if(mials[i].getName().equals(itemName)){
                mials[i]=null;
                kol++;
            }
        }
        return true;
    }

    public boolean removeAll(MenuItem item) {
        return false;
    }

    public MenuItem[] sortedItemsByCostDesc() {
        for (int i = 0; i < mials.length; i++) {


            MenuItem min = mials[i];
            int min_i = i;

            for (int j = i+1; j < mials.length; j++) {

                if (mials[j] != null) {
                    if (mials[j].getPrice() < min.getPrice()) {
                        min = mials[j];
                        min_i = j;
                    }
                }
            }

            if (i != min_i) {
                MenuItem tmp = mials[i];
                mials[i] = mials[min_i];
                mials[min_i] = tmp;
            }
        }

        return this.mials;
    }


    public int priceTotal() {
        int price = 0;
        for(MenuItem item:mials){
            if(item!=null)
                price += item.getPrice();
        }
        return price;
    }
}

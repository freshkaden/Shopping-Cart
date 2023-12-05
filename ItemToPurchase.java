public class ItemToPurchase {


    private String itemName = "none";
    private int itemPrice = 0;
    private int itemQuantity = 0;
    private int totalPrice = 0;
    
    public void setName(String itemName){
        this.itemName = itemName;

    }

    public String getName(){
        return itemName;
    }



    public void setPrice(int itemPrice){
        this.itemPrice = itemPrice;
    }

    public int getPrice(){
        return itemPrice;
    }



    public void setQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }

    public int getQuantity(){
        return itemQuantity;
    }



    public int getTotalPrice(){
        totalPrice = itemPrice * itemQuantity;
        return totalPrice;
    }
}


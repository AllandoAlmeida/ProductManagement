package product;

public class ProductModel {
    private String barCode; 
    private String name;
    private int priceInCents;
    private int stock; 

    public String getBarCode() {
        return this.barCode;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPriceInCents() {
        return this.priceInCents;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPriceInCents(Integer newPriceInCents) {
        this.priceInCents = newPriceInCents;
    }

    public void setStock(Integer newStock) {
        this.stock = newStock;
    }
    
}

public abstract class Gadget {
    private String maker;
    private String model;
    private int price;
    private int stock;

    public Gadget(int stock, int price, String model, String maker) {
        this.stock = stock;
        this.price = price;
        this.model = model;
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
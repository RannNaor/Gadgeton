public class Headphone extends Gadget{
    private int range;

    public Headphone(int stock, int price, String model, String maker, int range) {
        super(stock, price, model, maker);
        this.range = range;
    }
}
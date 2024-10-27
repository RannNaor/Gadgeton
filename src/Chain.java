public class Chain {
    private Shop[] shops;

    public Chain() {
        this.shops = new Shop[50];
    }

    public int getStockValue()
    {
        int sum = 0;

        for (Shop shop : shops) {
            sum += shop.getStockValue();
        }

        return sum;
    }
}
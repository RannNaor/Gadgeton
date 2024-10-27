public class Shop {
    private Gadget[] gadgets;

    public Shop(Gadget[] gadgets) {
        this.gadgets = gadgets;
    }

    public int getStockValue()
    {
        int sum = 0;

        for (Gadget gadget : gadgets) {
            sum += gadget.getStock() * gadget.getPrice();
        }

        return sum;
    }

    public String[] getModels(int maxLimit)
    {
        String[] models = new String[gadgets.length];

        for (int i = 0; i < gadgets.length; i++) {
            if(gadgets[i].getStock() < maxLimit)
            {
                models[i] = gadgets[i].getModel();
            }
        }

        return models;
    }
}
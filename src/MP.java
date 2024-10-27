public abstract class MP extends Gadget{
    private boolean hasRadio;
    private boolean hasSpeaker;

    public MP(int stock, int price, String model, String maker, boolean hasRadio, boolean hasSpeaker) {
        super(stock, price, model, maker);
        this.hasRadio = hasRadio;
        this.hasSpeaker = hasSpeaker;
    }
}
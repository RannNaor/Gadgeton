public class MP3 extends MP{
    private int screenWidth;

    public MP3(int stock, int price, String model, String maker, boolean hasRadio, boolean hasSpeaker, int screenWidth) {
        super(stock, price, model, maker, hasRadio, hasSpeaker);
        this.screenWidth = screenWidth;
    }
}
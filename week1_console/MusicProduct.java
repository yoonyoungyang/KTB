public class MusicProduct extends Product {
    private Music music;
    private String mediaType;

    public MusicProduct(int id, String name, int price, Music music, String mediaType) {
        super(id, name, price);
        this.music = music;
        this.mediaType = mediaType;
    }

    public String getProductInfo() {
        return music.getMusicInfo() + " " + mediaType;
    }
}
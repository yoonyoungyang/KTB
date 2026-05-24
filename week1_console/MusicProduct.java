public class MusicProduct extends Product {
    private Music music;
    private MediaType mediaType;

    public MusicProduct(int id, String name, int price, Music music, MediaType mediaType) {
        super(id, name, price);
        this.music = music;
        this.mediaType = mediaType;
    }

    public String getProductInfo() {
        return music.getMusicInfo() + " " + mediaType.getDisplayName();
    }
}
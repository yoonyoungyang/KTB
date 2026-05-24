import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class ProductCatalog {
    private final List<Music> musics;

    public ProductCatalog() {
        this.musics = new ArrayList<>();
        musics.add(new Music("NewJeans", "Ditto"));
        musics.add(new Music("IVE", "LOVE DIVE"));
        musics.add(new Music("aespa", "Next Level"));
        musics.add(new Music("IU", "Celebrity"));
        musics.add(new Music("BTS", "Dynamite"));
        musics.add(new Music("The Weeknd", "Blinding Lights"));
        musics.add(new Music("Olivia Rodrigo", "drivers license"));
        musics.add(new Music("Harry Styles", "As It Was"));
        musics.add(new Music("Miley Cyrus", "Flowers"));
        musics.add(new Music("Sabrina Carpenter", "Espresso"));

        this.goodsPriceMap = new EnumMap<>(GoodsType.class);
        goodsPriceMap.put(GoodsType.POSTER, 5000);
        goodsPriceMap.put(GoodsType.STICKER_SMALL, 2000);
        goodsPriceMap.put(GoodsType.STICKER_MEDIUM, 3000);
        goodsPriceMap.put(GoodsType.STICKER_LARGE, 5000);
        goodsPriceMap.put(GoodsType.NONE, 0);

        this.musicProductPriceTable = new ArrayList<>();

        musicProductPriceTable.add(createMediaPriceMap(50000, 10000, 9000));
        musicProductPriceTable.add(createMediaPriceMap(45000, 9500, 8500));
        musicProductPriceTable.add(createMediaPriceMap(40000, 9000, 8000));
        musicProductPriceTable.add(createMediaPriceMap(35000, 8500, 7500));
        musicProductPriceTable.add(createMediaPriceMap(30000, 8000, 7000));
        musicProductPriceTable.add(createMediaPriceMap(25000, 7500, 6500));
        musicProductPriceTable.add(createMediaPriceMap(20000, 7000, 6000));
        musicProductPriceTable.add(createMediaPriceMap(15000, 6500, 5500));
        musicProductPriceTable.add(createMediaPriceMap(12000, 6000, 5000));
        musicProductPriceTable.add(createMediaPriceMap(10000, 5000, 4000));
    }

    public int getMusicProductPrice(int musicNumber, MediaType mediaType) {
        EnumMap<MediaType, Integer> priceMap = musicProductPriceTable.get(musicNumber - 1);
        return priceMap.get(mediaType);
    }

    public int getGoodsPrice(GoodsType goodsType) {
        return goodsPriceMap.get(goodsType);
    }

    private EnumMap<MediaType, Integer> createMediaPriceMap(
            int lpPrice,
            int cdPrice,
            int cassettePrice) {
        EnumMap<MediaType, Integer> mediaPriceMap = new EnumMap<>(MediaType.class);
        mediaPriceMap.put(MediaType.LP, lpPrice);
        mediaPriceMap.put(MediaType.CD, cdPrice);
        mediaPriceMap.put(MediaType.CASSETTE_TAPE, cassettePrice);

        return mediaPriceMap;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public Music getMusicByNumber(int number) {
        return musics.get(number - 1);
    }

    public MediaType[] getMediaTypes() {
        return MediaType.values();
    }

    public MediaType getMediaTypeByNumber(int number) {
        MediaType[] mediaTypes = MediaType.values();
        return mediaTypes[number - 1];
    }

    public GoodsType[] getGoodsTypes() {
        return GoodsType.values();
    }

    public GoodsType getGoodsTypeByNumber(int number) {
        GoodsType[] goodsTypes = GoodsType.values();
        return goodsTypes[number - 1];
    }

    private final List<EnumMap<MediaType, Integer>> musicProductPriceTable;
    private final EnumMap<GoodsType, Integer> goodsPriceMap;

    public int createMusicProductId(int musicNumber) {
        return 100 + musicNumber;
    }

    public int createGoodsProductId(int goodsNumber) {
        return 200 + goodsNumber;
    }

}

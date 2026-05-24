import java.util.ArrayList;
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
        MediaType[] MediaTypeByNumber = MediaType.values();
        return MediaTypeByNumber[number - 1];
        // MediaType.values()를 변수에 담기
        // number - 1 위치의 값 반환
    }

}

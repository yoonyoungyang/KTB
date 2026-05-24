public class GoodsProduct extends Product {
    private Music music;
    private GoodsType goodsType;

    public GoodsProduct(int id, String name, int price, Music music, GoodsType goodsType) {
        super(id, name, price);
        this.music = music;
        this.goodsType = goodsType;
    }

    public String getProductInfo() {
        return music.getMusicInfo() + " " + goodsType.getDisplayName();
    }
}
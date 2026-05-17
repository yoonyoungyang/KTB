public class GoodsProduct extends Product {
    private Music music;
    private String goodsType;

    public GoodsProduct(int id, String name, int price, Music music, String goodsType) {
        super(id, name, price);
        this.music = music;
        this.goodsType = goodsType;
    }

    public String getProductInfo() {
        return goodsType;
    }
}
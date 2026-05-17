public class Order {
    private MusicProduct musicProduct;
    private GoodsProduct goodsProduct;
    private int totalPrice;

    public Order(MusicProduct musicProduct, GoodsProduct goodsProduct) {
        this.musicProduct = musicProduct;
        this.goodsProduct = goodsProduct;
        this.totalPrice = calculateTotalPrice();
    }

    public int calculateTotalPrice() {
        return musicProduct.getPrice() + goodsProduct.getPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getOrderInfo() {
        return "선택하신 물품은 "
                + musicProduct.getProductInfo()
                + " + "
                + goodsProduct.getProductInfo()
                + "이며, 가격은 "
                + totalPrice
                + "원입니다.";
    }
}
public class Order {
    private MusicProduct musicProduct;
    private GoodsProduct goodsProduct;
    private int totalPrice;

    public Order(MusicProduct musicProduct, GoodsProduct goodsProduct, int totalPrice) {
        this.musicProduct = musicProduct;
        this.goodsProduct = goodsProduct;
        this.totalPrice = totalPrice;
    }

    public int calculateTotalPrice() {
        totalPrice = musicProduct.getPrice() + goodsProduct.getPrice();
        return totalPrice;
    }

    public String getOrderInfo() {
        return "선택하신 물품은 " + musicProduct.getProductInfo() + " + " + goodsProduct.getProductInfo() + "이며, 가격은 "
                + totalPrice + "원입니다.";
    }
}
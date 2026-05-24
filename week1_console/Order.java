public class Order {
    private MusicProduct musicProduct;
    private GoodsProduct goodsProduct;

    public Order(MusicProduct musicProduct, GoodsProduct goodsProduct) {
        this.musicProduct = musicProduct;
        this.goodsProduct = goodsProduct;
    }

    public int calculateTotalPrice() {
        int totalPrice = musicProduct.getPrice() + goodsProduct.getPrice();
        return totalPrice;
    }

    public String getOrderInfo() {
        return "선택하신 물품은 " + musicProduct.getProductInfo() + " + " + goodsProduct.getProductInfo() + "이며, 가격은 "
                + calculateTotalPrice() + "원입니다.";
    }
}
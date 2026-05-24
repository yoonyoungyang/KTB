import java.util.List;

public class OutputView {
    public void printStartMessage() {
        System.out.println("===== 음악 상품 구매 프로그램 =====");
        System.out.println();
    }

    public void printMusicList(List<Music> musics) {
        System.out.println("구매할 음악을 골라주세요.");
        for (int i = 0; i < musics.size(); i++) {
            System.out.println((i + 1) + ". " + musics.get(i).getMusicInfo());
        }
    }

    public void printSelectedMusic(Music selectedMusic) {
        System.out.println("선택하신 음원은" + selectedMusic.getMusicInfo() + "입니다.");

    }

    public void printMediaTypeList(MediaType[] mediaTypes, int musicNumber, ProductCatalog productCatalog) {
        System.out.println();
        System.out.println("음악을 받을 방식을 선택해주세요.");
        for (int i = 0; i < mediaTypes.length; i++) {
            System.out.println((i + 1) + ". " + mediaTypes[i].getDisplayName() + " - "
                    + productCatalog.getMusicProductPrice(musicNumber, mediaTypes[i]) + "원");
        }
    }

    public void printSelectedMedia(MediaType selectedMediaType) {
        System.out.println("선택하신 방식은" + selectedMediaType.getDisplayName() + "입니다.");
    }

    public void printGoodsTypeList(GoodsType[] goodsTypes, ProductCatalog productCatalog) {
        System.out.println();
        System.out.println("굿즈 상품을 골라주세요.");
        for (int i = 0; i < goodsTypes.length; i++) {
            System.out
                    .println((i + 1) + ". " + goodsTypes[i].getDisplayName()
                            + " - " + productCatalog.getGoodsPrice(goodsTypes[i]) + "원");
        }
    }

    public void printSelectedGoods(GoodsType selectedGoodsType) {
        System.out.println("선택하신 굿즈 상품은" + selectedGoodsType.getDisplayName());
    }

    public void printOrderInfo(Order order) {
        System.out.println();
        System.out.println(order.getOrderInfo());
        System.out.println("넣으실 금액을 입력해주세요.");
    }

    public void printLackMoneyMessage(int lackMoney) {
        System.out.println();
        System.out.println(lackMoney + "원의 금액이 부족합니다. 총 금액 이상을 다시 입력해주세요.");
        System.out.print("추가 금액 입력: ");
    }

    public void printChange(int change) {
        System.out.println();
        System.out.println("남은 금액 " + change + "원을 반환해드립니다.");

    }

    public void printPaymentComplete() {
        System.out.println();
        System.out.println("결제가 완료되었습니다.");
    }

    public void printFinishMessage() {
        System.out.println("===== 음악 상품 구매 프로그램 종료 =====");
        System.out.println();

    }
}

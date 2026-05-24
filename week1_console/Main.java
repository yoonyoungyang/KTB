import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mediaTypes = { "LP", "CD", "Cassette Tape" };

        int[][] musicPrices = {
                { 50000, 10000, 9000 },
                { 45000, 9500, 8500 },
                { 40000, 9000, 8000 },
                { 35000, 8500, 7500 },
                { 30000, 8000, 7000 },
                { 25000, 7500, 6500 },
                { 20000, 7000, 6000 },
                { 15000, 6500, 5500 },
                { 12000, 6000, 5000 },
                { 10000, 5000, 4000 }
        };

        System.out.println("===== 음악 상품 구매 프로그램 =====");
        System.out.println();

        System.out.println("구매할 음악을 골라주세요.");
        for (int i = 0; i < musicList.length; i++) {
            System.out.println((i + 1) + ". " + musicList[i].getMusicInfo());
        }

        System.out.print("선택값(1~10): ");
        int musicChoice = scanner.nextInt();

        while (musicChoice < 1 || musicChoice > 10) {
            System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            System.out.print("선택값(1~10): ");
            musicChoice = scanner.nextInt();
        }

        Music selectedMusic = musicList[musicChoice - 1];

        System.out.println();
        System.out.println("음악을 받을 방식을 선택해주세요.");
        for (int i = 0; i < mediaTypes.length; i++) {
            System.out.println((i + 1) + ". " + mediaTypes[i]);
        }

        System.out.print("선택값(1~3): ");
        int mediaChoice = scanner.nextInt();

        while (mediaChoice < 1 || mediaChoice > 3) {
            System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            System.out.print("선택값(1~3): ");
            mediaChoice = scanner.nextInt();
        }

        String selectedMediaType = mediaTypes[mediaChoice - 1];
        int selectedMusicPrice = musicPrices[musicChoice - 1][mediaChoice - 1];

        MusicProduct selectedMusicProduct = new MusicProduct(
                musicChoice,
                selectedMusic.getMusicInfo() + " " + selectedMediaType,
                selectedMusicPrice,
                selectedMusic,
                selectedMediaType);

        GoodsProduct[] goodsList = {
                new GoodsProduct(1, "Poster", 5000, selectedMusic, "Poster"),
                new GoodsProduct(2, "Sticker Small", 2000, selectedMusic, "Sticker Small"),
                new GoodsProduct(3, "Sticker Medium", 3000, selectedMusic, "Sticker Medium"),
                new GoodsProduct(4, "Sticker Large", 5000, selectedMusic, "Sticker Large"),
                new GoodsProduct(5, "선택 안 함", 0, selectedMusic, "선택 안 함")
        };

        System.out.println();
        System.out.println("부가 상품을 골라주세요.");
        for (int i = 0; i < goodsList.length; i++) {
            System.out.println((i + 1) + ". "
                    + goodsList[i].getProductInfo()
                    + " - "
                    + goodsList[i].getPrice()
                    + "원");
        }

        System.out.print("선택값(1~5): ");
        int goodsChoice = scanner.nextInt();

        while (goodsChoice < 1 || goodsChoice > 5) {
            System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            System.out.print("선택값(1~5): ");
            goodsChoice = scanner.nextInt();
        }

        GoodsProduct selectedGoodsProduct = goodsList[goodsChoice - 1];

        Order order = new Order(selectedMusicProduct, selectedGoodsProduct);

        System.out.println();
        System.out.println(order.getOrderInfo());

        System.out.print("투입할 금액 입력: ");
        int inputMoney = scanner.nextInt();

        Payment payment = new Payment(order, inputMoney);

        while (!payment.isEnoughMoney()) {
            System.out.println();
            System.out.println("금액이 부족합니다. 총 금액 이상을 다시 입력해주세요.");
            System.out.print("추가 금액 입력: ");

            int additionalMoney = scanner.nextInt();
            inputMoney += additionalMoney;

            payment = new Payment(order, inputMoney);
        }

        System.out.println();
        System.out.println("결제가 완료되었습니다.");

        if (payment.getChange() > 0) {
            System.out.println("남은 금액 " + payment.getChange() + "원을 반환해드립니다.");
        }

        System.out.println("프로그램을 종료합니다.");

        scanner.close();
    }
}
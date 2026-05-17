import java.util.Scanner; // 입력값을 받으려면 java.util.Scanner를 임포트해야만 함

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LP 가게 시작!");
        String[] singer = { "NewJeans", "IVE", "aespa", "IU", "BTS", "The Weeknd", "Olivia Rodrigo", "Harry Styles",
                "Miley Cyrus", "Sabrina Carpenter" };
        String[] songName = { "Ditto", "LOVE DIVE", "Next Level", "Celebrity", "Dynamite", "Blinding Lights",
                "drivers license", "As It Was", "Flowers", "Espresso" };
        String[] musicProduct = { "LP", "CD", "Cassette Tape" };
        String[] goodsProduct = { "Poster", "Sticker Small", "Sticker Medium", "Sticker Large", "선택 안 함" };
        int[] lpPrice = { 50000, 45000, 40000, 35000, 30000, 25000, 20000, 15000, 12000, 10000 };
        int[] cdPrice = { 10000, 9500, 9000, 8500, 8000, 7500, 7000, 6500, 6000, 5000 };
        int[] cassettePrice = { 9000, 8500, 8000, 7500, 7000, 6500, 6000, 5500, 5000, 4000 };
        int[] goodsPrice = { 5000, 2000, 3000, 5000, 0 };
        int musicPrice = 0;
        System.out.println("구매할 음악을 골라주세요.");
        for (int i = 0; i < singer.length; i++) {
            System.out.println((i + 1) + ". " + singer[i] + " - " + songName[i]);
        }
        System.out.print("선택값(1~10): ");
        int choice = scanner.nextInt();
        while (true) {
            if (choice >= 1 && choice <= 10) {
                System.out.println("선택하신 음악은 " + singer[choice - 1] + " - " + songName[choice - 1] + "입니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                System.out.print("선택값(1~10): ");
                choice = scanner.nextInt();
            }
        }
        System.out.println("음악을 받을 방식을 선택해주세요.");
        for (int i = 0; i < musicProduct.length; i++) {
            System.out.println((i + 1) + ". " + musicProduct[i]);
        }
        System.out.print("선택값(1~3): ");
        int productChoice = scanner.nextInt();
        while (true) {
            if (productChoice >= 1 && productChoice <= 3) {
                System.out.println("선택하신 방식은 " + musicProduct[productChoice - 1] + "입니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                System.out.print("선택값(1~3): ");
                productChoice = scanner.nextInt();
            }
        }
        System.out.println("구매할 상품을 선택해주세요.");
        for (int i = 0; i < goodsProduct.length; i++) {
            System.out.println((i + 1) + ". " + goodsProduct[i]);
        }
        System.out.print("선택값(1~5): ");
        int goodsChoice = scanner.nextInt();
        while (true) {
            if (goodsChoice >= 1 && goodsChoice <= 5) {
                System.out.println("선택하신 상품은 " + goodsProduct[goodsChoice - 1] + "입니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                System.out.print("선택값(1~5): ");
                goodsChoice = scanner.nextInt();
            }
        }
        if (productChoice == 1) {
            musicPrice = lpPrice[choice - 1];
        } else if (productChoice == 2) {
            musicPrice = cdPrice[choice - 1];
        } else if (productChoice == 3) {
            musicPrice = cassettePrice[choice - 1];
        }
        int totalPrice = musicPrice + goodsPrice[goodsChoice - 1];
        System.out.println("선택하신 물품은 " + singer[choice - 1] + " - " + songName[choice - 1] + " "
                + musicProduct[productChoice - 1] + " + " + goodsProduct[goodsChoice - 1] + "입니다.");
        System.out.println("총 가격은 " + totalPrice + "원입니다.");
        System.out.println("돈을 넣어주세요.");
        System.out.print("넣은 돈: ");
        int inputMoney = scanner.nextInt();
        while (true) {
            if (inputMoney < totalPrice) {
                System.out.println("돈이 부족합니다. 돈을 더 넣어주세요.");
                System.out.print("추가 입력값: ");
                inputMoney += scanner.nextInt();
            } else if (inputMoney == totalPrice) {
                System.out.println("결제가 완료되었습니다. 감사합니다!");
                break;
            } else if (inputMoney > totalPrice) {
                int change = inputMoney - totalPrice;
                System.out.println("결제가 완료되었습니다. 거스름돈은 " + change + "원입니다. 감사합니다!");
                break;
            }
        }
        scanner.close();
    }
}

import java.util.Scanner; // 입력값을 받으려면 java.util.Scanner를 임포트해야만 함

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("LP 가게 시작!");
        String[] singer = {"NewJeans", "IVE", "aespa", "IU", "BTS", "The Weeknd", "Olivia Rodrigo", "Harry Styles", 
        "Miley Cyrus", "Sabrina Carpenter"};
        String[] songName = {"Ditto", "LOVE DIVE", "Next Level", "Celebrity", "Dynamite", "Blinding Lights", "drivers license", "As It Was", "Flowers", "Espresso"};
        String[] musicProduct = {"LP", "CD", "Cassette Tape"};
        System.out.println("구매할 음악을 골라주세요.");
        for (int i=0; i<singer.length; i++) {
            System.out.println((i+1) + ". " + singer[i] + " - " + songName[i]);
        }
        System.out.print("선택값(1~10): ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= 10) {
            System.out.println("구매하신 음악은 " + singer[choice-1] + " - " + songName[choice-1] + "입니다.");
        } else {
            System.out.println("잘못된 선택입니다.");
        }
        System.out.println("음악을 받을 방식을 선택해주세요.");
        for (int i=0; i<musicProduct.length; i++) {
            System.out.println((i+1) + ". " + musicProduct[i]);
        }
        System.out.print("선택값(1~3): ");
        int productChoice = scanner.nextInt();
        if (productChoice >= 1 && productChoice <= 3) {
            System.out.println("선택하신 방식은 " + musicProduct[productChoice-1] + "입니다.");
        } else {
            System.out.println("잘못된 선택입니다.");
        }



    }
}

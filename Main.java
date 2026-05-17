public class Main {
    public static void main(String[] args) {
        System.out.println("LP 가게 시작!");
        String[] singer = {"NewJeans", "IVE", "aespa", "IU", "BTS", "The Weeknd", "Olivia Rodrigo", "Harry Styles", 
        "Miley Cyrus", "Sabrina Carpenter"};
        String[] songName = {"Ditto", "LOVE DIVE", "Next Level", "Celebrity", "Dynamite", "Blinding Lights", "drivers license", "As It Was", "Flowers", "Espresso"};
        System.out.println("구매할 음악을 골라주세요.");
        for (int i=0; i<singers.length; i++) {
            System.out.println((i+1) + ". " + singers[i] + " - " + songName[i]);
        }
    }
}
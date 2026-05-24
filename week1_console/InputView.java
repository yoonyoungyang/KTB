import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public int inputMusicNumber() {
        return inputNumberInRange("선택값(1~10): ", 1, 10);
    }

    public int inputMediaNumber() {
        return inputNumberInRange("선택값(1~3): ", 1, 3);

    }

    public int inputGoodsNumber() {
        return inputNumberInRange("선택값(1~5): ", 1, 5);
    }

    public int inputMoney() {
        return inputPositiveNumber("투입할 금액 입력: ");
    }

    public int inputAdditionalMoney() {
        return inputPositiveNumber("더 넣을 금액 입력: ");
    }

    private int inputNumberInRange(String message, int min, int max) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.println(min + "부터" + max + "까지의 숫자를 입력해주세요.");
                    continue;
                }
                return number;

            } catch (NumberFormatException e) {
                System.err.println("숫자만 입력해주세요.");
            }
        }
    }

    private int inputPositiveNumber(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                if (number <= 0) {
                    System.out.println("1원 이상의 금액을 입력해주세요");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요. ");
            }

        }
    }

}

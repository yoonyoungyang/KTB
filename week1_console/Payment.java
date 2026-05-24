public class Payment {
    private Order order;
    private int inputMoney;

    public Payment(Order order, int inputMoney) {
        this.order = order;
        this.inputMoney = inputMoney;
    }

    public boolean isEnoughMoney() {
        return inputMoney >= order.calculateTotalPrice();
    }

    public int getChange() {
        return inputMoney - order.calculateTotalPrice();
    }

    public int addMoney(int additionalMoney) {
        return inputMoney += additionalMoney;
    }

    public int getLackMoney() {
        return order.calculateTotalPrice() - inputMoney;
    }
}
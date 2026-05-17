public class Payment {
    private Order order;
    private int inputMoney;

    public Payment(Order order, int inputMoney) {
        this.order = order;
        this.inputMoney = inputMoney;
    }

    public boolean isEnoughMoney() {
        return inputMoney >= order.getTotalPrice();
    }

    public int getChange() {
        return inputMoney - order.getTotalPrice();
    }
}
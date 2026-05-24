public class ConsoleState {
    private volatile boolean inputInProgress = false;

    public void startInput() {
        inputInProgress = true;
    }

    public void finishInput() {
        inputInProgress = false;
    }

    public boolean isInputInProgress() {
        return inputInProgress;
    }
}
public class Main {

    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        StoreMusicTask storeMusicTask = new StoreMusicTask(productCatalog.getMusics());
        Thread musicThread = new Thread(storeMusicTask);
        musicThread.start();

        outputView.printStartMessage();

        outputView.printMusicList(productCatalog.getMusics());
        int musicNumber = inputView.inputMusicNumber();
        Music selectedMusic = productCatalog.getMusicByNumber(musicNumber);
        outputView.printSelectedMusic(selectedMusic);

        outputView.printMediaTypeList(productCatalog.getMediaTypes(), musicNumber, productCatalog);
        int mediaNumber = inputView.inputMediaNumber();
        MediaType selectedMedia = productCatalog.getMediaTypeByNumber(mediaNumber);
        outputView.printSelectedMedia(selectedMedia);

        outputView.printGoodsTypeList(productCatalog.getGoodsTypes(), productCatalog);
        int goodsNumber = inputView.inputGoodsNumber();
        GoodsType selectedGoods = productCatalog.getGoodsTypeByNumber(goodsNumber);
        outputView.printSelectedGoods(selectedGoods);

        int musicPrice = productCatalog.getMusicProductPrice(musicNumber, selectedMedia);
        int selectedMusicProductId = productCatalog.createMusicProductId(musicNumber);

        MusicProduct musicProduct = new MusicProduct(selectedMusicProductId, selectedMedia.getDisplayName(), musicPrice,
                selectedMusic, selectedMedia);

        int goodsPrice = productCatalog.getGoodsPrice(selectedGoods);
        int selectedGoodsId = productCatalog.createGoodsProductId(goodsNumber);
        GoodsProduct goodsProduct = new GoodsProduct(selectedGoodsId, selectedGoods.getDisplayName(), goodsPrice,
                selectedMusic, selectedGoods);
        Order order = new Order(musicProduct, goodsProduct);
        outputView.printOrderInfo(order);

        int inputMoney = inputView.inputMoney();

        Payment payment = new Payment(order, inputMoney);
        while (!payment.isEnoughMoney()) {
            int lackMoney = payment.getLackMoney();
            outputView.printLackMoneyMessage(lackMoney);
            int additionalMoney = inputView.inputAdditionalMoney();
            payment.addMoney(additionalMoney);
        }
        outputView.printPaymentComplete();
        if (payment.getChange() > 0) {
            int change = payment.getChange();
            outputView.printChange(change);
        }
        musicThread.interrupt();
        outputView.printFinishMessage();
    }
}

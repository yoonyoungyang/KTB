public enum GoodsType {
    POSTER("poster"),
    STICKER_SMALL("Sticker Small"),
    STICKER_MEDIUM("Sticker Medium"),
    STICKER_LARGE("Sticker Large"),
    NONE("선택 안 함");

    private final String displayName;

    GoodsType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
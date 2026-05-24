public enum GoodsType {
    poster("poster"),
    Sticker_Small("Sticker Small"),
    Sticker_Medium("Sticker Medium"),
    Sticker_Large("Sticker Large"),
    NONE("선택 안 함");

    private final String displayName;

    GoodsType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
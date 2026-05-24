public enum MediaType {
    LP("LP"),
    CD("CD"),
    CASSETTE_TAPE("Cassette Tape");

    private final String displayName;

    MediaType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
public class Music {
    private String singer;
    private String songName;

    public Music(String singer, String songName) {
        this.singer = singer;
        this.songName = songName;
    }

    public String getMusicInfo() {
        return singer + " - " + songName;
    }
}
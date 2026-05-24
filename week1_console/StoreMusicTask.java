import java.util.List;

public class StoreMusicTask implements Runnable {
    private final List<Music> musics;

    public StoreMusicTask(List<Music> musics) {
        this.musics = musics;
    }

    @Override
    public void run() {
        System.out.println("매장 음악 스레드 시작");

        if (musics.isEmpty()) {
            System.out.println("재생할 매장 음악이 없습니다.");
            return;
        }

        int currentIndex = 0;

        while (!Thread.currentThread().isInterrupted()) {
            Music currentMusic = musics.get(currentIndex);

            System.out.println(
                    "\n♪ 현재 매장 음악: "
                            + currentMusic.getMusicInfo());

            currentIndex = (currentIndex + 1) % musics.size();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\n매장 음악 스레드를 종료합니다.");
                return;
            }
        }
    }
}
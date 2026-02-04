public class Playlist {
    private String name;
    private String[] songs;
    private int songCount;

    public Playlist(String name) {
        this.name = name;
        this.songs = new String[100]; // Initial capacity
        this.songCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount++] = song;
        } else {
            System.out.println("Playlist is full!");
        }
    }

    public String[] getSongs() {
        String[] currentSongs = new String[songCount];
        System.arraycopy(songs, 0, currentSongs, 0, songCount);
        return currentSongs;
    }
}
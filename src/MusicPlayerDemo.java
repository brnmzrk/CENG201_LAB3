/**
 * MusicPlayerDemo.java
 *
 * Tests the playlist
 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        // create the playlist object
        MusicPlaylist playlist = new MusicPlaylist();

        // Add songs
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();
        System.out.println();

        System.out.println("=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();
        System.out.println();

        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();

        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();

        System.out.println("=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();
        System.out.println();

        System.out.println("=== AFTER REMOVING Shape of You SONG ===");
        playlist.removeSong("Shape of You - Ed Sheeran");
        playlist.displayPlaylist();
        System.out.println();

        System.out.println("=== AFTER REMOVING Snap SONG ===");
        playlist.removeSong("Snap - Manifest");
        playlist.displayPlaylist();
    }
}
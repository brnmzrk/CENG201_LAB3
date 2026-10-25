/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        ______________________________
 * Your Student ID:  ______________________________
 * Your Date:        ______________________________
 */

public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
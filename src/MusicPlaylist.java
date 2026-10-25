/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        ______________________________
 * Your Student ID:  ______________________________
 * Your Date:        ______________________________
 */

public class MusicPlaylist {

    // instance variables
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // constructor
    public MusicPlaylist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        // if list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            // attach after tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove a song from the playlist
    public void removeSong(String title) {
        // 1. Search for the song
        SongNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                break;
            }
            temp = temp.next;
        }

        // 2. If the song does not exist
        if (temp == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        // print removed info
        System.out.println("Removed: " + temp.title);

        // 7. If we are removing the current song, adjust current pointer
        if (temp == current) {
            if (current.next != null) {
                current = current.next;
            } else {
                current = current.prev;
            }
        }

        // 5. Handle removing head
        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // list became empty
            }
        }
        // 6. Handle removing tail
        else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
        // node is in the middle
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // Move to the next song
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }

    // Move to the previous song
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    // Display the current song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.title);
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    // Display all songs
    public void displayPlaylist() {
        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
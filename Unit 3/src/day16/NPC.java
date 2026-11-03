package day16;

import java.util.ArrayList;

/**
 * A character the player can talk to in the text adventure game (NPC means non player character).
 * A character has a name, a greeting, and lines of conversation.
 * Each time the player talks to the character, it says the next thing:
 * the greeting first, then each line in the order it was added, then the greeting again.
 */
public class NPC {

    private String name;
    private String greeting;
    private ArrayList<String> lines;
    private int next;

    /** Creates a character with the given name and greeting, and no lines of conversation. */
    public NPC(String npcName, String npcGreeting) {
        name = npcName;
        greeting = npcGreeting;
        lines = new ArrayList<String>();
        next = 0;
    }

    /** Returns the character's name. */
    public String getName() {
        return name;
    }

    /** Returns the character's greeting. */
    public String getGreeting() {
        return greeting;
    }

    /** Adds a line of conversation after the lines already added. */
    public void addLine(String line) {
        lines.add(line);
    }

    /** Returns the number of lines of conversation (not counting the greeting). */
    public int lineCount() {
        return lines.size();
    }

    /** Returns the next thing the character says: the greeting, then each line in order, then the greeting again. */
    public String talk() {
        String said;
        if (next == 0) {
            said = greeting;
        } else {
            said = lines.get(next - 1);
        }
        next++;
        if (next > lines.size()) {
            next = 0;
        }
        return said;
    }
}

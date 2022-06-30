package src.Command;

import src.repository.NoteRepository;
import src.repository.impl.NoteRepositoryImpl;

public class CommandReader {

    private static final NoteRepository noteRepository =
            new NoteRepositoryImpl();

    /**
     * create note;
     * notes;
     * remove notes
     *
     * example: create note noteName noteText noteText noteText
     */
    public static int readCommand(String command) {


        if (command.contains("create note")) {
            return createNote(command);
        }
        if (command.contains("notes")) {
            return viewAllNotes(command);
        }
        if (command.contains("remove note")) {
            return remuveNote(command);
        }



    }
    private static int createNote (String command) {
        String[] words = command.split(" ");
        String noteName = words[2];

        StringBuilder noteTextSb = new StringBuilder();
        for (int i = 3; i < words.length; i++) {
            noteTextSb.append(words[i]);
        }

        String noteText = noteTextSb.toString();

    }

    public static int viewAllNotes(String command ) {

    }
    public static int remuveNote(String command) {

    }


}


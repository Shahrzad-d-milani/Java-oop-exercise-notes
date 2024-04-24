import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextNote textNote = new TextNote("Text Note", "This is a text note.");
        ChecklistNote checklistNote = new ChecklistNote("Checklist Note", "This is a checklist note.");
        checklistNote.addChecklistItem("Item 1");
        checklistNote.addChecklistItem("Item 2");
        DateNote dateNote = new DateNote("Date Note", "This is a date note.", "2024-04-23");

        ArrayList<Note> notes = new ArrayList<>();
        notes.add(textNote);
        notes.add(checklistNote);
        notes.add(dateNote);

        for (Note note : notes) {
            note.displayNoteDetails();
            System.out.println();
        }
    }
}

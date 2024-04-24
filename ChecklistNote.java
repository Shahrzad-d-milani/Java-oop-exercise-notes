import java.util.ArrayList;

public class ChecklistNote extends Note {
    private ArrayList<String> checklistItems;

    public ChecklistNote(String title, String content) {
        super(title, content);
        checklistItems = new ArrayList<>();
    }

    public void addChecklistItem(String item) {
        checklistItems.add(item);
    }

    public void removeChecklistItem(String item) {
        checklistItems.remove(item);
    }

    public void displayChecklist() {
        System.out.println("Checklist items:");
        for (String item : checklistItems) {
            System.out.println("- " + item);
        }
    }
}

public class DateNote extends Note {
    private String date;

    public DateNote(String title, String content, String date) {
        super(title, content);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void displayNoteDetails() {
        super.displayNoteDetails();
        System.out.println("Date: " + date);
    }
}

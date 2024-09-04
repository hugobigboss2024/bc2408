public class TestEditor {
    //word : append(), undo(), redo()
    private String test;
    public TestEditor() {
        this.test = "";
    }
    public void append(String word) {
        
        this.test += word;
    }
    public String undo() {
        String word = this.test;
        this.test = "";
        return word;
    }
    public String redo() {
        String word = this.test;
        this.test = "";
        return word;
    }
    @Override
    public String toString() {
        return " "+ this.test + " ";
    }
    public static void main(String[] args) {
        TestEditor editor = new TestEditor();
        editor.append("hello");
        editor.append("world");
        System.out.println(editor);
        editor.undo();
        System.out.println(editor);
        editor.redo();
        System.out.println(editor);
    }
}

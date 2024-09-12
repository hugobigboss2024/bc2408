package builderpattern;

public class Button {// 在 GUI 開發中，您可能需要組合多個屬性來創建複雜的 UI 組件。Builder Pattern 可以幫助清晰地設置這些屬性。
    private String test;
    private String color;
    private boolean isEnabled;

    private Buttom(ButtonBuilder builder){
        this.test = test;
        this.color = color;
        this.isEnabled = isEnabled;
    }

    public static class ButtonBuilder {
        private String test;
        private String color;
        private boolean isEnabled = true;

    }
}

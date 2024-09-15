package builderpattern;

public class Button {// 在 GUI 開發中，您可能需要組合多個屬性來創建複雜的 UI 組件。Builder Pattern 可以幫助清晰地設置這些屬性。
    private String test;
    private String color;
    private boolean isEnabled;

    private Button(ButtonBuilder builder) {
        this.test = builder.test;
        this.color = builder.color;
        this.isEnabled = builder.isEnabled;
    }

    public static class ButtonBuilder {
        private String test;
        private String color;
        private boolean isEnabled = true;

        public ButtonBuilder(String test) {
            this.test = test;
        }

        public ButtonBuilder color(String color) {
            this.color = color;
            return this;
        }

        public ButtonBuilder inEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Button button() {
            return new Button(this);
        }

    }

}

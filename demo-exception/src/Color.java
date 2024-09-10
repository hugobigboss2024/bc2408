public enum Color {
    RED('R'), GREEN('G'), BLUE('B'),;

    private char value;

    private Color(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }

    public static Color get(char value) {
        for (Color color : values()) {
            if (color.getValue() == value)
                return color;
        }
        throw new IllegalArgumentException(
                "char value is invalid. value=" + value + ".");
    }

    public static String concat(String s1, String s2) {
        if (s1 != null)
            return s1.concat(s2);
        throw new NullPointerException("s1 is null. NPE.");
    }

    public static void main(String[] args) {
        try {
            Color.get('r');
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // char value is invalid. value=r.
        }

        // Meaningless
        try {
            concat(null, "abc");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

}
package idea.src.TestMethod;

import java.util.ArrayList;

public class TestStatic {
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] sizes = { "3", "4", "5", "6", "7", "9", "10", "J", "Q", "K", "A", "2" };
        String[] colors = { "♠", "♥", "♦", "♣" };
        // ASCII "♠","♥","♦","♣"//or char a = '\u2660';can System out "♠"
        // 黑桃 (♠) 的 Unicode 是 U+2660
        // 紅心 (♥) 的 Unicode 是 U+2665
        // 方塊 (♦) 的 Unicode 是 U+2666
        // 梅花 (♣) 的 Unicode 是 U+2663
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = sizes[i] + colors[j];
                cards.add(card);
            }
        }
        cards.add("big jack");
        cards.add("small jack");

    }

    public static void main(String[] args) {
        System.out.println("54 cards: " + cards);

    }
}

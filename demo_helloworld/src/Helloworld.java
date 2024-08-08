public class Helloworld {
    public static void main(String[] args)  {
        // notes comments
        // tools
        System.out.println("Hello world");
        System.out.println("good");

        //teaching.  contains()
        String s1 = "hello";
        String s2 = "boss";
    System.out.println(s1.contains("ll"));
    System.out.println(s1.contains("bb"));
    System.out.println(s2.contains("os"));
    
    int first = 0, second = 1;

System.out.print(first + " " + second + " ");

for (int i = 0; i < 13; i++) {
    int next = first + second;
    System.out.print(next + " ");
    first = second;
    second = next;
}
    }
}

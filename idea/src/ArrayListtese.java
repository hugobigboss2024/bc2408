
import java.util.ArrayList;

public class ArrayListtese {
    public static void main(String[] args) {
       /*  ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");
        ArrayList<Integer> listtese = new ArrayList<>();
        listtese.add(1);
        listtese.add(2);
        listtese.add(3);
        listtese.add(4);
        String e = list.get(3);
        System.out.println(e);//grap
        int a = listtese.get(3).intValue();
        System.out.println(a);//4
        list.set(3, "kiwi");
        System.out.println(listtese.size());//4
        System.out.println(listtese.get(0));//1
        for(int i=0;i<listtese.size();i++){
            System.out.print(listtese.get(i));
        }
        String e2 = list.remove(2);
        System.out.println(e2);//orange
        System.out.println(list);//apple,banana,kiwi
        System.out.println(list.remove("apple"));
        list.set(3, "grape");
        *///////////////////////////////////
        ArrayList<Integer> Fraction = new ArrayList<>();//remove all <80
        Fraction.add(98);
        Fraction.add(77);
        Fraction.add(66);
        Fraction.add(89);
        Fraction.add(79);
        Fraction.add(50);
        Fraction.add(100);
        System.out.println(Fraction);
        for(int i = 0; i < Fraction.size(); i++){
            int score = Fraction.get(i);
            if(score < 80){
               Fraction.remove(i);
               i--;// rember ArrayList forloop need i--
            }
        }
        System.out.println(Fraction);
        /*for(int i = Fraction.size()-1; i >= 0; i--){//that forloop more good
            int score = Fraction.get(i);
            if(score < 80){
               Fraction.remove(i);
               // if this forloop then no need i--
            }
        }*/
        
        
    }
}

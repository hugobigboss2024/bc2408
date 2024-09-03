package listofstudent;
import java.util.ArrayList;
import java.util.Scanner;
public class JustForTest {
    public static void main(String[] args) {
        /*int[] arr = null;
        int[] arr1 = {};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(ArrayUtil.toString(arr));
        System.out.println(ArrayUtil.toString(arr1));
        System.out.println(ArrayUtil.toString(arr2));*/
        //////////////////////////////////////////
        //for Student3 test
        ArrayList<Stundent3> stundent = new ArrayList<>();
        stundent.add(new Stundent3("0000", "wong", 12, "1a"));
        stundent.add(new Stundent3("0001", "lee", 15, "2b"));
        stundent.add(new Stundent3("0002", "tang", 18, "3c"));
        stundent.add(new Stundent3("0003", "wan", 12, "1b"));
        stundent.add(new Stundent3("0004", "yin", 14, "2c"));
        for(int i = 0; i < stundent.size(); i++) {
            Stundent3 s4 = stundent.get(i);
            System.out.println(s4.getId() + "," + s4.getName() + "," + s4.getAge() + "," + s4.getClassname());
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("in put ID");
        String next = sc.next();
        Stundent3 st = getStundentByID(stundent, next);
        if(st == null){
          System.out.println("not found");
        }else{
            System.out.println(st.getId() + "," + st.getName() + "," + st.getAge() + "," + st.getClassname());
        }
    }

        


        
        

    }
    public static Stundent3 getStundentByID(ArrayList<Stundent3> stundent, String id) {
        for(int i = 0; i < stundent.size(); i++) {
            Stundent3 s = (Stundent3) stundent.get(i);
            if(s.getId().equals(id)) {
                return s;
            }
        }
        return null; 
    }
}

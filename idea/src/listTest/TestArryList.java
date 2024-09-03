package listTest;

import java.util.ArrayList;

public class TestArryList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();//object
        list.add(1);
        list.add(2.);
        list.add('3');
        System.out.println(list.get(0));
        //ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("wong");
        list3.add("lee");
        list3.add("tang");
        //System.out.println(list3.get(1));
        for(int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i));
        }
        for (int i = 0; i < list3.size(); i++) {//can do other things
            String s = list3.get(i);
            System.out.println(s);
        }
        
    }
}

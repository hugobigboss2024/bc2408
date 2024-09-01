

import java.util.Random;

public class FbookUtil {

    public static String makeCode(int n){
 String code = " ";
        String date = "abcdefghifklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(date.length());
             code +=date.charAt(index);
        }return  code;
    }    
    public static void main(String[] args) {
        System.out.println(makeCode(6));
    }
}

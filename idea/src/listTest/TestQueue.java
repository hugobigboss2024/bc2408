
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue{

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);//.ofter == .add??
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.toString());
        queue.poll();
        System.out.println(queue);
        int temp = queue.peek();//take queue[0]//remove the head
        System.out.println(temp);
        int del = queue.poll();//remove the head and del the queue[0]
        System.out.println(queue.isEmpty());//true. check the queue is it have anythings
        while (!queue.isEmpty()) {//check the queue[all] is it have anythings
            int temp2 = queue.poll();//if have copy to temp2 and del all 
            System.out.println(temp2);
        }
        




    }
}
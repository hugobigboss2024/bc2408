package listTest;

import java.util.Deque;
import java.util.LinkedList;

public class TestDeque {
    /*1. Queue (隊列)
定義
Queue 是一種先進先出（FIFO, First In First Out）數據結構，這意味著最先加入隊列的元素將是最先被移除的元素。
使用情況
排隊系統：例如，打印作業、客戶服務系統等。
任務排程：在多線程環境中，任務調度和執行。
廣度優先搜尋：在圖或樹的遍歷中。
優缺點
優點：
簡單易用，操作直觀。
提供了專門的方法來操作隊列，例如 offer(), poll(), peek() 等。
缺點：
只能在一端添加元素，而在另一端移除元素，無法在中間插入或刪除元素。
2. Deque (雙端隊列)
定義
Deque 是一種雙端隊列（Double Ended Queue），允許從兩端插入和刪除元素。這意味著您可以在隊列的前端和後端同時進行操作。
使用情況
棧（Stack）和隊列（Queue）的混合：需要同時支持先進先出和後進先出（LIFO, Last In First Out）操作時。
緩存：實現最近最少使用（LRU）緩存的場景。
回溯操作：在需要回溯的情況下，例如瀏覽器的歷史紀錄。
優缺點
優點：
提供了更靈活的操作，您可以從兩端添加或刪除元素。
支持所有 Queue 的操作，還可以進行更複雜的操作，如 addFirst(), addLast(), removeFirst(), removeLast() 等。
缺點：
相對於 Queue，實現可能更複雜，因為需要支持雙端操作。
總結
特性	    Queue	                    Deque
主要操作	先進先出（FIFO）	         雙端操作
添加/刪除	一端添加，一端刪除	          兩端皆可添加或刪除
使用情況	排隊系統、任務調度、圖遍歷	   緩存、回溯、混合棧和隊列
優點	    簡單易用	                  更靈活，支持多種操作
缺點	    限制於一端操作	              實現可能較複雜
選擇建議
如果您只需要基本的隊列操作並且只需從一端處理數據，則使用 Queue。
如果您需要靈活性，能夠從兩端進行操作，則使用 Deque。*/
    

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);
        deque.getFirst();//check first
        deque.getLast();//check last
        deque.peekFirst();//check first
        deque.peekLast();// check last
        deque.pollFirst();//del first
        deque.pollLast();//del last

    }
}

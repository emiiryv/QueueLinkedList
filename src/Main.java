import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //polimorfizm
        Queue<String> q = new LinkedList<>();
        q.add("Emir");
        q.add("Yv");
        q.add("xXx");
        q.offer("Deneme");

        q.remove("Yv");
        System.out.println(q.remove("Deneme"));
        System.out.println(q.element());

        System.out.println(q.poll());//kuyruğun başındaki elemanı yazdırır kuyruktan çıkarır
        System.out.println(q.peek());//kuyruğun başındaki elemanı gösterir kuyruktan çıkarmaz
        System.out.println("###################");
        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}